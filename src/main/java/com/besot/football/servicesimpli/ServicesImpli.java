package com.besot.football.servicesimpli;

import com.besot.football.entities.Fans;
import com.besot.football.entities.Footballer;
import com.besot.football.entities.Staff;
import com.besot.football.services.StadiumServices;

public class ServicesImpli implements StadiumServices {


    @Override
    public void publishFootballer(Footballer footballer) {
        System.out.println("The Player's information is: " + footballer);

    }

    @Override
    public void sellTicket(Fans fan) {
        System.out.println(fan + " Successfully purchased entrance ticket!");
    }

    @Override
    public void register(Fans fan) {
        System.out.println(fan + " Has been registered successfully");

    }

    @Override
    public void allocateSeat(Fans fan) {
        System.out.println("Our fan " + fan + " has  been allocated seat successfully");

    }

    @Override
    public void banFan(Fans fan) {
        System.out.println("Unfortunately, our fan " + fan + " has been banned from this facility due to a gross act of misconduct");
    }

    @Override
    public void layStaffOff(Staff staff) {

    }

    @Override
    public void layStaffOf(Staff staff) {
        System.out.println( "Unfortunately our staff " + staff + "as been laid off");

    }

    @Override
    public void promoteStaff(Staff staff) {
        System.out.println(staff + " Has been promoted!");

    }
}
