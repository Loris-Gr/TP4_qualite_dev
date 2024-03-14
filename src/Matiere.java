public enum Matiere {
    PYTHON ("Python"),
    JAVA ("Java"),
    BD ("BD"),
    MATHS ("Maths"),
    BASH ("Bash");

    private String nomMatiere ;


    private Matiere(String nomMatiere) {
        this.nomMatiere = nomMatiere ;
    }

    public String getMatiere() {
        return this.nomMatiere;
    }
}