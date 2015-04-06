package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
public class CMember implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// attributes
	private String userID;
	private String password;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	void read(Scanner scanner) {
		// TODO Auto-generated method stub
		userID = scanner.next();
		password = scanner.next();
	}
	void write(String filename) {
	}
}