"""Author: Christian Fusco and Robin Shafto
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
"""


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