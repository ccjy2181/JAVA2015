package valueObject;

import java.util.Scanner;

// Entity class or Value class
public class VLogin{
	
	// attributes
	private String userID;
	private String password;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

	public void read(Scanner scanner) throws NullPointerException{
		// TODO Auto-generated method stub
		userID = scanner.next();
		password = scanner.next();

	}
	public void write() {
	}
}
