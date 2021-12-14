package gutowski.michal.hotelsapplication.remote.rest.dto.common;

public class PersonReservationDto {
    private String name;
    private String phone;
    private String address;
    private String floor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public PersonReservationDto(String name, String phone, String address, String floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public PersonReservationDto() {
    }
}
