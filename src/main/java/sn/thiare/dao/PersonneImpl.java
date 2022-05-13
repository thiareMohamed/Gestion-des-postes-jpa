package sn.thiare.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.thiare.entities.Personne;

public class PersonneImpl implements IPersonne{

	private EntityManager em;
	public PersonneImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
	}
	
	@Override
	public int create(Personne personne) {
		try {
			em.getTransaction().begin();			
			em.persist(personne);
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
			em.remove(em.find(Personne.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int update(Personne personne) {
		try {
			em.getTransaction().begin();			
			em.merge(personne);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Personne> getAll() {
		try {
			return em.createQuery("SELEC c FROM PERSONNE c").getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Personne getId(int id) {
		try {
			return em.find(Personne.class, id);
		} catch (Exception e) {
			return null;
		}
	}
	
	
}
