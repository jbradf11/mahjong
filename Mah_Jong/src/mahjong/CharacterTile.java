/*
Joseph Bradford - CSIS 3230 - online
Delroy A. Brinkerhoff

Lab 3: Mah Jong intro
CharacterTile.java
*/

package mahjong;

import java.util.*;

public class CharacterTile extends Tile {
	
	protected char symbol;
	
	//Just thought I would practice with hash maps
	//and static initializer blocks
	private static final Map<Character,String> SYMBOL_MAP = new HashMap<>();
	static {
		SYMBOL_MAP.put('N', "North Wind");
		SYMBOL_MAP.put('E', "East Wind");
		SYMBOL_MAP.put('W', "West Wind");
		SYMBOL_MAP.put('S', "South Wind");
		SYMBOL_MAP.put('C', "Red Dragon");
		SYMBOL_MAP.put('F', "Green Dragon");
	}
	
	public CharacterTile(char symbol){
		this.symbol = symbol;
	}
	
	public boolean matches(Tile other) {
		
		if(!super.matches(other)) 
			return false;
		
		CharacterTile x = (CharacterTile) other;
		if(symbol == x.symbol)
			return true;
		
		return false;
	}
	
	public String toString() {
		
		if(Character.isDigit(symbol) && symbol != '0') 
			return "Character " + symbol;
		
		return SYMBOL_MAP.getOrDefault(symbol,"error");
		
	}

}
