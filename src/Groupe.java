import java.util.ArrayList;
import java.util.List;
public class Groupe {
    private String nomGroupe;
    private List<Etudiant> lesEtudiants;

    public Groupe(String nomGroupe) {
        this.nomGroupe = nomGroupe ;
        this.lesEtudiants = new ArrayList<>();
    } 

    public Groupe(String nomGroupe, List<Etudiant> lesEtudiants) {
        this.nomGroupe = nomGroupe ;
        this.lesEtudiants = lesEtudiants;
    }

    public String getNom() {
        return this.nomGroupe ;
    }

    public List<Etudiant> getEtudiants() {
        return this.lesEtudiants;
    }
}