package com.project.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.flightreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	
}
