package projeto.contaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Jaqueline Ferreira";
        String conta = "Corrente";
        double saldo = 2500;


        System.out.printf("""
                ******************************
                
                Dados iniciais do cliente:
                
                Nome:            %s
                Tipo conta:      %s
                Saldo inicial:   %.2f
                %n
                *******************************
                """, name, conta, saldo
        );

        String menu = """
                Operações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        System.out.println(menu);
        int entrada = scanner.nextInt();
        double movimentoDaConta = 0;


        while (entrada != 4){

            if (entrada == 1){
                System.out.println("seu saldo é de: " + saldo);
                System.out.println(menu);
                entrada =  scanner.nextInt();


            } else if (entrada == 2) {
                System.out.println("quanto deseja depositar?");
                movimentoDaConta = scanner.nextDouble();
                saldo += movimentoDaConta;
                System.out.println("seu saldo é de: " + saldo);
                System.out.println(menu);
                System.out.println("oque deseja agora?");
                entrada =  scanner.nextInt();

            } else if (entrada == 3) {

                System.out.println("quanto desejo transferir?");
                movimentoDaConta = scanner.nextDouble();

                if (movimentoDaConta <= saldo){
                    saldo -= movimentoDaConta;
                    System.out.println("transferido, seu saldo atual é de: " + saldo);
                    System.out.println(menu);
                    System.out.println("oque deseja agora?");
                    entrada =  scanner.nextInt();
                }else {
                    System.out.println("você não tem saldo...");
                    System.out.println(menu);
                    System.out.println("oque deseja agora?");
                    entrada =  scanner.nextInt();
                }

            } else {
                System.out.println("Operaçào invalida");
                System.out.println(menu);
                System.out.println("oque deseja agora?");
                entrada =  scanner.nextInt();

            }

            if (entrada == 4){
                System.out.println("Saindo...");
            }

        }
    }
}
