/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
BanbooTile.java
*/

package mahjong;

public class BambooTile extends RankTile {

		BambooTile(int rank){
			super(rank);
		}
		
		public String toString() {
			return "Bamboo " + super.rank;
		}
}
