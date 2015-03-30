package view;

import java.util.Scanner;

import entity.CMember;


public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		
		// input from keyboard
		CMember member = new CMember();
		System.out.print("����� ID�� �Է� �ϼ���. : ");
		String userID = scanner.next();
		member.setUserID(userID);
		
		System.out.print("����� password�� �Է� �ϼ���. : ");
		String password = scanner.next();
		member.setPassword(password);

		// close scanner
		scanner.close();
		return member;
		
	}


	
}
