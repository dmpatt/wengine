package org.brandondave.worldengine.hex;

public enum Layer {

	GRID {
		public GridNode2d getNode(ILayerNode n) {
			return HexGrid.GRID.getNode(n);
		}
	},
	GEOLOGY,
	TERRAIN,
	WEATHER,
	FLORA,
	FAUNA,
	STRUCTURES,
	POPULATION,
	UNITS;
	
	
	
}
