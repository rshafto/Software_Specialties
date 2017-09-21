

public abstract class Character {
	Guitar guitar;
	SoloBehavior soloBehavior;
	String name;

	public Character() {
	}

	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

	public void setSoloBehavior(SoloBehavior soloBehavior) {
		this.soloBehavior = soloBehavior;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void playGuitar() {
		System.out.print(name + "'s ");
		guitar.play();
	}

	public void playSolo() {
		System.out.print(name + " performs ");
		soloBehavior.perform();
	}
}