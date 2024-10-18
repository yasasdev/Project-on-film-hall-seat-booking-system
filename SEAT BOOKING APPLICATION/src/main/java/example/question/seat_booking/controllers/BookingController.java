package example.question.seat_booking.controllers;

import example.question.seat_booking.Model.BookingModel;
import example.question.seat_booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;
    @PostMapping("/bookings")
    public ResponseEntity<String> bookSeats(@RequestBody BookingRequest bookingRequest) {
        try {
            // Create and populate BookingModel
            BookingModel booking = new BookingModel();
            booking.setSeats(bookingRequest.getSeats());
            booking.setDate(bookingRequest.getDate());
            booking.setTime(bookingRequest.getTime());
            booking.setPrice(bookingRequest.getPrice());

            // Save the booking to the database
            bookingRepository.save(booking);

            System.out.println("Received booking: " + bookingRequest);
            return ResponseEntity.ok("Booking successful, Thank you!");
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception
            return ResponseEntity.status(500).body("Error saving booking");
        }
    }

    @GetMapping("/views")
    public List<BookingModel> getAllDetails(){
        return bookingRepository.findAll();
    }
}

class BookingRequest {
    private List<String> seats;
    private String date;
    private String time;
    private String price;

    public BookingRequest(List<String> seats, String date, String time, String price) {
        this.seats = seats;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}