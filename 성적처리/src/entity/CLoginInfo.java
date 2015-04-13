package entity;

import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
public class CLoginInfo extends CEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// attributes
	public enum ELoginResult { success, idError, passwordError, error }
	private ELoginResult eLoginResult;
	
	private String userID;
	private String password;
	
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public ELoginResult geteLoginResult() {		return eLoginResult;	}
	public void seteLoginResult(ELoginResult eLoginResult) {		this.eLoginResult = eLoginResult;	}

	public void read(Scanner scanner) throws NullPointerException{
		// TODO Auto-generated method stub
		if(scanner.hasNext()){
			userID = scanner.next();
			password = scanner.next();
		} else {
			this.seteLoginResult(ELoginResult.idError);
		}
	}
	public void write() {
	}
}
