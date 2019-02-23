package SDA.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms = new ArrayList<>();


    public Hotel() {

        rooms.add(new Room(10, 2, true, true));
        rooms.add(new Room(12, 2, true, true));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
