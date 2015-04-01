package entity;

import java.util.Vector;

public class CGangjwa extends CEntity{

	private static final long serialVersionUID = 1L;
	
	// attrubutes
	private int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times;
	private int gyosuID;
	private int gwamokID;
	
	// setters & getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	@Override
	void read() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void write() {
		// TODO Auto-generated method stub
		
	}
	
}
