package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CUser extends CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String password;
	private String name;

	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	
	public void read(Scanner scanner) throws NullPointerException{
		// TODO Auto-generated method stub
		ID = scanner.next();
		password = scanner.next();
	}
	public void write(Scanner scanner) {
	}
}
