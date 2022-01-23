package com.clinicreservationdemo.clinicreservation.service;

import com.clinicreservationdemo.clinicreservation.model.Reservation;

import java.util.List;


public interface ReservationService {

    public Reservation saveReservation(Reservation reservation);
    public List<Reservation> getAllReservation();
}
