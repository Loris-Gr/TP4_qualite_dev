import java.util.ArrayList;
import java.util.List;
public class Etudiant {
    private String prenom;
    private String nom;
    private int age;
    private List<Note> mesNotes;
    private List<Groupe> mesGroupes ;
    

    public Etudiant(String prenom, String nom, int age) {
        this.prenom = prenom ;
        this.nom = nom;
        this.age = age;
        this.mesNotes = new ArrayList<>();
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom ;
    }

    public int getAge() {
        return this.age;
    }

    public List<Note> getNotes() {
        return this.mesNotes ;
    }

    public List<Groupe> getGroupes() {
        return this.mesGroupes ;
    }

    public List<Note> getNotesParMatiere(Matiere matiere) {
        List<Note> lesNotes = new ArrayList<>() ;
        for (Note note : this.mesNotes) {
            if (note.getMatiere().equals(matiere)) {
                lesNotes.add(note) ;
            }
        }
        return lesNotes ;
    }
}
