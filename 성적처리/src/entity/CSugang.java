package entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class CSugang extends CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String gangjwaID;
	private String gangjwaName;
	
	public String getGangjwaID() {		return gangjwaID;	}
	public void setGangjwaID(String gangjwaID) {		this.gangjwaID = gangjwaID;	}
	public String getGangjwaName() {		return gangjwaName;	}
	public void setGangjwaName(String gangjwaName) {		this.gangjwaName= gangjwaName;	}
	
	public void read(Scanner scanner){
		// TODO Auto-generated method stub
		gangjwaID = scanner.next();
		gangjwaName = scanner.next();
	}
	public void write(Scanner scanner) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("sugang.txt", true));
		writer.newLine();
		writer.write(ID+" "+gangjwaID);
		writer.close();
	}
}