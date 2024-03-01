
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.FuramaController;

import service.BookingService;
import view.Menu;

/**
 *
<<<<<<< HEAD
 * @author Hung
=======
 * @author Huydeptraiabc
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431
 * @param <FuramaController>
 */
public class BookingManagement<FuramaController> extends Menu {
    
    BookingService bookingService = new BookingService();
    FuramaController parentMenu; // Thêm thuộc tính để lưu trữ menu cha


    public BookingManagement() {
    }

    public BookingManagement(String td, String[] mc) {
        super(td, mc);
    }    
    
    public void setParentMenu(FuramaController parentMenu) {
        this.parentMenu = parentMenu;
    }

    @Override
    public void execute(int n) throws ParseException, IOException {
        switch (n){
            case 1 ->{ // "Add new booking"
                try {
                    bookingService.addBooking();
                } catch (ParseException e) {                  
                    e.printStackTrace();
                }
            }
            
            case 2 ->{ //"Display list booking"
                bookingService.displayListBooking();
            }
            
            case 3 ->{ // "Create new contracts"
                bookingService.addConstract();
            }
            
            case 4 ->{ // "Display list contracts"
                
            }
            
            case 5 ->{ //  "Edit contracts"
                
            }
        
            case 6 ->{ // "Return main menu"
                System.out.println("Return main menu..");
                parentMenu.run(); // Gọi phương thức run() của menu cha (FuramaController)
            }

         
        }
    }
}
