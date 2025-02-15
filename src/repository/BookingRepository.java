/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;


import model.Facility;
import model.Villa;
import model.Booking;
import service.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author mb
 */
public class BookingRepository {

    private TreeSet<Booking> listBooking = new TreeSet<>();

    public BookingRepository(TreeSet<Booking> listBooking) {
        this.listBooking = listBooking;
    }

    static String bookingPath = "data\\DataBooking.txt";
    Map<Facility, Integer> bill = new HashMap<>();

    public void loadBooking() throws IOException, ParseException {
        BookingService bs = new BookingService();
        listBooking.clear();
        Booking b;
        FacilityService fs = new FacilityService();
        try {
            BufferedReader br = new BufferedReader(new FileReader(bookingPath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] linearr = line.trim().split(",");
                Facility r = fs.searchFacility((linearr[5].trim()));
                Facility rr = new Villa("SVVL-0001","Villa 1",600, 2000, 10, "Villa", "luxury", "80", "4");
        
                bill.put(r, Integer.valueOf(linearr[6].trim()));
                b = new Booking(linearr[0], bs.checkdate(linearr[1]), bs.checkdate(linearr[2]), bs.checkdate(linearr[3]), linearr[4], bill);
                listBooking.add(b);
            }
            System.out.println(listBooking);
            br.close();
        } catch (IOException e) {
            System.out.println("Input invalid !");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format !");
        }
    }

    public void saveBooking() {
        BookingService bs = new BookingService();
        try {
//            String line = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            BufferedWriter bw = new BufferedWriter(new FileWriter(bookingPath));
            for (Booking b : listBooking) {
                Map<Facility, Integer> bill = b.getBill();
                for (Map.Entry<Facility, Integer> entry : bill.entrySet()) {
                    Facility f = entry.getKey();
                    Integer value = entry.getValue();
                    bw.write(b.getBookingId() + "," + dateFormat.format(b.getBookingDate()) + "," + dateFormat.format(b.getStart()) + "," + dateFormat.format(b.getFinish()) + "," + b.getCusId() + "," + f.getId() + "," + value + "\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

