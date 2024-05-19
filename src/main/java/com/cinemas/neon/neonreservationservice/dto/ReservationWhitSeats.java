package com.cinemas.neon.neonreservationservice.dto;

import java.util.List;

import com.cinemas.neon.neonreservationservice.entity.Reservation;
import com.cinemas.neon.neonreservationservice.entity.SeatReserved;

public class ReservationWhitSeats {
    private Reservation reservation;
    private List<SeatReserved> seatsReserved;

    public ReservationWhitSeats(Reservation reservation, List<SeatReserved> seatsReserved) {
        this.reservation = reservation;
        this.seatsReserved = seatsReserved;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public List<SeatReserved> getSeatsReserved() {
        return seatsReserved;
    }

    public void setSeatsReserved(List<SeatReserved> seatsReserved) {
        this.seatsReserved = seatsReserved;
    }
}
