package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
		System.out.println("아이디를 입력하세요.");
		vLogin.setUserID(scanner.next());
		System.out.println("비밀번호를 입력하세요.");
		vLogin.setPassword(scanner.next());
		
		VUser vUser = (VUser)
				((CLoginControl) this.getControl() ).login(vLogin); // 강제 타입 캐스팅
		System.out.println("Login Result : " + vUser.geteLoginResult().toString());
		// close scanner
		scanner.close();
	}

}