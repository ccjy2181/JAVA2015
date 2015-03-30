package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGwamok;
import entity.CMember;

public class CGwamokDAO {
	public CGwamok read() {return null;}
	public void write(CGwamok gwamok) {
		System.out.println("과목ID: " +gwamok.getID());
		System.out.println("과목이름: " + gwamok.getName());
		
		// serialize
			try {
				ObjectOutputStream out = 
						new ObjectOutputStream(new FileOutputStream("gwamok"));
				out.writeObject(gwamok);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	};
}
