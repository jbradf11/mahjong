package mahjong;

public class CharacterTile extends Tile {
	
	protected char symbol;
	
	public CharacterTile(char symbol){
		this.symbol = symbol;
	}
	
	public boolean matches(Tile other) {
		
		if(!super.matches(other)) return false;
		
		CharacterTile x = (CharacterTile) other;
		if(symbol == x.symbol)return true;
		
		return false;
	}
	
	public String toString() {
		
		if(Character.isDigit(symbol)) 
			return "Character " + symbol;
		switch(symbol) {
			case 'N': return "North Wind";
			case 'E': return "East Wind";
			case 'W': return "West Wind";
			case 'S': return "South Wind";
			case 'C': return "Red Dragon";
			case 'F': return "Green Dragon";
			default: return "error";
		}
		
	}

}
