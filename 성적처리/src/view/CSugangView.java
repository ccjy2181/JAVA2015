package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CSugangControl;
import entity.CGangjwa;
import entity.VSugang;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.SugangCodeNotFoundException;
import exception.UserIDNotFoundException;

public class CSugangView  extends CView{

	public void sugangSincheong(VUser vUser)
			throws UserIDNotFoundException,
			PasswordNotMatchException,
			IOException,
			SugangCodeNotFoundException {
		Scanner scanner = new Scanner(System.in);
		VSugang vSugang = new VSugang();
		// show Gangjwa List
		CSugangControl sugangControl = (CSugangControl)this.getControl();
		Vector<CGangjwa> gangjwaList = sugangControl.getCGanajwaList();
		// select Gangjwa
		try{
			for (int index=0; !gangjwaList.elementAt(index).equals(null); index++){
				System.out.println(gangjwaList.elementAt(index).getID()+" "+gangjwaList.elementAt(index).getName());
			}
		} catch (ArrayIndexOutOfBoundsException e) {	}
		System.out.println("신청하려는 강좌번호를 입력하세요.");
		vSugang.setUserID(vUser.getUserID());
		vSugang.setGangjwaID(scanner.next());
		// confirm sugangSincheong
		
		// show result
		vSugang = sugangControl.selectGangjwa(vSugang);
		System.out.println(vSugang.getGangjwaID()+" "+vSugang.getGangjwaName()+" 강좌를 수강신청하였습니다.");
		scanner.close();
		
//		vSugang = (VSugang)
//			((CSugangControl) this.getControl() ).input(vUser); // 강제 타입 캐스팅
		System.out.println("Gangjwa List : " + vSugang.getGangjwaID() + "," + vSugang.getGangjwaName() );
	}
}