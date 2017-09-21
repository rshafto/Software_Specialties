
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
