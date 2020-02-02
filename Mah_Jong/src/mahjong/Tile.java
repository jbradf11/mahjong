package mahjong;

public class Tile {

	public boolean matches(Tile other) {
		
		if(other == null) return false;
		
		if(this == other) return false;
		
		if(this.getClass() == other.getClass())return true;
		
		return false;
	}
}
