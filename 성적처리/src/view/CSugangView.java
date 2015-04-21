package view;

import java.io.FileNotFoundException;

import control.CSugangControl;
import entity.VLogin;
import entity.VSugang;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CSugangView  extends CView{

	public void sugangSet(VLogin vLogin)
			throws UserIDNotFoundException,
			PasswordNotMatchException,
			FileNotFoundException {
		VUser vUser =  new VUser();
		
		VSugang vSugang = (VSugang)
			((CSugangControl) this.getControl() ).input(vLogin); // 강제 타입 캐스팅
		System.out.println("Gwamok Read Result : " + vSugang.getGwamok1() + "," + vSugang.getGwamok2() );
	}
}
