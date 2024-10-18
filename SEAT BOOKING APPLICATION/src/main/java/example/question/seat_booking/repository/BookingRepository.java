package example.question.seat_booking.repository;

import example.question.seat_booking.Model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingModel, Long> {

}
