package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CGwamok extends CEntity {
	
	private static final long serialVersionUID = 1L;
	
	// attrubutes
	private int[] ID;
	private String[] name;
	private int[] hakjeom;
	
	// setters & getters
	public int[] getID() {return ID;}
	public void setID(int[] iD) {ID = iD;}
	public String[] getName() {return name;}
	public void setName(String[] name) {this.name = name;}
	public int[] getHakjeom() {return hakjeom;}
	public void setHakjeom(int[] hakjeom) {this.hakjeom = hakjeom;}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		String read = null;
		int ID[] = new int[10];
		String name[] = new String[10];
		int hakjeom[] = new int[10];
		try {
			FileReader fr = new FileReader("gwamok.txt");
			BufferedReader reader = new BufferedReader(fr);
			for(int index = 0;(read = reader.readLine()) != null; index++){
				String[] temp = null;
				temp = read.split(" ");
				ID[index] = Integer.parseInt(temp[0]);
				name[index] = temp[1];
				hakjeom[index] = Integer.parseInt(temp[2]);
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
		setHakjeom(hakjeom);
	}
	@Override
	public void write(String filename) {
		int ID[];
		String name[];
		int hakjeom[];
		ID = getID();
		name = getName();
		hakjeom = getHakjeom();
		try {
			FileWriter fw = new FileWriter("gwamokprint.txt");
			BufferedWriter writer = new BufferedWriter(fw);
			for(int index = 0; name[index] != null; index++ ){
				writer.write(ID[index]+" ");
				writer.write(name[index]+" ");
				writer.write(hakjeom[index]+" ");
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
