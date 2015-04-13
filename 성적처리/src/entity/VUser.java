package entity;

public class VUser {
	public enum ELoginResult { success, idError, passwordError, fileNotFound }
	private ELoginResult eLoginResult;
	private String userID;
	private String name;
	
	public String getUserID() {		return userID;	}
	public void setUserID(String userID) {		this.userID = userID;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	
	public ELoginResult geteLoginResult() {		return eLoginResult;	}
	public void seteLoginResult(ELoginResult eLoginResult) {		this.eLoginResult = eLoginResult;	}


}

