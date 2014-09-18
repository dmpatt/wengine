package org.brandondave.worldengine.hex;

import java.util.stream.Stream;


public class HexGrid {
	public static enum Direction
	{
		Uppa,
		Rus,
		Dorg,
		Dol,
		Lorh,
		Lu
	}
	
	int size = 7;
	Hex[][] grid = new Hex[size][size];
	
	/*Stream<Hex> getNeighbors()
	{
		
	}*/
}
