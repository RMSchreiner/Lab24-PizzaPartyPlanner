package Lab24.PizzaPartyPlanner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyOptionRepository extends JpaRepository<PartyOption, Long> {

    List<PartyOption> findByDescription(String description);
	
	
	List<PartyOption> findByNameContainingIgnoreCase(String name);
	
}
