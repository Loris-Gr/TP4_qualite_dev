//localDateTime
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

    public void ajouteSalle(Salle salle) {
        this.lesSalles.add(salle);
    }

    public void ajouteCours(Cours cours) {
        this.lesCours.add(cours);
    }

    
}
