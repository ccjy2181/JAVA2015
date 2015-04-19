package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
		System.out.println("���̵� �Է��ϼ���.");
		vLogin.setUserID(scanner.next());
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		vLogin.setPassword(scanner.next());
		
		VUser vUser = (VUser)
				((CLoginControl) this.getControl() ).login(vLogin); // ���� Ÿ�� ĳ����
		System.out.println("Login Result : " + vUser.geteLoginResult().toString());
		// close scanner
		scanner.close();
	}

}