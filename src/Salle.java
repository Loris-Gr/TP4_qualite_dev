//MARIN

public class Salle {
    private int numSalle;
    private int capacite;
    private User user;

    public Salle(int numeroSalle, int capacite, User user) {
        this.numSalle = numeroSalle;
        this.capacite = capacite;
        this.user = user;
    }

    public int getNumSalle() {
        return this.numSalle;
    }

    public int getCapaSalle() {
        return this.capacite;
    }
}
                                                                                                                                    