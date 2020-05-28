package Lab24.PizzaPartyPlanner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

import co.grandcircus.productcategories.entity.Product;

public interface PartyOptionRepository extends JpaRepository<PartyOption, Long> {
	
	List<PartyOption> findByPartyId(Long partyId);
	
	}
