package org.brandondave.worldengine.hex;

import com.google.common.collect.ImmutableMap;

public class GridNode2d implements ILayerNode{
	private Integer _q, _r;
	public GridNode2d(Integer q, Integer r) {
		// TODO Auto-generated constructor stub
	}
	ImmutableMap<Layer, GridNode2d> transLayerNodeMap;
	public Integer getQ()
	{
		return _q;
	}
	public Integer getR()
	{
		return _r;
	}
	@Override
	public GridNode2d getGridNode() {
		return this;
	}
}
