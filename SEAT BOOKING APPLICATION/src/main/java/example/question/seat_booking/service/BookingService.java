package example.question.seat_booking.service;

import example.question.seat_booking.Model.BookingModel;
import example.question.seat_booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingModel> getAllBookings() {
        return bookingRepository.findAll();
    }
}
