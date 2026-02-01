package TratamentoDeExcecoes.HotelReservas.src.model.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private int roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }

    public long duration(){
        long duracaoMillis = checkout.getTime() - checkin.getTime();

        return TimeUnit.DAYS.convert(duracaoMillis,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin,Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Room ").append(roomNumber).append(", check-in: ").append(sdf.format(checkin)).append(", check-out: ").append(sdf.format(checkout)).append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
