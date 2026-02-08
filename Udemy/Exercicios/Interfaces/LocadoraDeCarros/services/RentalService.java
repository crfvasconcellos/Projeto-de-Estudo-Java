package Interfaces.LocadoraDeCarros.services;

import Interfaces.LocadoraDeCarros.entities.CarRental;
import Interfaces.LocadoraDeCarros.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;
    private TaxService taxService;


    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        Duration diff = Duration.between(carRental.getStart(),carRental.getFinish());
        double minutes  = diff.toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment =  pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }


}
