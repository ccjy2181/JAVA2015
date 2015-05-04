package view;

import java.util.Scanner;

import valueObject.VLogin;
import valueObject.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	
	public CLoginView() {
		super("로그인 화면");
		// TODO Auto-generated constructor stub
	}

	
	// association
	public void show(Scanner scanner)
			throws UserIDNotFoundException,
			PasswordNotMatchException {
		
		VLogin vLogin = new VLogin();
//		System.out.println("아이디를 입력하세요.");
//		vLogin.setUserID(scanner.next());
//		System.out.println("비밀번호를 입력하세요.");
//		vLogin.setPassword(scanner.next());
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
//		VUser vUser = new VUser();
//			vUser = (VUser)
//			((CLoginControl) this.getControl() ).login(vLogin);
			System.out.println(vLogin.getUserID()+"님 환영합니다.");
	}
}