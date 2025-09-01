package ExerciciosEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a > 0 & b > 0){
            System.out.println("Q1");
        } else if (a > 0 & b < 0) {
            System.out.println("Q4");
        } else if (a<0 & b> 0) {
            System.out.println("Q2");
        } else if (a<0 & b<0) {
            System.out.println("Q3");
            
        }
        else {
            System.out.println("Origem");
        }
    }
}
