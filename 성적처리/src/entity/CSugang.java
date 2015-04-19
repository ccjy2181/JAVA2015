package entity;

import java.io.Serializable;
import java.util.Scanner;

public class CSugang extends CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String gwamok1;
	private String gwamok2;
	
	public String getGwamok1() {		return gwamok1;	}
	public void setGwamok1(String gwamok1) {		this.gwamok1 = gwamok1;	}
	public String getGwamok2() {		return gwamok2;	}
	public void setGwamok2(String gwamok2) {		this.gwamok2= gwamok2;	}
	
	public void read(Scanner scanner){
		// TODO Auto-generated method stub
		ID = scanner.next();
		gwamok1 = scanner.next();
		gwamok2 = scanner.next();
	}
	public void write(Scanner scanner) {
	}
}