package lynx.com.api.booking;

import lombok.AllArgsConstructor;
import lynx.com.application.booking.port.in.BookingUseCase;
import lynx.com.common.entities.ESBaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/bookings")
public class BookingController {

    private BookingUseCase bookingUseCase;

    @PostMapping("/book")
    public ResponseEntity<String> book() {
        bookingUseCase.placeOrder();
        return ResponseEntity.ok("Booking placed successfully");
    }

    @PostMapping("/ticket/create")
    public ResponseEntity<ESBaseResponse> createTicket() {
        ESBaseResponse response = ESBaseResponse.<String>builder().message("ok").build();
        return ResponseEntity.ok(response);
    }
}
