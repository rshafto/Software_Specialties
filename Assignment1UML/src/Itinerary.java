
public class Itinerary {
	static void printItinerary(Customer c) {
		System.out.println("Name:" + c.getFirstName() + "\n"
				+ "Last Name:" + c.getLastName() + "\n");
		for (Booking booking : c.getBookings()) {
			Flight f = booking.getFlight();
			System.out.println(""
					+ "From:" + f.getDeparturePlace() + "\n"
					+ "To:" + f.getDestenationPlace() + "\n"
					+ "Date:" + f.getDepartureDate() + "\n"
					+ "Date:" + f.getDepartureTime() + "\n"
					+ "Seat Type:" + booking.getSeat().toString() + "\n"
					+ "Carrier:" + f.getDepartureTime() + "\n");	
		}
	}
}
