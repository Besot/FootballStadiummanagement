package com.besot;

import com.besot.football.entities.Fans;
import com.besot.football.entities.Footballer;
import com.besot.football.entities.Staff;
import com.besot.football.entities.TicketType;
import com.besot.football.enums.FitnessStatus;
import com.besot.football.enums.Grade;
import com.besot.football.enums.Idtype;
import com.besot.football.enums.Sex;
import com.besot.football.servicesimpli.ServicesImpli;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Footballer sterling = new Footballer();
        sterling.setName("Raheem Sterling");
        sterling.setAge(27);
        sterling.setSex(Sex.Male);
        sterling.setIdtype(Idtype.Player_Id);
        sterling.setPosition("Right wing");
        sterling.setJerseyNo(17);
        sterling.setFitnessStatus(FitnessStatus.Fit);

        ServicesImpli publishFootballer1 = new ServicesImpli();
        publishFootballer1.publishFootballer(sterling);

        //To set Parameter of List<TicketType>, first create an object of List - listOfTicketType
        //and then create TicketType object, then add the ticketType into listOfTicketType
        List<TicketType> Ticketlist = new ArrayList<>();
        TicketType ticket = new TicketType();
        ticket.setTicketNo(2_456);
        ticket.setSeatNo(1_734);
        ticket.setSouvenir("Home Jersey");



        Fans fan1 = new Fans();
        fan1.setName("Sonia");
        fan1.setAge(21);
        fan1.setSex(Sex.Female);
        fan1.setIdtype(Idtype.Fan_Id);
        fan1.setTicketTypeList(Ticketlist);
        fan1.setPhoneNo(2348130229749L);
        fan1.setEmail("sonia@example.com");
        Ticketlist.add(ticket);

        ServicesImpli allocate = new ServicesImpli();

        allocate.allocateSeat(fan1);

        Staff staff1 = new Staff();
        staff1.setName("Emma");
        staff1.setAge(29);
        staff1.setSex(Sex.Male);
        staff1.setIdtype(Idtype.Staff_Id);
        staff1.setGrade(Grade.senior_staff);
        staff1.setPhoneNo(2348120545667L);
        staff1.setEmail("emma.bob@decagon.com");

        ServicesImpli promote = new ServicesImpli();
        promote.promoteStaff(staff1);


    }
}