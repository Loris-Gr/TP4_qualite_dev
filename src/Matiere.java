public enum Matiere {
    PYTHON,
    JAVA,
    BD,
    MATHS,
    BASH;

    public String toString() {
        if (this == PYTHON) {
            return "Python";
        }
        else if (this == JAVA) {
            return "Java";
        }
        else if (this == BD) {
            return "BD";
        }
        else if (this == MATHS) {
            return "Maths";
        }
        else {
        assert this == BASH;
            return "Bash";
        }
    }
}