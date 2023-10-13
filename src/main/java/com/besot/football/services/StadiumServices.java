package com.besot.football.services;

import com.besot.football.entities.Fans;
import com.besot.football.entities.Footballer;
import com.besot.football.entities.Staff;

public interface StadiumServices {

    void publishFootballer(Footballer footballer);

    void sellTicket(Fans fan);
    void register(Fans fan);
    void allocateSeat(Fans fan);
    void banFan(Fans fan);
    void layStaffOff(Staff staff);

    void layStaffOf(Staff staff);

    void promoteStaff(Staff staff);

}
