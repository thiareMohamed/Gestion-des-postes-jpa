package sn.thiare.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.thiare.entities.Poste;

public class PosteImpl implements IPoste{

	private EntityManager em;
	public PosteImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
	}

	@Override
	public int create(Poste poste) {
		try {
			em.getTransaction().begin();			
			em.persist(poste);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.getTransaction().begin();			
			em.remove(em.find(Poste.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int update(Poste poste) {
		try {
			em.getTransaction().begin();			
			em.merge(poste);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Poste> getAll() {
		try {
			return em.createQuery("SELEC c FROM POSTE c").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Poste getId(int id) {
		try {
			return em.find(Poste.class, id );
		} catch (Exception e) {
			return null;
		}
	}

}
