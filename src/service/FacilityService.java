/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;

import model.Booking;
import model.Facility;
import model.Room;

/**
 *
 * @author DELL
 */
public class FacilityService {
    ArrayList<Facility> listFacility = new ArrayList<>();
    
    public void readFacility(){
        listFacility.add(new Room( "RO001","QUEEN ROOM", 30, 3000000, 2, "RENT BY DAY", "FREE WATER"));
        listFacility.add(new Room("RO001", "KING ROOM", 40, 4000000, 2, "RENT BY DAY", "FREE WATER"));
        listFacility.add(new Room("RO002", "LUXURY ROOM", 50, 5000000, 3, "RENT BY DAY", "FREE WATER"));
    }
    // public void displayFacility();
    // public void addNewFacility();
    // public void editFacility();

    //Hung viet do 
    public Facility searchFacility(String facility){
        for(Facility f : listFacility)
        if(f.getId().equals(facility)) return f;
        return null;
    }
}
