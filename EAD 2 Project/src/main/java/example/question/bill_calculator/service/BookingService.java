package example.question.bill_calculator.service;

import example.question.bill_calculator.Model.BookingModel;
import example.question.bill_calculator.repository.BookingRepository;
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
