//caixa de produtos

package desafio4.principal;

import desafio4.modelos.Compras;
import desafio4.modelos.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Compras>listaDeCompras = new ArrayList<>();

        Usuario user = new Usuario();

        System.out.println("Bem-vindo a loja de tudo");

        int menuControle = 0;
        int valorDeCompra = 0;
        int limiteDoCartao = 0;
        int saldoDoCartao = 0;
        String nomeDoproduto;


        while (menuControle != 1){


            if (limiteDoCartao == 0){
                System.out.println("qual o limite do seu cartão?");
                limiteDoCartao = scanner.nextInt();
                user.setLimiteDeDinheiro(limiteDoCartao);
                scanner.nextLine();
            }

            if (user.getLimiteDeDinheiro() > 0) {

                System.out.println("qual o nome do produto que deseja?");
                nomeDoproduto = scanner.nextLine();

                System.out.println("qual o valor do produto?");
                valorDeCompra = scanner.nextInt();


                if (limiteDoCartao >= valorDeCompra){

                    saldoDoCartao += valorDeCompra;
                    limiteDoCartao -= valorDeCompra;

                    Compras compra = new Compras(nomeDoproduto,valorDeCompra);
                    listaDeCompras.add(compra);
                    System.out.println("compra realizada com sucesso");

                }else {
                    System.out.println("voce não tem credito");
                    break;
                }
            }

            System.out.println("digite 1 para sair e ver suas compras e 0 para continuar comprando");
            menuControle = scanner.nextInt();
            scanner.nextLine();



        }

        listaDeCompras.sort(Comparator.comparing(Compras::getPrice));
        System.out.println("""
                **************************************
                
                COMPRAS REALIZADAS:
                
                """);
        for (Compras compra : listaDeCompras) {
            System.out.println(compra);
        }

        System.out.println("""
                
                            
                Saldo final das compras: %s
                
                **************************************
                """.formatted(saldoDoCartao));

    }
}
