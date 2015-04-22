package view;

import java.io.FileNotFoundException;
import java.util.Vector;

import control.CSugangControl;
import entity.CGangjwa;
import entity.VSugang;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CSugangView  extends CView{

	public void sugangSincheong(VUser vUser)
			throws UserIDNotFoundException,
			PasswordNotMatchException,
			FileNotFoundException {
		// show Gangjwa List
		CSugangControl sugangControl = (CSugangControl)this.getControl();
		Vector<CGangjwa> gangjwaList = sugangControl.getCGanajwaList();
		// select Gangjwa
		// confirm sugangSincheong
		// show result
		
		VSugang vSugang = (VSugang)
			((CSugangControl) this.getControl() ).input(vUser); // 강제 타입 캐스팅
		System.out.println("Gwamok Read Result : " + vSugang.getGwamok1() + "," + vSugang.getGwamok2() );
	}
}