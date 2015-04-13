package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		CLoginInfo member = new CLoginInfo();
		System.out.println("아이디를 입력하세요.");
		member.setUserID(scanner.next());
		System.out.println("비밀번호를 입력하세요.");
		member.setPassword(scanner.next());
		
		member = (CLoginInfo) ( (CLoginControl) this.getControl() ).login(member); // 강제 타입 캐스팅
		switch(member.geteLoginResult()){
		case success:
			System.out.println("환영합니다.");
			break;
		case idError:
			System.out.println("아이디가 존재하지 않습니다.");
			break;
		case passwordError:
			System.out.println("비밀번호가 틀립니다.");
			break;
		case error:
			System.out.println("Error!");
			break;
		}
//		return member;	
		scanner.close();
	}
	
}