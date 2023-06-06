import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "Mark Zuckerberg";
        String tipoConta = "Corrente";
        double saldo = 5000.00;

        System.out.println("***************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************");

        /*O System.in é indicar que serão lidos dados do teclado*/
        Scanner leitura = new Scanner(System.in);
        String menu = """
                ** Digite sua opção **
                1 - Consultar Valor
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;
        int opcao = 0;
        while (opcao != 4) {

            System.out.println(menu);
            // O nextInt diz qual tipo de dado será lido. Nesse caso é um inteiro
            opcao = leitura.nextInt();
        }
    }
}
