package com.cinemas.neon.neonreservationservice.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemas.neon.neonreservationservice.dao.ReservationDao;
import com.cinemas.neon.neonreservationservice.dto.ReservationWhitSeats;
import com.cinemas.neon.neonreservationservice.entity.Reservation;
import com.cinemas.neon.neonreservationservice.entity.SeatReserved;

@Service
public class ReservationService {

    @Autowired
    ReservationDao reservationDao;

    @Autowired
    SeatReservedService seatService;

    public Optional<Reservation> getReservation(UUID id) {
        return reservationDao.findById(id);
    }

    @Transactional
    public Reservation saveReservation(ReservationWhitSeats reservationWhitSeats) {
        Reservation reservation = reservationDao.save(reservationWhitSeats.getReservation());

        for (SeatReserved seatReserved : reservationWhitSeats.getSeatsReserved()) {
            seatReserved.setReservation(reservation);
            seatService.saveSeatReserved(seatReserved);
        }

        return reservation;
    }
}
