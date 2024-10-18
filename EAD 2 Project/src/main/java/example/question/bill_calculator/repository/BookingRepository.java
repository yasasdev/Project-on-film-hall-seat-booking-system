package example.question.bill_calculator.repository;

import example.question.bill_calculator.Model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingModel, Long> {

}
