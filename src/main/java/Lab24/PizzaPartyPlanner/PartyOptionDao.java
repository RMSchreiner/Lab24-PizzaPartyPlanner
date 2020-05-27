package Lab24.PizzaPartyPlanner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


@Repository
@Transactional 
public class PartyOptionDao {

	@PersistenceContext
	private EntityManager em;

	public List<PartyOption> findAll() {

		// JPQL
		String sql = "select f FROM PartyOption f";

		return em.createQuery(sql, PartyOption.class).getResultList();

	}

	public PartyOption findById(Long id) {

		return em.find(PartyOption.class, id);

	}

	public void deleteById(Long id) {

		PartyOption partyoption = findById(id);
		em.remove(partyoption);

	}

	public PartyOption save(PartyOption partyoption) {

		if (partyoption.getId() == null) {

			// CREATE NEW
			em.persist(partyoption);

			return partyoption;
		} else {

			// UPDATE
			return em.merge(partyoption);	
		}	


	}	
}
