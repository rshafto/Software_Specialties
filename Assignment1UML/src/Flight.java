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

public class Flight {
	Plane plane;
	String departureDate, departurePlace, destenationPlace, departureTime, expectedDuration;
	public Flight(Plane plane, String departureDate, String departurePlace, String destenationPlace,
			String departureTime, String expectedDuration) {
		super();
		this.plane = plane;
		this.departureDate = departureDate;
		this.departurePlace = departurePlace;
		this.destenationPlace = destenationPlace;
		this.departureTime = departureTime;
		this.expectedDuration = expectedDuration;
	}
	public Flight() {
		super();
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getDestenationPlace() {
		return destenationPlace;
	}
	public void setDestenationPlace(String destenationPlace) {
		this.destenationPlace = destenationPlace;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(String expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
}
