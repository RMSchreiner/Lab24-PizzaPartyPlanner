package Lab24.PizzaPartyPlanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PartyController {

	
	@Autowired
	private PartyRepository partyRepository;
	@Autowired
	private PartyOptionRepository partyOptionRepository;
	
		@RequestMapping("/")
		public String list(Model model) {
			model.addAttribute("party", partyRepository.findAll(Sort.by("name")));
			System.out.println(partyRepository.findAll(Sort.by("name")));
			return "home";
		}
		
		@RequestMapping("/home")
		public String home() {
			return "redirect:/";
		}
		
		
		
//		@RequestMapping("/review")
//		public String review() {
//			return "review";
//		}
		
		@RequestMapping("/review")
		public String listOption(Model model) {
			model.addAttribute("optionlist", partyOptionRepository.findAll(Sort.by("votes")));
			return "review";
		}
		
		
		
	
		// category parameter - collects inputs from form
//		@PostMapping("/add-category")
//		public String submitAddForm(Category category, Model model) {
//			categoryRepository.save(category);
//			model.addAttribute("category", category);
//			return "category-add-confirm";
//		}
		
	
	

}

