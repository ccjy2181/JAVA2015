package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		CLoginInfo member = new CLoginInfo();
		
		member.setUserID("userID");
		member.setPassword("password");
		
		member = (CLoginInfo) ( (CLoginControl) this.getControl() ).login(member); // 강제 타입 캐스팅
//		return member;	
		scanner.close();
	}
	
}