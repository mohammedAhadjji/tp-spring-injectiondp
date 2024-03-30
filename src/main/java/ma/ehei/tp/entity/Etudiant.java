package ma.ehei.tp.entity;

public class Etudiant {

    public String id;

    private String nom;
    private String prenom;


    public Etudiant(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPreom() {
        return prenom;
    }

    public void setPreom(String prenom) {
        this.prenom = prenom;
    }

}
