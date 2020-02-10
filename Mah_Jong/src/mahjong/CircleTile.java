/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
CircleTile.java
*/

package mahjong;

public class CircleTile extends RankTile {
	
	public CircleTile(int rank){
		super(rank);
	}
	
	public String toString() {
		return "Circle " + super.rank;
	}

}
