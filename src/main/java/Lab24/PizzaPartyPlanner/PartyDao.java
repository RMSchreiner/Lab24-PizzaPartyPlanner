package Lab24.PizzaPartyPlanner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional 
public class PartyDao {

	@PersistenceContext
	private EntityManager em;

	public List<Party> findAll() {

		// JPQL
		String sql = "select f FROM Party f";

		return em.createQuery(sql, Party.class).getResultList();

	}

	public Party findById(Long id) {

		return em.find(Party.class, id);

	}

	public void deleteById(Long id) {

		Party party = findById(id);
		em.remove(party);

	}

	public Party save(Party party) {

		if (party.getId() == null) {

			// CREATE NEW
			em.persist(party);

			return party;
		} else {

			// UPDATE
			return em.merge(party);	
		}
	}	
}
