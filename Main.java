import java.util.Scanner;

/*
Desafio Alura
Construir um app de banco com 4 operações.

Operações:
1- Consultar saldos
2- Receber valor
3- Transferir valor
4- sair

 */
public class Main {
    public static void main(String[] args) {
        String nome = "John Doe";
        String tipoConta = "corrente";
        double saldo = 2500.00;
        int opcao = 0;
        double transferencia = 0;

        System.out.println(nome + "\n" + saldo + "\n" + tipoConta);
        String menu = """
                ** Digite sua opção **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo + "\n");
            } else if (opcao == 2) {
                System.out.println("Informe o valor de transferência: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência. \n");
                } else {
                    saldo -= valor;
                    System.out.println(saldo);
                    System.out.println("Novo saldo: " + saldo + "\n");
                }
            } else if (opcao == 3) {
                System.out.println("Informe o valor de depósito: \n");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Escolha inválida \n");
            }
        }
    }
}