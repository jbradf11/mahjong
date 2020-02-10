/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
PictureTile.java
*/

package mahjong;

public class PictureTile extends Tile {
	
	private String name;
	
	public PictureTile(String name){
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

}
