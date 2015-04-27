package entity;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

abstract public class CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String ID;
	
	public String getID() {		return ID;	}
	public void setID(String ID) {		this.ID = ID;	}
	
	public void read(Scanner scanner) {}
	public void write(BufferedWriter writer) throws IOException {}
}
