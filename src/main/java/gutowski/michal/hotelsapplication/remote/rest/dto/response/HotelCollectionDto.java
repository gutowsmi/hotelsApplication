package gutowski.michal.hotelsapplication.remote.rest.dto.response;

import java.util.List;
//Author: Michal Gutowski Function: HotelCollectionDto 1. endpoint Hotels list
public class HotelCollectionDto {
    private List<HotelDto> hotels;

    public HotelCollectionDto() {
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public HotelCollectionDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
