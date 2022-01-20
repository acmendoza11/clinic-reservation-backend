package com.clinicreservationdemo.clinicreservation.repository;

import com.clinicreservationdemo.clinicreservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
