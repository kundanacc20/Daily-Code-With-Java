package multithreading.java.code.day23August2026;

public class TicketBooking {
    private int availableTickets = 5;

    synchronized void bookTicket(String user, int tickets){
        if(availableTickets >= tickets){
            System.out.println(user+ " is booking "+tickets+ " ticket(s)");

            availableTickets -= tickets;
            System.out.println(
                    "tickets remaining: "+availableTickets
            );
        } else {
            System.out.println(user+ " not enough tickets");
        }
    }
}
