public class Note {
    private String nomControle ;
    private int resultat ;
    private Matiere matiere;
    private Etudiant etudiant;

    public Note(int resultat, String nomControle, Matiere matiere, Etudiant etudiant) {
        this.resultat = resultat ;
        this.nomControle = nomControle ;
        this.matiere = matiere ;
        this.etudiant = etudiant;
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

    public Etudiant getEtudiant() {
        return this.etudiant;
    }
}
