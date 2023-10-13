package com.besot.football.entities;

import java.util.List;

public class Fans extends User {

    private List<TicketType> ticketTypeList;

    public List<TicketType> getTicketTypeList() {
        return ticketTypeList;
    }

    public void setTicketTypeList(List<TicketType> ticketTypeList) {
        this.ticketTypeList = ticketTypeList;
    }

    @Override
    public String toString() {
        return "" + getName() + ", Age: " +getAge() + ", Sex: " + ", Identity Type: " +getIdtype()+ ", Phone No: "+ getPhoneNo() + ticketTypeList;
    }
}
