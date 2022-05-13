package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {

    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String prenom;
    private int age;

    @ManyToOne
    private Poste id_poste = new Poste();

    public Employe() { }

    public Employe(int id, String nom, String prenom, int age, Poste id_poste) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.id_poste = id_poste;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Poste getId_poste() {
        return id_poste;
    }

    public void setId_poste(Poste id_poste) {
        this.id_poste = id_poste;
    }

    public void setId_poste(int i) {
    }
}
