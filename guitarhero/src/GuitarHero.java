
public class GuitarHero {
	public static void main(String[] args) {
		System.out.println("\n\nGuitarHero is gunna play with 3 characters.");

		Character p1 = new CharacterAngus();
		Character p2 = new CharacterSlash();
		Character p3 = new CharacterJimi();

		p1.playGuitar();
		p1.playSolo();
		p2.playGuitar();
		p2.playSolo();
		p3.playGuitar();
		p3.playSolo();

		System.out.println("\n\nGuitars don't grow on trees Slash.  We'll give him a new guitar and solo.");
		p2.setSoloBehavior(new SoloJump());
		p2.setGuitar(new GuitarSG());

		p2.playGuitar();
		p2.playSolo();
	}
}