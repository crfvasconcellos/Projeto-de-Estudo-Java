import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int terceirolink;

        Scanner sc = new Scanner(System.in);

        terceirolink = sc.nextInt();

        int primeiroLink = terceirolink * 4;

        System.out.println(primeiroLink);
    }
}