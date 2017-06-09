package ru.spbu.math.ais.mas.roads.wrappers.communication;

import java.io.Serializable;

public class RoadsUpdateRequest implements Serializable{
	Pair roadLleft;
	Pair roadOccupied;
	public Pair getRoadLleft() {
		return roadLleft;
	}
	public void setRoadLleft(Pair roadLleft) {
		this.roadLleft = roadLleft;
	}
	public Pair getRoadOccupied() {
		return roadOccupied;
	}
	public void setRoadOccupied(Pair roadOccupied) {
		this.roadOccupied = roadOccupied;
	}
	public RoadsUpdateRequest(Pair roadLleft, Pair roadOccupied) {
		super();
		this.roadLleft = roadLleft;
		this.roadOccupied = roadOccupied;
	}
}