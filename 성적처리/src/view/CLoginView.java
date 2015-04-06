package view;

import java.util.Scanner;
import entity.CMember;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		
		CMember member = new CMember();
//		member.read(null);
		
		member.setUserID("userId");
		member.setPassword("password");

		
		member = (CMember) this.getControl().process(member);
//		return member;	
		scanner.close();
	}
	
}
