//localDateTime
//MARIN
<<<<<<< HEAD
=======
import java.util.localDateTime;
>>>>>>> main
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;


public class Horaire{
    private String dateDeb;
    private String dateFin;
    private List<Salle> lesSalles;
    private List<Cours> lesCours;
<<<<<<< HEAD
    private Map<Salle, Horaire> salleCours;
=======
    private Map<Salle, Cours> salleCours;
>>>>>>> main

    public Horaire(String dateDebut, String dateFin) {
        this.lesSalles = new ArrayList<Salle>();
        this.lesCours = new ArrayList<Cours>();
<<<<<<< HEAD
        Map<Salle, Horaire> salleCours = new HashMap<>();
    }

    public String getDateDeb() {
        return this.dateDeb;
    }

    public String getDateFin() {
=======
        Map<Salle, Cours> salleCours = new HashMap<>();
    }

    public localDateTime getDateDeb() {
        return this.dateDeb;
    }

    public localDateTime getDateFin() {
>>>>>>> main
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

<<<<<<< HEAD
    public List<Cours> combienCoursHeure(String heureDeb, String heureFin) {
=======
    public List<Cours> combienCoursHeure(localDateTime heureDeb, localDateTime heureFin) {
>>>>>>> main
        ArrayList<>() lesCoursHeure = new ArrayList<Cours>();
        for (Cours coursH : lesCours) {
            if (coursH.getHoraire().getDateDeb().equals(heureDeb) && coursH.getHoraire().getDateFin().equals(heureFin)) {
                lesCoursHeure.add(coursH);
            }
        }
        return lesCoursHeure;
    }

    public String relierCoursSalles(Salle salle, Cours cours) {
<<<<<<< HEAD
        if (salleCours.containsValue(cours.getHoraire())) {
            return "impossible";
        }
        else {
            salleCours.put(salle, cours.getHoraire());
            return "fait";
        }
    }

=======
        salleCours.putIfAbsent(salle, cours);
    }
>>>>>>> main
}
