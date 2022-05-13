package sn.thiare.dao;

import java.util.List;

import sn.thiare.entities.Personne;

public interface IPersonne {

	public int create(Personne personne);
	public int delete(int id);
	public int update(Personne personne);
	public List<Personne> getAll();
	public Personne getId(int id);
}
