public class Note {
    private String nomControle ;
    private int resultat ;
    private Matiere matiere;

    public Note(int resultat, String nomControle, Matiere matiere) {
        this.resultat = resultat ;
        this.nomControle = nomControle ;
        this.matiere = matiere ;
    }

    public String getNomControle() {
        return this.nomControle;
    }

    public int getResultat() {
        return this.resultat;
    }

    public Matiere getMatiere() {
        return this.matiere;
    }
}