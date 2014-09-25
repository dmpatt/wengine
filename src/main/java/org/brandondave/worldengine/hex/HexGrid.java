package org.brandondave.worldengine.hex;

import java.util.List;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table.Cell;


public enum HexGrid {
	GRID;
	public static enum Direction
	{
		Up, //up
		Rup,  //right up
		Dor, //down right
		Down, //....down
		Dol, //down left
		Lup, //left up
	}
	private volatile ImmutableTable<Integer,Integer, GridNode2d> grid;
	public void init(int size)
	{
		ImmutableTable.Builder<Integer, Integer, GridNode2d> builder = 
				new ImmutableTable.Builder<Integer, Integer, GridNode2d>() ;
		for(int i = 0; i < size; ++i)
			for(int j = 0; j < size; ++j)
				builder.put(i, j, new GridNode2d(i, j));
		
		grid = builder.build();
	}
	
	GridNode2d getNode(ILayerNode n)
	{
		return n.getGridNode();
	}
	
	GridNode2d getNode(Integer q, Integer r)
	{
		return grid.get(q,r);
	}
	
	List<GridNode2d> getNeighbors(GridNode2d h)
	{
		return null;
	}
	
	List<GridNode2d> getPath(GridNode2d h, GridNode2d target)
	{
		return null; //todo
	}
	
	
	
}
