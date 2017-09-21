import java.util.ArrayList;

public class Customer {
	ArrayList<Booking> bookings;
	String firstName, lastName, address;
	
	void addFlight(Booking booking) {
		bookings.add(booking);
	}
	
	public ArrayList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<Booking> bookings) {
		this.bookings = bookings;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(String firstName, String lastName, String address) {
		super();
		bookings = new ArrayList<Booking>();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
}
