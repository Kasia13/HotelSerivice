package SDA;

import SDA.model.Hotel;
import SDA.model.HotelService;

public class App
{
    public static void main( String[] args )
    {
        Hotel sdaHotel = new Hotel();
        HotelService sdaHotelService = new HotelService(sdaHotel);

        System.out.println("All rooms: ");
        System.out.println(sdaHotelService.getAllRooms());
        System.out.println("Available rooms: ");
        System.out.println(sdaHotelService.getAvailableRoom());

    }
}
