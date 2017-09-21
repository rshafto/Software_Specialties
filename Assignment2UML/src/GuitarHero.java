/*Author: Christian Fusco and Robin Shafto
Class: CSI-480-01/02
Assignment: Lab 2
Date Assigned: 9/21/2017
Due Date: 10/5/2017

Description:
Using interfaces to create a strategy design pattern and UML Class Diagram.

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