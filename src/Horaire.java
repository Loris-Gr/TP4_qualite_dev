//localDateTime
//MARIN
import java.util.localDateTime;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Horaire{
    private localDateTime dateDeb;
    private localDateTime dateFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;
    private Map<Salle, Cours> salleCours;

    public Horaire(String dateDebut, String dateFin) {
        this.lesSalles = new ArrayList<Salle>();
        this.lesCours = new ArrayList<Cours>();
        Map<Salle, Cours> salleCours = new HashMap<>();
    }

    public localDateTime getDateDeb() {
        return this.dateDeb;
    }

    public localDateTime getDateFin() {
        return this.dateFin;
    }

    public List<Salle> getLesSalles() {
        return this.lesSalles;
    }

    public List<Cours> getLesCours() {
        return this.lesCours;
    }

    public void ajouteSalle(Salle salle) {
        this.lesSalles.add(salle);
    }

    public void ajouteCours(Cours cours) {
        this.lesCours.add(cours);
    }

    public int combienCours() {
        return this.lesCours.size();
    }

    public int combienSalles() {
        return this.lesSalles.size();
    }

    public List<Cours> combienCoursHeure(localDateTime heureDeb, localDateTime heureFin) {
        ArrayList<>() lesCoursHeure = new ArrayList<Cours>();
        for (Cours coursH : lesCours) {
            if (coursH.getHoraire().getDateDeb().equals(heureDeb) && coursH.getHoraire().getDateFin().equals(heureFin)) {
                lesCoursHeure.add(coursH);
            }
        }
        return lesCoursHeure;
    }

    public String relierCoursSalles(Salle salle, Cours cours) {
        salleCours.putIfAbsent(salle, cours);
    }
}
