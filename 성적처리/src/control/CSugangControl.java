package control;

import java.io.FileNotFoundException;

import entity.CSugang;
import entity.VLogin;
import entity.VSugang;
import exception.UserIDNotFoundException;

public class CSugangControl extends CControl {
	public VSugang input(VLogin vLogin) throws FileNotFoundException, UserIDNotFoundException {
		VSugang vSugang = new VSugang();
		CSugang sugang = new CSugang();
		try {
			this.getDao().connect("sugang.txt");
			sugang = (CSugang)this.getDao().read(sugang,vLogin.getUserID());
			this.getDao().disconnect();
			if( sugang == null)
				throw new UserIDNotFoundException();
			vSugang.setUserID(vLogin.getUserID());
			vSugang.setGwamok1(sugang.getGwamok1());
			vSugang.setGwamok2(sugang.getGwamok2());
			return vSugang;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 빨간색 에러 출력부분
		}
		return vSugang;
	}

}
