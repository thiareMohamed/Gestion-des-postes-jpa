package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Poste {
    @Id
    @GeneratedValue
    private int id;
    private String libelle;
    @OneToMany(mappedBy = "id_poste")
    private List<Employe> personnes = new ArrayList<Employe>();

    public Poste() { }

    public Poste(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
