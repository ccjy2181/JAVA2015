package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Entity class or Value class
public class CMember extends CEntity {
	
	private static final long serialVersionUID = 1L;
	// attributes
	private String[] userID;
	private String[] password;
	
	public String[] getUserID() {return userID;}
	public void setUserID(String[] userID) {this.userID = userID;}
	public String[] getPassword() {return password;}
	public void setPassword(String[] password) {this.password = password;}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		String read = null;
		String userID[] = new String[10];
		String password[] = new String[10];
		try {
			FileReader fr = new FileReader("member.txt");
			BufferedReader reader = new BufferedReader(fr);
			for(int index = 0;(read = reader.readLine()) != null; index++){
				String[] temp = null;
				temp = read.split(" ");
				userID[index] = temp[0];
				password[index] = temp[1];
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setUserID(userID);
		setPassword(password);
	}
	@Override
	public void write(String filename) {
		String[] userID;
		String password[];
		userID = getUserID();
		password = getPassword();
		try {
			FileWriter fw = new FileWriter("memberprint.txt");
			BufferedWriter writer = new BufferedWriter(fw);
			for(int index = 0; userID[index] != null; index++ ){
				writer.write(userID[index]+" ");
				writer.write(password[index]+" ");
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
