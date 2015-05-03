package view;

import java.io.IOException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	
	public VUser login()
			throws UserIDNotFoundException,
			PasswordNotMatchException {
		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
		System.out.println("아이디를 입력하세요.");
		vLogin.setUserID(scanner.next());
		System.out.println("비밀번호를 입력하세요.");
		vLogin.setPassword(scanner.next());
//		vLogin.setUserID("id5");
//		vLogin.setPassword("pw5");
		VUser vUser;
		try {
			vUser = (VUser)
			((CLoginControl) this.getControl() ).login(vLogin);
			System.out.println(vUser.getUserID()+"님 환영합니다.");
			return vUser;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} // 강제 타입 캐스팅

	}

}