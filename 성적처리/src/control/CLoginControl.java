package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CLoginControl extends CControl {
	private String Result;
	private String ID;
	public VUser login(VLogin vLogin) {
		VUser vUser = new VUser();
		CUser user = new CUser();
		try {
			this.getDao().connect("member.txt");
			user = (CUser)this.getDao().read(user,vLogin.getUserID());
			this.getDao().disconnect();
			
			if( user == null) {
				vUser.seteLoginResult(ELoginResult.idError);
				setResult("idError");
				return vUser;
			}
			if(!user.getPassword().equals(vLogin.getPassword())){
				vUser.seteLoginResult(ELoginResult.passwordError);
				setResult("passwordError");
				return vUser;
			}
			vUser.seteLoginResult(ELoginResult.success);
			setResult("success");
			vUser.setName(user.getName());
			vUser.setUserID(user.getID());
			/*
			while(this.getDao().hasNext()) {
				user = (CUser)this.getDao().read(user);
				if(user.getID().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.success);
						setResult("success");
						vUser.setName(user.getName());
						vUser.setUserID(user.getID());
					} else {
						vUser.seteLoginResult(ELoginResult.passwordError);
						setResult("passwordError");
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			*/
			return vUser;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();  // 빨간색 에러 출력부분
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			setResult("fileNotFound");
			return vUser;
		}
	}
	public String getResult() {		return Result;	}
	public void setResult(String result) {		Result = result;	}
	public String getID() {		return ID;	}
	public void setID(String iD) {		ID = iD;	}
}