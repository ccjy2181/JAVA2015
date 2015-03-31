package view;

import java.util.Scanner;

import entity.CMember;


public class CLoginView {
	
	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		
		// input from keyboard
		CMember member = new CMember();
//		String userID = scanner.next();
		member.setUserID("userID");
		
//		String password = scanner.next();
		member.setPassword("password");

		// close scanner
		scanner.close();
		return member;
		
	}


	
}
