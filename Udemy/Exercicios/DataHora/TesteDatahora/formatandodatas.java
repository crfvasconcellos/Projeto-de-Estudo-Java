package DataHora.TesteDatahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formatandodatas {
    public static void main(String[] args) {


        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("d1 = " + d1);
        System.out.println("\n d1 formatado1 = " + d1.format(fmt1));
        System.out.println("\n d1 formatado2 = " + d2.format(fmt2));


    }
}
