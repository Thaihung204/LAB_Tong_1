// package controller;

// import view.Menu;

// public class FuramaController extends Menu {

<<<<<<< HEAD
    // CustomerManagement customerManagement = new CustomerManagement();
    // EmployeeManagement employeeManagement = new EmployeeManagement();
    // FacilityManagement facilityManagement = new FacilityManagement();
    // BookingManagement bookingManagement = new BookingManagement();
    // PromotionManagement promotionManagement = new PromotionManagement();

    public static FuramaController parentMenu;

    public FuramaController() {
    }
=======
//     public FuramaController() {
//     }
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431

//     public FuramaController(String td, String[] mc) {
//         super(td, mc);
//     }

<<<<<<< HEAD
    @Override
    public void execute(int n) {
        switch (n) {
            case 1: { //Employee Management         
                try {
                    String[] mchon = { "Load data from file" ,
                                        "Save data into file",
                                        "Display list employees",
                                      "Add new employee",
                                      "Edit employee",
                                      "Return main menu"};
                   EmployeeManagement employeeManagement = new EmployeeManagement("---------- EMPLOYEE MANAGEMENT MENU ----------",mchon);
                   employeeManagement.setParentMenu(this); // Thiết lập menu cha là FuramaController
                   employeeManagement.run();
                   break;
                } catch (Exception e) {
                }
            }

            case 2: { //Customer Management
                try {
                    String[] mchon = {"Load data from file" ,
                                        "Save data into file",
                                        "Display list customers",
                                      "Add new customer",
                                      "Edit customer",
                                      "Return main menu"};
                    CustomerManagement customerManagement = new CustomerManagement("---------- CUSTOMER MANAGEMENT MENU ----------",mchon);
                    customerManagement.setParentMenu(this); // Thiết lập menu cha là FuramaController
                    customerManagement.run();
                    break;
                } catch (Exception e) {
                }
            }

            case 3: { //Facility Management
                try {
                    String[] mchon = {"Display list facility",
                                      "Add new facility",
                                      "Display list facility maintenance",
                                      "Return main menu"};
                    FacilityManagement facilityManagement = new FacilityManagement("---------- FACILITY MANAGEMENT MENU ----------",mchon);
                    facilityManagement.setParentMenu(this);
                    facilityManagement.run();
                } catch (Exception e) {
                }
                break;
            }

            case 4: { //Booking Management
                
                try {
                    String[] mchon = {"Add new booking",
                                      "Display list booking",
                                      "Create new contracts",
                                      "Display list contracts",
                                      "Edit contracts",
                                      "Return main menu"};
                    BookingManagement bookingManagement = new BookingManagement("---------- BOOKING MANAGEMENT MENU ----------",mchon);
                    bookingManagement.setParentMenu(this);
                    bookingManagement.run();
                    break;
                } catch (Exception e) {
                }
            }

            case 5: { //Promotion Management
                try {
                    String[] mchon = {"Display list customers use service",
                                      "Display list customers get voucher",
                                      "Return main menu"};
                    PromotionManagement promotionManagement = new PromotionManagement("---------- PROMOTION MANAGEMENT MENU ----------",mchon);
                    promotionManagement.run();
                    break;
                } catch (Exception e) {
                }
            }
=======
//     @Override
//     public void execute(int n) {
//         switch (n) {
//             case 1: {
//                 try {
//                     String[] mchon = {"Display list employees",
//                                       "Add new employee",
//                                       "Edit employee",
//                                       "Return main menu"};
//                    EmployeeManagement employeeManagement = new EmployeeManagement("---------- MENU ----------",mchon);
//                    employeeManagement.run();
//                    break;
//                 } catch (Exception e) {
//                 }
//             }

//             case 2: {
//                 try {
//                     String[] mchon = {"Display list customers",
//                                       "Add new customer",
//                                       "Edit customer",
//                                       "Return main menu"};
//                     CustomerManagement customerManagement = new CustomerManagement("---------- MENU ----------",mchon);
//                     customerManagement.run();
//                     break;
//                 } catch (Exception e) {
//                 }
//             }

//             case 3: {
//                 try {
//                     String[] mchon = {"Display list facility",
//                                       "Add new facility",
//                                       "Edit facility maintenance",
//                                       "Return main menu"};
//                     FacilityManagement facilityManagement = new FacilityManagement("---------- MENU ----------",mchon);
//                     facilityManagement.setParentMenu(this);
//                     facilityManagement.run();
//                 } catch (Exception e) {
//                 }
//                 break;
//             }

//             case 4: {
//                 try {
//                     String[] mchon = {"Add new booking",
//                                       "Display list booking",
//                                       "Create new contracts",
//                                       "Display list contracts",
//                                       "Edit contracts",
//                                       "Return main menu"};
//                     BookingManagement bookingManagement = new BookingManagement("---------- MENU ----------",mchon);
//                     bookingManagement.run();
//                     break;
//                 } catch (Exception e) {
//                 }
//             }

//             case 5: {
//                 try {
//                     String[] mchon = {"Display list customers use service",
//                                       "Display list customers get voucher",
//                                       "Return main menu"};
//                     PromotionManagement promotionManagement = new PromotionManagement("---------- MENU ----------",mchon);
//                     promotionManagement.run();
//                     break;
//                 } catch (Exception e) {
//                 }
//             }
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431

//             case 6: {
//                 System.out.println("Good bye, see you again!");
//                 System.exit(0);
//             }
//         }
//     }

// }
