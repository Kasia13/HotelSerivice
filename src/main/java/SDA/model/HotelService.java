package SDA.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelService {
    private Hotel hotel;



    public HotelService(Hotel hotel) {
        this.hotel = Objects.requireNonNull(hotel, "Hotel must be defined. ");
    }

    public List <Room> getAllRooms(){
        return hotel.getRooms();
    }

    public List <Room> getAvailableRoom() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room: hotel.getRooms()) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
  }
  }

