package com.cinemas.neon.neonreservationservice.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cinemas.neon.neonreservationservice.entity.SeatReserved;

@Repository
public interface SeatReservedDao extends JpaRepository<SeatReserved, UUID> {

    @Query("SELECT sr from SeatReserved sr INNER JOIN sr.reservation r where r.show.id = :showId")
    public List<SeatReserved> findByShowId(@Param("showId") UUID showId);

    @Query("SELECT sr from SeatReserved sr INNER JOIN sr.reservation r where r.id = :reservationId")
    public List<SeatReserved> findByReservationId(@Param("reservationId") UUID reservationId);

}
