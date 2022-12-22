package com.example.amogus;

public class Flight {

    private int id;
    private int departure;
    private int arrival;
    private int departureDateTime;
    private int arrivalDateTime;
    private int price;
    private int flight_number;
    private int creation_date;

    public int getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(int departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public int getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(int arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public int getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(int creation_date) {
        this.creation_date = creation_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeparture() {
        return departure;
    }

    public void setDeparture(int departure) {
        this.departure = departure;
    }

    public int getArrival() {
        return arrival;
    }

    public void setArrival(int arrival) {
        this.arrival = arrival;
    }
}
