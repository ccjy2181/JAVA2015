package entity;

import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
public class CMember extends CEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// attributes
	private String userID;
	private String password;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		userID = scanner.next();
		password = scanner.next();
	}
	public void write() {
	}
}
