package SynchronizationAssessment;

class TicketBookingSystem {
    private int availableSeats;

    public TicketBookingSystem(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void bookTicket(String userName) {
        if (availableSeats > 0) {
            System.out.println(userName + " is booking a ticket.");
            availableSeats--;
            System.out.println(userName + " successfully booked a ticket. Remaining seats: " + availableSeats);
        } else {
            System.out.println(userName + " tried to book a ticket, but no seats are available.");
        }
    }
}

class UserX extends Thread {
    private TicketBookingSystem bookingSystem;
    private String userName;

    public UserX(TicketBookingSystem bookingSystem, String userName) {
        this.bookingSystem = bookingSystem;
        this.userName = userName;
    }

    @Override
    public void run() {
        bookingSystem.bookTicket(userName);
    }
}

public class TicketBookingWithoutSync {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem(2); // Only 2 seats available

        // Creating multiple users trying to book tickets simultaneously
        UserX user1 = new UserX(system, "User1");
        UserX user2 = new UserX(system, "User2");
        UserX user3 = new UserX(system, "User3");

        user1.start();
        user2.start();
        user3.start();
    }
}
