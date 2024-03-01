package view;

<<<<<<< HEAD
import java.io.IOException;
import java.text.ParseException;

import controller.BookingManagement;
import controller.FuramaController;
import model.Booking;
import repository.BookingRepository;
import service.BookingService;


=======
import java.text.ParseException;

// import controller.FacilityManagement;
import controller.FuramaController;
import model.Booking;
import service.BookingService;
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431

public class Test {
<<<<<<< HEAD
    public static void main(String[] args) throws ParseException, IOException {
=======
    public static void main(String[] args) throws ParseException {
//        String[] mchon = {"Display list facility",
//                          "Add new facility",
//                          "Edit facility maintenance",
//                          "Return main menu"};
//        FacilityService facilityManagement = new FacilityService("---------- MENU ----------",mchon);
//        facilityManagement.run();

>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431
        String[] mchon = {"Employee Management",
                          "Customer Management",
                          "Facility Management",
                          "Booking Management",
                          "Promotion Management",
                          "Exit"};
<<<<<<< HEAD
        FuramaController furamaController = new FuramaController("-------------------- MAIN MENU --------------------",mchon);
        furamaController.run();
        // BookingService bs = new BookingService();
        // BookingRepository br = new BookingRepository(bs.listBooking);
        // br.loadBooking();
=======
        FuramaController furamaController = new FuramaController("---------- MENU ----------",mchon);
        furamaController.setParentMenu(furamaController.parentMenu);
        //furamaController.run();
        BookingService bs = new BookingService();
        bs.addBooking();
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431
    }
}
