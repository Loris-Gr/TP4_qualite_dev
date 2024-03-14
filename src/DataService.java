import java.util.List;
import java.util.ArrayList;
public class DataService {
private static DataService  instance ;
    List<Etudiant> lesEtudiants;
    List<Note> lesNotes;
    List<Cours> lesCours;

    public static DataService getInstance() {
        if (instance==null) {
            instance = new DataService();
        }
        return instance;
    }

    private DataService(List<Etudiant> lesEtudiants, List<Note> lesNotes, List<Cours> lesCours) {
        this.lesEtudiants = lesEtudiants;
        this.lesNotes = lesNotes;
        this.lesCours = lesCours;
    }

    private DataService() {
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
