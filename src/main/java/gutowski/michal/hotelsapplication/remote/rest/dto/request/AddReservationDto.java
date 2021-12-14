package gutowski.michal.hotelsapplication.remote.rest.dto.request;

import gutowski.michal.hotelsapplication.remote.rest.dto.common.PersonReservationDto;
import gutowski.michal.hotelsapplication.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonReservationDto person;

    public AddReservationDto() {
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }
}
