package desafio2;

public class Pessoa {

    private String name;

    private int age;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "meu nome é " + name + " e tenho " + age + " anos de idade";
    }
}
