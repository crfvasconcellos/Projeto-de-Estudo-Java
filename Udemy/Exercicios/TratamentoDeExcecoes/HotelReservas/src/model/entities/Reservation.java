package TratamentoDeExcecoes.HotelReservas.src.model.entities;

import TratamentoDeExcecoes.HotelReservas.src.model.exceptions.DomainException;

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

    public Reservation(int roomNumber, Date checkin, Date checkout) throws DomainException {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkout.after(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");

        }
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

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");

        }
        this.checkin = checkIn;
        this.checkout = checkOut;

    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Room ").append(roomNumber).append(", check-in: ").append(sdf.format(checkin)).append(", check-out: ").append(sdf.format(checkout)).append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
