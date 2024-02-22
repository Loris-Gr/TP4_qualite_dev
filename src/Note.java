public class Note {
    private String nomControle ;
    private int resultat ;

    public Note(int resultat, String nomControle) {
        this.resultat = resultat ;
        this.nomControle = nomControle ;
    }

    public String getNomControle() {
        return this.nomControle;
    }

    public int getResultat() {
        return this.resultat;
    }
}
