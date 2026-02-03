package TratamentoDeExcecoes.HotelReservas.src.application;

import TratamentoDeExcecoes.HotelReservas.src.model.entities.Reservation;
import TratamentoDeExcecoes.HotelReservas.src.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.println("Room nummber: ");
            int number = sc.nextInt();
            System.out.println("Check-in date (dd/mm/yyyy): ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number,checkin,checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.println("Check-in date (dd/mm/yyyy): ");
            checkin = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/mm/yyyy): ");
            checkout = sdf.parse(sc.next());

            Date now = new Date();
            reservation.updateDates(checkin,checkout);
            System.out.println("Reservation: " + reservation);

        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e ){
            System.out.println("Unxpected error");
        }

        sc.close();
    }
}
