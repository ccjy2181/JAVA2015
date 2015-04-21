package view;

import java.io.FileNotFoundException;
import java.util.Scanner;

import control.CLoginControl;
import entity.VLogin;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	
	public VLogin login()
			throws FileNotFoundException,
			UserIDNotFoundException,
			PasswordNotMatchException {
		Scanner scanner = new Scanner(System.in);
		VLogin vLogin = new VLogin();
//		System.out.println("���̵� �Է��ϼ���.");
//		vLogin.setUserID(scanner.next());
//		System.out.println("��й�ȣ�� �Է��ϼ���.");
//		vLogin.setPassword(scanner.next());
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
		VUser vUser = (VUser)
			((CLoginControl) this.getControl() ).login(vLogin); // ���� Ÿ�� ĳ����
		System.out.println("Login Result : " + vUser.getName());

		// close scanner
		scanner.close();
		return vLogin;

	}

}