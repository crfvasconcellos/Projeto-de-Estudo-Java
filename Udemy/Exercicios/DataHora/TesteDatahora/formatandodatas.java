package DataHora.TesteDatahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatandodatas {
    public static void main(String[] args) {


        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant   i1 = Instant.now();


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d1 = " + d1);
        System.out.println("d1 formatado1 = " + d1.format(fmt1));
        System.out.println("d2 formatado2 = " + d2.format(fmt2));
        System.out.println("Instant formatado3 = " + fmt3.format(i1));

        // Convertendo Instant em data local

        LocalDateTime r1 = LocalDateTime.ofInstant(i1,ZoneId.of("Asia/Hong_Kong"));

        System.out.println("i1 formatado1 = " + r1.format(fmt2));

    }
}
