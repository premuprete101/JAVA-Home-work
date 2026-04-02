// 18. Railway Reservation System
// Create a class RailwayReservation. Use synchronization to avoid double booking.
// Output: 'Ticket booked successfully' or 'No tickets available'

class RailwayReservation {

    int seats = 1; // only 1 seat available

    synchronized void bookTicket(String name) {
        if (seats > 0) {
            System.out.println(name + ": Ticket booked successfully");
            seats--;
        } else {
            System.out.println(name + ": No tickets available");
        }
    }
}

class Passenger extends Thread {

    RailwayReservation r;
    String name;

    Passenger(RailwayReservation r, String name) {
        this.r = r;
        this.name = name;
    }

    public void run() {
        r.bookTicket(name);
    }

    public static void main(String[] args) {

        RailwayReservation r = new RailwayReservation();

        Passenger p1 = new Passenger(r, "Om");
        Passenger p2 = new Passenger(r, "Rahul");

        p1.start();
        p2.start();
    }
}