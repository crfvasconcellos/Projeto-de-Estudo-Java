import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("======= Dados do Cliente ======= ");
        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Qual o seu tipo de Conta?\n (1)-Corrente\n (2)" +
                "-Poupança\n R: " );

        int tipodeconta = leitor.nextInt();

        System.out.println("Qual o seu saldo na conta? ");
        double saldo = leitor.nextDouble();

        while (true){
            System.out.println("==================\nDados Cadastrados\n==================");
            System.out.println(String.format("Nome: %s ",nome));
            if (tipodeconta==1){
                System.out.println("Tipo de Conta: Corrente");
            } else if (tipodeconta==2) {
                System.out.println("Tipo de Conta: Poupança");

            }
            System.out.println(String.format("Saldo Inicial: %.2f",saldo));

            System.out.println("\nOperações\n 1- Consultar saldos \n 2- " +
                    "Receber Valor\n 3-Transferir Valor\n 4- Sair\n Digite a " +
                    "opcção desejada: ");
            int escolha = leitor.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("O saldo da conta é de "+saldo);
                    break;

                case 2:
                    System.out.println("Informe o Valor a Receber: ");
                    double valor = leitor.nextDouble();
                    saldo= saldo + valor;
                    System.out.println("Valor Recebido com Sucesso!\n Agora " +
                            "Seu saldo é de "+saldo);
                    break;

                case 3:
                    System.out.println("Qual Valor deseja Transferir:");
                    double transferencia = leitor.nextDouble();
                    if (transferencia>saldo){
                        System.out.println("O valor é maior que o saldo, a " +
                                "transferência é inválida! \n Tente " +
                                "Novamente!");
                        break;
                    }
                    saldo = saldo -transferencia;
                    System.out.println("Valor Transferido com Sucesso!\n " + "Agora " + "Seu saldo é de "+saldo);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Valor Inválido! Tente Novamente!");
            }

            if (escolha== 4){
                break;
            }



        }
        System.out.println("Programa Encerrado!");
    }
}
