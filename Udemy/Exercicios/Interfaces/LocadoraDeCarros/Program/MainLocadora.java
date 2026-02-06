package Interfaces.LocadoraDeCarros.Program;

import Interfaces.LocadoraDeCarros.entities.CarRental;
import Interfaces.LocadoraDeCarros.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainLocadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.println("Retirada (dd/mm/yyyy hh:mm ): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Retorno (dd/mm/yyyy hh:mm ): " );
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(retirada,retorno,new Vehicle(modelo));

    }
}
