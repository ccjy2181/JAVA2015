package entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSugang extends CEntity{
	
	private String userID;
	private String gangjwaID;
	
	public CSugang(String userID, String gangjwaID){
		// TODO Auto-generated method stub
		this.userID = userID;
		this.gangjwaID = gangjwaID;
	}
		
	public String getUserID() {		return userID;	}
	public void setUserID(String userID) {		this.userID = userID;	}
	public String getGangjwaID() {		return gangjwaID;	}
	public void setGangjwaID(String gangjwaID) {		this.gangjwaID = gangjwaID;	}

	@Override
	public void read(Scanner scanner){
		// TODO Auto-generated method stub
		this.userID = scanner.next();
		this.gangjwaID = scanner.next();
	}
	
	@Override
	public void write(BufferedWriter writer) throws IOException {
		
	}
}