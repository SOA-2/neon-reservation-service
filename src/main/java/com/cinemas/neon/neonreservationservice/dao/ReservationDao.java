package com.cinemas.neon.neonreservationservice.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonreservationservice.entity.Reservation;

@Repository
public interface ReservationDao extends JpaRepository<Reservation, UUID> {

    public List<Reservation> findByUser(UUID showId);
}