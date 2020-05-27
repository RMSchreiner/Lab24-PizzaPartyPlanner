package Lab24.PizzaPartyPlanner;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long>{
	
    List<Party> findByDate(String date);
	
	
	List<Party> findByNameContainingIgnoreCase(String name);

}


