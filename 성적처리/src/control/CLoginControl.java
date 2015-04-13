package control;

import java.io.FileNotFoundException;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl {
	public CLoginInfo login(CLoginInfo loginInfo) {
		try {
			CLoginInfo loginInfoDAO = new CLoginInfo();
			this.getDao().connect("member.txt");
			loginInfo.seteLoginResult(ELoginResult.error);
			loginInfoDAO.seteLoginResult(ELoginResult.error);
			while(!loginInfo.geteLoginResult().equals(ELoginResult.idError)) {
				loginInfoDAO = (CLoginInfo)this.getDao().read(loginInfoDAO);
				loginInfo.seteLoginResult(loginInfoDAO.geteLoginResult());
				if(loginInfoDAO.getUserID().equals(loginInfo.getUserID())){
					if(loginInfoDAO.getPassword().equals(loginInfo.getPassword())){
						loginInfo.seteLoginResult(ELoginResult.success);
					break;
					} else {
						loginInfo.seteLoginResult(ELoginResult.passwordError);
					break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.getDao().disconnect();
		return loginInfo;
	}
}
