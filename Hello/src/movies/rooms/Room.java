package movies.rooms;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final int id;
    private final List<Seat> seating;

    public Room(int id, int capacity, int row) {
        int numSeatPerRow = capacity / row;
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= numSeatPerRow; j++) {

                seats.add(new Seat(i, j));
            }
        }

        this.id = id;
        this.seating = seats;
    }

    public int getId() {
        return id;
    }

    public List<Seat> getSeating() {
        return seating;
    }
}

