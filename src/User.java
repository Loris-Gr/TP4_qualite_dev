public class User {
    private String nom;
    private String prenom;
    private String status;
    private int age;

    public User(String nom, String prenom, String status, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.status = status;
        this.age = age;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getStatus() {
        return this.status;
    }

    public int getAge() {
        return this.age;
    }

}