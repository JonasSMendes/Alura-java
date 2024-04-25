package aula6Ex;

public class Movie {

    public String name;
    public int year;
    public boolean isPlan;
    private double somaValidation;
    private int allValidation;

    void exibeFichaTecnica(){
        System.out.println("nome do filme: " + name);
        System.out.println("ano de lançamento: " + year);
    }

    void avalia(double nota){
        somaValidation += nota;
        allValidation++;
    }
    
    double mediaValidatio(){
        return somaValidation / allValidation;
    }

    public double getSomaValidation() {
        return somaValidation;
    }

    public void setSomaValidation(double somaValidation) {
        this.somaValidation = somaValidation;
    }

    public int getAllValidation() {
        return allValidation;
    }

    public void setAllValidation(int allValidation) {
        this.allValidation = allValidation;
    }
}
