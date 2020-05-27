package Lab24.PizzaPartyPlanner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PartyController {

	
//	@Autowired
//	private PartyRepository repository;
	
	
	@RequestMapping("/")
	public String index() {

		return "home";
	}
	
	
	
	
	
//	@RequestMapping("/food")
//	public String listFood(@RequestParam(value="keyword",required=false) String keyword,Model model) {
//
//		// TODO: add entire list of foods
//		
//		if(keyword != null && !keyword.isEmpty()) {
//			
//			List<Food> foodList = repository.findByNameContainingIgnoreCase(keyword);
//			model.addAttribute("foodList", foodList);
//			
//		}else {
//			
//			List<Food> foodList = repository.findAll();
//			model.addAttribute("foodList", foodList);
//			
//		}
//		
//		
//		
//		return "list-food";
//	}
//	
//	/*
//	 * 
//	 * 
//	 */
//	
//	@RequestMapping("/food/create")
//	public String showCreateForm(Model model) {
//		
//		
//		model.addAttribute("title","Add a Food");
//		return "food-form";
//	}
//	
//	@PostMapping("/food/create")
//	public String submitCreateForm(Food food) {
//		
//		// TODO: create
//		System.out.println(food);
//		
//		repository.save(food);
//		
//		return "redirect:/food";
//	}
//	
//	/*
//	 * 
//	 * 
//	 */
//	
//	@RequestMapping("/food/update")
//	public String showEditForm(@RequestParam(value="id",required=false) Long id, Model model) {
//		
//		//TODO
//		
//		// findById returns an Optional<Type>
//		// we must give a default value (if no instance is found)
//		Food food = repository.findById(id).orElse(null);
//		
//		model.addAttribute("food",food);
//		model.addAttribute("title","Edit a Food");
//		return "food-form";
//	}
//	
//	@PostMapping("/food/update")
//	public String submitEditForm(Food food) {
//		
//		// TODO: update
//		repository.save(food);
//		
//		return "redirect:/food";
//	}
//	
//	@RequestMapping("/food/delete/{id}")
//	public String removeFood(@PathVariable("id") Long id) {
//		
//		// TODO: delete
//		repository.deleteById(id);
//		
//		return "redirect:/food";
//	}
	
	

}

