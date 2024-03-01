<<<<<<< HEAD

package model;

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mb
 */
>>>>>>> 019e9ec882a50b135a93c7e190bd62f648a8e431
public class Constract {
    private String constractId;
    private String bookingId;
    private int deposit;
    private int total;

    public Constract(String constractId, String bookingId, int deposit, int total) {
        this.constractId = constractId;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.total = total;
    }

    public String getConstractId() {
        return constractId;
    }

    public void setConstractId(String constractId) {
        this.constractId = constractId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Constract{" + "constractId=" + constractId + ", bookingId=" + bookingId + ", deposit=" + deposit + ", total=" + total + '}';
    }
    
    
}
