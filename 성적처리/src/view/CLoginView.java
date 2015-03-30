package view;

import java.util.Scanner;

import entity.CMember;


public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		
		// input from keyboard
		CMember member = new CMember();
		System.out.print("사용자 ID를 입력 하세요. : ");
		String userID = scanner.next();
		member.setUserID(userID);
		
		System.out.print("사용자 password를 입력 하세요. : ");
		String password = scanner.next();
		member.setPassword(password);

		// close scanner
		scanner.close();
		return member;
		
	}


	
}
