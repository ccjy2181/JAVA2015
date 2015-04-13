package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		CLoginInfo member = new CLoginInfo();
		System.out.println("���̵� �Է��ϼ���.");
		member.setUserID(scanner.next());
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		member.setPassword(scanner.next());
		
		member = (CLoginInfo) ( (CLoginControl) this.getControl() ).login(member); // ���� Ÿ�� ĳ����
		switch(member.geteLoginResult()){
		case success:
			System.out.println("ȯ���մϴ�.");
			break;
		case idError:
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			break;
		case passwordError:
			System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			break;
		case error:
			System.out.println("Error!");
			break;
		}
//		return member;	
		scanner.close();
	}
	
}