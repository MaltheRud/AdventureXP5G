package com.adventurexp.model;
import com.adventurexp.model.Employee;


import java.time.LocalDateTime;

public class Booking {

    private long bookingId;
    private int numberOfGuests;
    private String contactEmail;
    private String contactNumber;
    private LocalDateTime date;
    private LocalDateTime bookingTimePeriod;
    private Activity activity;
    private int price;
    private int responsibleEmployeeId;

    public Booking() {
    }

    public Booking(long bookingId,
                   int numberOfGuests,
                   String contactEmail,
                   String contactNumber,
                   LocalDateTime date,
                   LocalDateTime bookingTimePeriod,
                   Activity activity,
                   int price) {

        this.bookingId = bookingId;
        this.numberOfGuests = numberOfGuests;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
        this.date = date;
        this.bookingTimePeriod = bookingTimePeriod;
        this.activity = activity;
        this.price = price;

    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getBookingTimePeriod() {
        return bookingTimePeriod;
    }

    public void setBookingTimePeriod(LocalDateTime bookingTimePeriod) {
        this.bookingTimePeriod = bookingTimePeriod;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}