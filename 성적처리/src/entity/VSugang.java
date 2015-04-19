package entity;

public class VSugang {
	public enum EReadResult { success, fileNotFound, loginError }
	private EReadResult eReadResult;
	private String gwamok1;
	private String gwamok2;
	
	public String getGwamok1() {		return gwamok1;	}
	public void setGwamok1(String gwamok1) {		this.gwamok1 = gwamok1;	}
	public String getGwamok2() {		return gwamok2;	}
	public void setGwamok2(String gwamok2) {		this.gwamok2 = gwamok2;	}
	public EReadResult geteReadResult() {		return eReadResult;	}
	public void seteReadResult(EReadResult eReadResult) {		this.eReadResult = eReadResult;	}
}
