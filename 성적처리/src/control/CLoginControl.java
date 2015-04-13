package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CLoginControl extends CControl {
	public VUser login(VLogin vLogin) {
		VUser vUser = new VUser();
		CUser user = new CUser();
		vUser.seteLoginResult(ELoginResult.success);
		try {
			this.getDao().connect("member.txt");
			while(this.getDao().hasNext()) {
				user = (CUser)this.getDao().read(user);
				if(user.getUserID().equals(vLogin.getUserID())){
					if(user.getPassword().equals(vLogin.getPassword())){
						vUser.seteLoginResult(ELoginResult.success);
						vUser.setName(user.getName());
						vUser.setUserID(user.getUserID());
					} else {
						vUser.seteLoginResult(ELoginResult.passwordError);
					}
					this.getDao().disconnect();
					return vUser;
				}
			}
			this.getDao().disconnect();
			vUser.seteLoginResult(ELoginResult.idError);
			return vUser;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();  // 빨간색 에러 출력부분
			vUser.seteLoginResult(ELoginResult.fileNotFound);
			return vUser;
		}
	}
}