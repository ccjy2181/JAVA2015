package control;

import java.io.FileNotFoundException;

import entity.CUser;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginControl extends CControl {
	public VUser login(VLogin vLogin)
			throws FileNotFoundException,
			UserIDNotFoundException,
			PasswordNotMatchException {
		VUser vUser = new VUser();
		CUser user = new CUser();
			this.getDao().connect("member.txt");
			user = (CUser)this.getDao().read(user,vLogin.getUserID());
			this.getDao().disconnect();
			// result 정리 필요 !!!!!!!!!!!!!!!!!!!!!!
			if( user == null)
				throw new UserIDNotFoundException();
			if(!user.getPassword().equals(vLogin.getPassword()))
				throw new PasswordNotMatchException();
			// result 정리 필요 !!!!!!!!!!!!!!!!!!!!!!
			vUser.setName(user.getName());
			vUser.setUserID(user.getID());
			return vUser;
	}
}