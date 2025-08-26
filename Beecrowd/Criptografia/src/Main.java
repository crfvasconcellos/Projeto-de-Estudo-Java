import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int linhas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < linhas; i++) {

            String codigo = sc.nextLine();

            StringBuilder sb = new StringBuilder(codigo);

            for (int j = 0; j < sb.length(); j++) {
                int letra = sb.charAt(j);
                if (Character.isLetter(letra)) {
                    sb.setCharAt(j, (char) (letra + 3));
                }
            }

            sb.reverse();

            for (int j = (sb.length()/2); j < sb.length(); j++) {
                int letra = sb.charAt(j);
                sb.setCharAt(j, (char) (letra - 1));
            }


            System.out.println(sb.toString());


        }
    }
}