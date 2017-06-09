package ru.spbu.math.ais.mas.roads.wrappers.communication;

import java.io.Serializable;

public class Pair implements Serializable{
	int first;
	int second;
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
}
