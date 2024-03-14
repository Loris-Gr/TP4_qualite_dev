import java.util.List;
import java.util.ArrayList;
public class Stocker {
    List<Etudiant> lesEtudiants;
    List<Note> lesNotes;
    List<Cours> lesCours;

    public Stocker(List<Etudiant> lesEtudiants, List<Note> lesNotes, List<Cours> lesCours) {
        this.lesEtudiants = lesEtudiants;
        this.lesNotes = lesNotes;
        this.lesCours = lesCours;
    }

    public Stocker() {
        this.lesEtudiants = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
        this.lesCours = new ArrayList<>();
    }

    public List<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }

    public List<Note> getLesNotes() {
        return lesNotes;
    }

    public List<Cours> getLesCours() {
        return lesCours;
    }

    public void ajoutEtudiant(Etudiant etudiant) {
        lesEtudiants.add(etudiant) ;
    } 

    public void ajoutNote(Note note) {
        lesNotes.add(note) ;
    } 

    public void ajoutCours(Cours cours) {
        lesCours.add(cours) ;
    } 

    public boolean supprimerEtudiant(Etudiant etudiant) {
        if ( this.lesEtudiants.contains(etudiant)) {
            lesEtudiants.remove(etudiant);
            return true;
        }
    return false;
    }

    public boolean supprimerNote(Note note) {
        if ( this.lesNotes.contains(note)) {
            lesNotes.remove(note);
            return true;
            }
        return false;
        }

    public boolean supprimerCours(Cours cours) {
        if ( this.lesCours.contains(cours)) {
            lesCours.remove(cours);
            return true;
            }
        return false;
        }
}
