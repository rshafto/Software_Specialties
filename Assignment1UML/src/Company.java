import java.util.ArrayList;

public class Company {
	String name;
	ArrayList<Plane> planes;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company(String name) {
		super();
		this.name = name;
		planes = new ArrayList<Plane>();
	}
	public Company() {
		super();
		planes = new ArrayList<Plane>();
	}
	public void addAircraft(Plane plane) {
		planes.add(plane);
	}
}
