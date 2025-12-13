package lynx.com.api.event;

import lombok.AllArgsConstructor;
import lynx.com.application.event.dto.CreateEventRequestDto;
import lynx.com.application.event.port.in.EventUseCase;
import lynx.com.common.entities.ESBaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(("/events"))
public class EventController {

    private final EventUseCase eventUseCase;

    @PostMapping("/create")
    public ResponseEntity<ESBaseResponse> createEvent(@RequestBody CreateEventRequestDto requestDto) {
        var eventCreated = eventUseCase.createEvent(requestDto);
        return ResponseEntity.ok(ESBaseResponse.builder().data(eventCreated).build());
    }
}
