package Lab24.PizzaPartyPlanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.productcategories.dao.CategoryRepo;


@Controller
public class PartyOptionController {

		@Autowired
		private PartyOptionRepository partyOptionRepository;
		@Autowired
		private PartyRepository partyRepository;
	
	
	@RequestMapping("/vote")
	public String list(Model model) {
		model.addAttribute("partyoption", partyOptionRepository.findAll(Sort.by("name")));
		return "vote";
	}
	
	@RequestMapping("/voteadd")
	public String addVote(@RequestParam(value="id",required=true) Long id,
			              @RequestParam(value="votes",required=true)Integer votes,PartyOption partyoption, Model model)
	{        partyoption.setVotes(votes + 1);
	         partyoption.setId(id);
		    // partyOptionRepository.deleteById(id);
		     partyOptionRepository.save(partyoption);           
             return "redirect:vote";
	}	
	
	@RequestMapping("/democracy-by-party")
	public String pizzaList(@RequestParam("Party") Long partyId, Model model) {
		model.addAttribute("listofpizza", partyOptionRepository.findByPartyId(partyId));
		return "product-list";
	}
	
	@RequestMapping("/democracy-by-party")
	public String voteOption() {
		return "/vote";
	}
	
	
	
	@RequestMapping("/optionadd")
	public String optionAdd(@RequestParam(value="name",required=true) String name,
			                @RequestParam(value="description", required = true) String description, 
			                PartyOption partyoption, Model model) {
		 if (name.equals(null) || description.equals(null)) {
			return "redirect.vote";
                }
		 else {
		    partyoption.setName(name);
		    partyoption.setDescription(description);
		    partyoption.setVotes(0);
		    partyOptionRepository.save(partyoption);
		
             return "redirect:vote";}	
}
	
}
