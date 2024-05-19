package com.cinemas.neon.neonreservationservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemas.neon.neonreservationservice.dao.SeatReservedDao;
import com.cinemas.neon.neonreservationservice.entity.SeatReserved;

@Service
public class SeatReservedService {

    @Autowired
    SeatReservedDao seatDao;

    public List<SeatReserved> getSeatsByScreenId(UUID id) {
        return seatDao.findByShowId(id);
    }

    public SeatReserved saveSeatReserved(SeatReserved seatReserved) {
        return seatDao.save(seatReserved);
    }

}
