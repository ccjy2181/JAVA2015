package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;
import entity.CGwamok;

public class CGangjwaDAO {
	public CGangjwa read() {return null;}
	public void write(CGangjwa gangjwa) {
		System.out.println("°­ÁÂID: " +gangjwa.getID());
		System.out.println("°­ÁÂÀÌ¸§: " + gangjwa.getName());
		
		// serialize
			try {
				ObjectOutputStream out = 
						new ObjectOutputStream(new FileOutputStream("gangjwa"));
				out.writeObject(gangjwa);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
}


