package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userID;
	private String password;
	private String name;
	
	public String getUserID() {		return userID;	}
	public void setUserID(String userID) {		this.userID = userID;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	
	public void read(Scanner scanner){
		// TODO Auto-generated method stub
		userID = scanner.next();
		password = scanner.next();
		name = scanner.next();
	}
	public void write(Scanner scanner) {
	}
}
