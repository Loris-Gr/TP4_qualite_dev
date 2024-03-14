import java.util.List;
import java.util.ArrayList;
public class DataService {
private static DataService  instance ;
    List<Etudiant> lesEtudiants;
    List<Note> lesNotes;
    List<Cours> lesCours;
    List<Salle> lesSalles;
    List<Groupe> lesGroupes;
    List<Horaire> lesHoraires;
    List<User> lesUsers;

    public static DataService getInstance() {
        if (instance==null) {
            instance = new DataService();
        }
        return instance;
    }

    private DataService(List<Etudiant> lesEtudiants, List<Note> lesNotes, List<Cours> lesCours, List<Salle> lesSalles, List<Groupe> lesGroupes, List<Horaire> lesHoraires, List<User> lesUsers) {
        this.lesEtudiants = lesEtudiants;
        this.lesNotes = lesNotes;
        this.lesCours = lesCours;
        this.lesSalles = lesSalles;
        this.lesGroupes = lesGroupes;
        this.lesHoraires = lesHoraires;
        this.lesUsers = lesUsers;
    }

    private DataService() {
        this.lesEtudiants = new ArrayList<>();
        this.lesNotes = new ArrayList<>();
        this.lesCours = new ArrayList<>();
        this.lesSalles = new ArrayList<>();
        this.lesGroupes = new ArrayList<>();
        this.lesHoraires = new ArrayList<>();
        this.lesUsers = new ArrayList<>();
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

    public List<Salle> getLesSalles() {
        return lesSalles;
    }

    public List<Groupe> getLesGroupes() {
        return lesGroupes;
    }

    public List<Horaire> getLesHoraires() {
        return lesHoraires;
    }

    public List<User> getLesUsers() {
        return lesUsers;
    }

    public void ajoutEtudiant(Etudiant etudiant) {
        lesEtudiants.add(etudiant) ;
    } 

    public void ajoutNote(Note note) {
        lesNotes.add(note) ;
    } 

    public void ajoutSalle(Salle salle) {
        lesSalles.add(salle) ;
    } 

    public void ajoutGroupe(Groupe groupe) {
        lesGroupes.add(groupe) ;
    }

    public void ajoutHoraire(Horaire horaire) {
        lesHoraires.add(horaire) ;
    }

    public void ajoutUser(User user) {
        lesUsers.add(user) ;
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

    public boolean supprimerSalle(Salle salle) {
        if ( this.lesSalles.contains(salle)) {
            lesSalles.remove(salle);
            return true;
            }
        return false;
        }
    
    public boolean supprimerGroupe(Groupe groupe) {
        if ( this.lesGroupes.contains(groupe)) {
            lesGroupes.remove(groupe);
            return true;
            }
        return false;
        }

    public boolean supprimerHoraire(Horaire horaire) {
        if ( this.lesHoraires.contains(horaire)) {
            lesHoraires.remove(horaire);
            return true;
            }
        return false;
        }

    public boolean supprimerUser(User users) {
        if ( this.lesUsers.contains(users)) {
            lesUsers.remove(users);
            return true;
            }
        return false;
        }
    }
