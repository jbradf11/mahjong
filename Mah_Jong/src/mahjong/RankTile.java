/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
RankTile.java
*/

package mahjong;

public class RankTile extends Tile {
	
	protected int rank;
	
	public RankTile(int rank) {
		this.rank = rank;
	}
	
	public boolean matches(Tile other) {
		
		if(!super.matches(other)) return false;
		
		RankTile x = (RankTile)other;
		if(rank == x.rank) return true;
		
		return false;
	}
}
