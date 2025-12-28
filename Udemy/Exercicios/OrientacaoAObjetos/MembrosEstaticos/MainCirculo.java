import java.util.Locale;
import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.printf("\nCircumference = %.2f ",
                Circulo.circunferencia(radius));
        System.out.printf("\nVolume = %.2f ", Circulo.volume(radius));
        System.out.printf("\n PI value = %.2f ", Circulo.PiValue());

        
    }
}
