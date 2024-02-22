import java.util.ArrayList;
import java.util.List;
public class Etudiant {
    private String prenom;
    private String nom;
    private int age;
    private List<Note> mesNotes;
    

    public Etudiant(String prenom, String nom, int age) {
        this.prenom = prenom ;
        this.nom = nom;
        this.age = age;
        this.mesNotes = new ArrayList<>();
    }
}
