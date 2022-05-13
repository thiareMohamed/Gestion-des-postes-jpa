package sn.thiare.dao;

import java.util.List;

import sn.thiare.entities.Poste;

public interface IPoste {
	public int create(Poste poste);
	public int delete(int id);
	public int update(Poste poste);
	public List<Poste> getAll();
	public Poste getId(int id);
}
