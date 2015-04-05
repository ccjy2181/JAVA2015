package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class CGangjwa extends CEntity{

	private static final long serialVersionUID = 1L;
	
	// attrubutes
	private int[] ID;
	private String[] name;
	private int[] suganginwon;
	private Vector<String> times;
	private int[] gyosuID;
	private int[] gwamokID;
	
	// setters & getters
	public int[] getID() {return ID;}
	public void setID(int[] iD) {ID = iD;}
	public String[] getName() {return name;}
	public void setName(String[] name) {this.name = name;}
	public int[] getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int[] suganginwon) {this.suganginwon = suganginwon;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int[] getGyosuID() {return gyosuID;}
	public void setGyosuID(int[] gyosuID) {this.gyosuID = gyosuID;}
	public int[] getGwamokID() {return gwamokID;}
	public void setGwamokID(int[] gwamokID) {this.gwamokID = gwamokID;}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		String read = null;
		int ID[] = new int[10];
		String name[] = new String[10];
		int gyosuID[] = new int[10];
		int suganginwon[] = new int[10];
		Vector<String> times = new Vector<String>();
		try {
			FileReader fr = new FileReader("gangjwa.txt");
			BufferedReader reader = new BufferedReader(fr);
			for(int index = 0;(read = reader.readLine()) != null; index++){
				String[] temp = null;
				temp = read.split(" ");
				ID[index] = Integer.parseInt(temp[0]);
				name[index] = temp[1];
				gyosuID[index] = Integer.parseInt(temp[2]);
				suganginwon[index] = Integer.parseInt(temp[3]);
				times.add(index,temp[4]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setID(ID);
		setName(name);
		setGyosuID(gyosuID);
		setSuganginwon(suganginwon);
		setTimes(times);	
	}
	@Override
	public void write(String filename) {
		// TODO Auto-generated method stub
		int ID[];
		String name[];
		int gyosuID[];
		int suganginwon[];
		Vector<String> times;
		ID = getID();
		name = getName();
		gyosuID = getGyosuID();
		suganginwon = getSuganginwon();
		times = getTimes();
		try {
			FileWriter fw = new FileWriter("gangjwaprint.txt");
			BufferedWriter writer = new BufferedWriter(fw);
			for(int index = 0; name[index] != null; index++ ){
				writer.write(ID[index]+" ");
				writer.write(name[index]+" ");
				writer.write(gyosuID[index]+" ");
				writer.write(suganginwon[index]+" ");
				writer.write(times.elementAt(index)+" ");
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
	
		
		
