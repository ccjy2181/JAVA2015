package DAO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class ObjectDAO implements IDAO {
	public Object read(Class clazz, String filename) { 
		Object object = null;
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(filename));
			object = in.readObject();
			in.close();
		}  catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}	
		return object;
	}
	public void write(Object object, String filename) {
		// serialize
			try {
				ObjectOutputStream out = 
						new ObjectOutputStream(new FileOutputStream(filename));
				out.writeObject(object);
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

	};
}
