package com.clinicreservationdemo.clinicreservation.controller;

import com.clinicreservationdemo.clinicreservation.model.Reservation;
import com.clinicreservationdemo.clinicreservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reservation")
public class ReservationController {
    @Autowired
    public ReservationService reservationService;

    @PostMapping("/add")
    public String add(@RequestBody Reservation reservation){
        reservationService.saveReservation(reservation);
        return "reservation saved";
    }

    @GetMapping("/getAll")
    public List<Reservation> getAllReservation(){
        return reservationService.getAllReservation();
    }

}
