package com.cinemas.neon.neonreservationservice.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.neon.neonreservationservice.dto.ReservationWhitSeats;
import com.cinemas.neon.neonreservationservice.entity.Reservation;
import com.cinemas.neon.neonreservationservice.service.ReservationService;

@RestController
@RequestMapping("/reserve")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @PostMapping(path = "")
    public Reservation saveReservation(@RequestBody ReservationWhitSeats reservationWhitSeats) {
        return reservationService.saveReservation(reservationWhitSeats);
    }

    @GetMapping(path = "/{id}")
    public Optional<Reservation> getReservation(@PathVariable UUID id) {
        return reservationService.getReservation(id);
    }

}
