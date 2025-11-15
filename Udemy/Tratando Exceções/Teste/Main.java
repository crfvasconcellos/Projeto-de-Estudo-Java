import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid Character");

        }

        System.out.println("End of program");






    }
}
