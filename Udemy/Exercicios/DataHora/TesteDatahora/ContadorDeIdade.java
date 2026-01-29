package DataHora.TesteDatahora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ContadorDeIdade {
    public static void main(String[] args) {


        LocalDateTime today = LocalDateTime.now();

        LocalDateTime birth = LocalDateTime.of(2006,01,10,19,00);


        Period age = Period.between(birth.toLocalDate(),today.toLocalDate());

        LocalDateTime rest = birth.plusYears(age.getYears()).plusMonths(age.getMonths()).plusDays(age.getDays());

        Duration agrmin = Duration.between(rest,today);

        long agehours = agrmin.toHours();
        long ageminutes = agrmin.toMinutes() % 60;
        long ageseconds = agrmin.toSeconds() % 60 ;


        System.out.printf("\nEu tenho %s anos, %s meses, %s dias, %s horas, %s minutos e %s segundos de vida\n",age.getYears(),age.getMonths(),age.getDays(),agehours,ageminutes,ageseconds);






    }
}
