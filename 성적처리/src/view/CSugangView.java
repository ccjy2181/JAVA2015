package view;

import control.CLoginControl;
import control.CSugangControl;
import entity.VLogin;
import entity.VSugang;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CSugangView  extends CView{
	
		public void sugangSet(CLoginControl loginControl) {
			VUser vUser =  new VUser();
			VLogin vLogin = new VLogin();
			if(loginControl.getResult() == "success"){
				vUser.seteLoginResult(ELoginResult.success);
			} else if(loginControl.getResult() == "idError"){
				vUser.seteLoginResult(ELoginResult.idError);
			} else if(loginControl.getResult() == "passwordError"){
				vUser.seteLoginResult(ELoginResult.passwordError);
			} else {
				vUser.seteLoginResult(ELoginResult.fileNotFound);
			}
			vUser.setUserID(loginControl.getID());
			VSugang vSugang = (VSugang)
					((CSugangControl) this.getControl() ).input(vUser); // ���� Ÿ�� ĳ����
			System.out.println("Gwamok Read Result : " + vSugang.geteReadResult().toString());
		}
}
