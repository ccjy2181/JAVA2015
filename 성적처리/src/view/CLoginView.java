package view;

import java.util.Scanner;

import valueObject.VLogin;
import valueObject.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CLoginView extends CView{
	
	public CLoginView() {
		super("�α��� ȭ��");
		// TODO Auto-generated constructor stub
	}

	
	// association
	public void show(Scanner scanner)
			throws UserIDNotFoundException,
			PasswordNotMatchException {
		
		VLogin vLogin = new VLogin();
//		System.out.println("���̵� �Է��ϼ���.");
//		vLogin.setUserID(scanner.next());
//		System.out.println("��й�ȣ�� �Է��ϼ���.");
//		vLogin.setPassword(scanner.next());
		vLogin.setUserID("id5");
		vLogin.setPassword("pw5");
//		VUser vUser = new VUser();
//			vUser = (VUser)
//			((CLoginControl) this.getControl() ).login(vLogin);
			System.out.println(vLogin.getUserID()+"�� ȯ���մϴ�.");
	}
}