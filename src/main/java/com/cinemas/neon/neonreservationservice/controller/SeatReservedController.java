package com.cinemas.neon.neonreservationservice.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinemas.neon.neonreservationservice.entity.SeatReserved;
import com.cinemas.neon.neonreservationservice.service.SeatReservedService;

@RestController
@RequestMapping("/reserved")
public class SeatReservedController {

    @Autowired
    SeatReservedService seatService;

    @GetMapping(path = "/{id}")
    public List<SeatReserved> getSeatsByScreenId(@PathVariable UUID id) {
        return seatService.getSeatsByScreenId(id);
    }

    @GetMapping(path = "/seats/{id}")
    public List<SeatReserved> getSeatsReserved(@PathVariable UUID id) {
        return seatService.getSeatsReserved(id);
    }

}
