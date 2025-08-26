import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        int numeroFuncion, horasTrabalhadas;
        double valorPorHora, salario;


        numeroFuncion = leitor.nextInt();

        horasTrabalhadas = leitor.nextInt();

        valorPorHora = leitor.nextDouble();

        salario = (double) horasTrabalhadas *  valorPorHora;

        System.out.println("NUMBER = " + numeroFuncion);
        System.out.printf(Locale.US,"SALARY = U$ %.2f\n",salario);


    }
}
