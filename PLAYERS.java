package com.codinghub;

public class PLAYERS 
{
	String name;
	int players;
	String Sname;
	int S_Strength;
	public PLAYERS(String name, int players, String sname, int s_Strength) {
		super();
		this.name = name;
		this.players = players;
		Sname = sname;
		S_Strength = s_Strength;
	}
	@Override
	public String toString() {
		return "PLAYERS [name=" + name + ", players=" + players + ", Sname=" + Sname + ", S_Strength=" + S_Strength
				+ "]";
	}
	
}
