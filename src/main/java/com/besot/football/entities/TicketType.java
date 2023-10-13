package com.besot.football.entities;

public class TicketType {
    private int ticketNo;

    private int seatNo;

    private String souvenir;


    //GETTERS AND SETTERS

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public String getSouvenir() {
        return souvenir;
    }

    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }

    @Override
    public String toString() {
        return "Ticket Details => " + "TicketNo: " + ticketNo + ", SeatNo: " + seatNo + ", Souvenir: " + souvenir ;
    }
}
