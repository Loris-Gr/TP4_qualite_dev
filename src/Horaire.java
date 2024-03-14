//localDateTime
//MARIN
import java.util.localDateTime;
import java.util.List;
import java.util.ArrayList;


public class Horaire{
    private localDateTime dateDeb;
    private localDateTime dateFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;

    public Horaire(String dateDebut, String dateFin) {
        this.lesSalles = new ArrayList<Salle>();
        this.lesCours = new ArrayList<Cours>();
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

    public int combienCoursHeure(localDateTime heureDeb, localDateTime heureFin) {
        ArrayList<>() lesCoursHeure = new ArrayList<Cours>();
        for (Cours coursH : lesCours) {
            if (coursH.getHoraire().getDateDeb().equals(heureDeb) && coursH.getHoraire().getDateFin().equals(heureFin)) {
                lesCoursHeure.add(coursH);
            }
        }
        return lesCoursHeure;
    }
}
