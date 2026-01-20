package DataHora.TesteDatahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class maindata {
    public static void main(String[] args) {

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant dateinstant = Instant.now();
        LocalDate aniversario = LocalDate.parse("2026-01-10");
        LocalDateTime aniversario2 = LocalDateTime.parse("2026-01-10T19:00:00");

        Instant d08 = Instant.parse("2026-07-07T08:30:10-03:00");

        LocalDate d09 = LocalDate.parse("10/01/2006",formato1);
        LocalDateTime d10 = LocalDateTime.parse("10/01/2006 01:30",formato2);

        LocalDate d11 = LocalDate.of(2012,8,2);
        LocalDateTime d12 = LocalDateTime.of(2012,8,2,19,30);


        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(dateinstant);
        System.out.println(aniversario);
        System.out.println(aniversario2);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
        System.out.println(d12);




    }
}
