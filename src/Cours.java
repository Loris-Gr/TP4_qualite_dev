public class Cours {
    private Matiere matiere;
    private Horaire horaire;
    private Groupe groupe;
    private User user;

    public Cours(Matiere matiere, Horaire horaire, Groupe groupe, User user) {
        this.matiere = matiere;
        this.horaire = horaire;
        this.groupe = groupe;
        this.user = user;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }

    public Horaire getHoraire() {
        return this.horaire;
    }

    public Groupe getGroupe() {
        return this.groupe;
    }

    public User getUser() {
        return this.user;
    }
}
