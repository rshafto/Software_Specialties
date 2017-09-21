
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
