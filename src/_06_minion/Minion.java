package _06_minion;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int NumberofEyes, String color, String master) {
		this.name = name;
		this.eyes = NumberofEyes;
		this.color = color;
		this.master = master;
	}
	String getName(){
		return name;
	}
	int getEyes() {
		return eyes;
	}
	String getColor() {
		return color;
	}
	
	String getMaster(){
		return master;
	}
	String setMaster(String newMinionMaster) {
		master = newMinionMaster;
		return master;
	}
}
