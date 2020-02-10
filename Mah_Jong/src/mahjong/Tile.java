/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
Tile.java

This program demonstrates inheritance and polymorphism.  9 classes extend the Tile.java class,
and functions are implemented in a way that will allow polymorphic behavior.
*/

package mahjong;

public class Tile {

	public boolean matches(Tile other) {
		
		if(other == null) return false;
		
		if(this == other) return false;
		
		if(this.getClass() == other.getClass())return true;
		
		return false;
	}
}
