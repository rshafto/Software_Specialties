/*Author: Brian Zhang and Christian Fusco
Class: CSI-480-01/02
Assignment: Lab 1
Date Assigned: 9/12/2017
Due Date: 9/19/2017

Description:
UML Design doc with example java code.

Certification of Authenticity: 
I certify that this is entirely my own work, except where I have given 
fully-documented references to the work of others. I understand the definition 
and consequences of plagiarism and acknowledge that the assessor of this 
assignment may, for the purpose of assessing this assignment:
- Reproduce this assignment and provide a copy to another member of academic
- staff; and/or Communicate a copy of this assignment to a plagiarism checking
- service (which may then retain a copy of this assignment on its database for
- the purpose of future plagiarism checking)
*/

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
