package desafio2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        var jonas = new Pessoa("jonas", 18);
        var carol = new Pessoa("carol", 31);
        var ali = new Pessoa("alicia", 18);


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(jonas);
        listaDePessoas.add(carol);
        listaDePessoas.add(ali);

        System.out.println("tamanho da lista: " + listaDePessoas.size());
        System.out.println("primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("lista completa de pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }
}
