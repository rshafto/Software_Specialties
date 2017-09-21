
public abstract class Guitar {
	String name;

	public Guitar() {
	}
	
	public void play() {
		System.out.println(name + " makes some noises.  Reeeeeeeeeeee.");
	}

	public void setName(String name) {
		this.name = name;
	}
}