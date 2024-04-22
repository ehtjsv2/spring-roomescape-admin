package roomescape.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationAddRequest {
    private LocalDate date;
    private String name;
    private Long timeId;

    public ReservationAddRequest() {

    }

    public ReservationAddRequest(LocalDate date, String name, LocalTime time, Long timeId) {
        this.date = date;
        this.name = name;
        this.timeId = timeId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public Long getTimeId() {
        return timeId;
    }
}
