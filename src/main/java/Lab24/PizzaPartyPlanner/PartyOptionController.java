package Lab24.PizzaPartyPlanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class PartyOptionController {

	@RequestMapping("/")
	public String index() {

		return "home";
	}
	
	
	//@Autowired
	//private PartyOptionRepository repository;
	
	
	
}
