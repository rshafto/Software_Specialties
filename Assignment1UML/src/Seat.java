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

public class Seat {
	Double price;
	String number, type;
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Seat(Double price, String number, String type) {
		super();
		this.price = price;
		this.number = number;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return " $" + price + " " + number + " " + type;
	}
}
