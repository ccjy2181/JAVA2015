package control;

import java.io.FileNotFoundException;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl {
	public CLoginInfo login(CLoginInfo loginInfo) {
		try {
			CLoginInfo loginInfoDAO;
			this.getDao().connect("member.txt");
			while(true) {
				loginInfoDAO = (CLoginInfo)this.getDao().read();
				if(loginInfoDAO.getUserID() == loginInfo.getUserID()){
					if(loginInfoDAO.getPassword() == loginInfo.getPassword()){
						loginInfo.seteLoginResult(ELoginResult.success);
					}
				}
			}
			this.getDao().disconnect();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginInfo;
	}
}
