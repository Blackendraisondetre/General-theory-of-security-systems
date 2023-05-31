package com.example.uaplanes.controllers;

import com.example.uaplanes.model.Flight;
import com.example.uaplanes.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/api/flights")
    public ResponseEntity getAllFlights() {
        return ResponseEntity.ok(this.flightService.getAllFlights());
    }

    @GetMapping("/api/flights/{id}")
    public ResponseEntity getFlightById(@PathVariable int id) {
        return ResponseEntity.ok(this.flightService.getFlightById(id));
    }

    @PostMapping(value = "/api/flights/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity createFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(this.flightService.createFlight(flight));
    }

    @DeleteMapping("/api/flights/{id}")
    public ResponseEntity deleteFlightById(@PathVariable int id) {
        this.flightService.deleteFlightById(id);
        return ResponseEntity.noContent().build();
    }
}
