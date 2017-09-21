"""Author: Brian Zhang and Christian Fusco
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
"""

public class main {
	public static void main(String[] args) {
		Plane plane = new Plane();
		
		Company delta = new Company();
		delta.setName("Delta air lines, inc.");
		delta.addAircraft(plane);
		
		plane.setBelongsTo(delta);
		
		Flight f1 = new Flight();
		f1.setPlane(plane);
		f1.setDepartureDate("Oct 10, 2017");
		f1.setDeparturePlace("Burlington");
		f1.setDepartureTime("10 AM");
		f1.setDestenationPlace("new york");
		f1.setExpectedDuration("1 hour");
		
		Flight f2 = new Flight();
		f2.setPlane(plane);
		f2.setDepartureDate("Oct 10, 2017");
		f2.setDeparturePlace("new york city");
		f2.setDepartureTime("1 PM");
		f2.setDestenationPlace("atlanta");
		f2.setExpectedDuration("1 hour");
		
		Customer murat = new Customer("Murat", "Gungor", "South Burlington, VT");
		murat.addFlight(new Booking(f1, new Seat(50.00, "12A", "VIP")));
		murat.addFlight(new Booking(f2, new Seat(50.00, "12A", "VIP")));
		
		Itinerary.printItinerary(murat);
	}
}
