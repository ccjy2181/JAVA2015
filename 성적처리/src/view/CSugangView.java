package view;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CSugangView  extends CView{

/*
	public void sugangSincheong(VUser vUser)
			throws UserIDNotFoundException,
			PasswordNotMatchException,
			IOException,
			SugangCodeNotFoundException {
		VSugang vSugang = new VSugang();
		// show Gangjwa List
		CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getCGanajwaList();
		// select Gangjwa
		try{
			for (int index=0; !gangjwaList.elementAt(index).equals(null); index++){
				System.out.println(gangjwaList.elementAt(index).getID()+" "+gangjwaList.elementAt(index).getName());
			}
		} catch (ArrayIndexOutOfBoundsException e) {	}
		System.out.println("��û�Ϸ��� ���¹�ȣ�� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		vSugang.setUserID(vUser.getUserID());
		vSugang.setGangjwaID(scanner.next());
		// confirm sugangSincheong
		
		// show result
		vSugang = gangjwaControl.selectGangjwa(vSugang);
		System.out.println(vSugang.getGangjwaID()+" "+vSugang.getGangjwaName()+" ���¸� ������û�Ͽ����ϴ�.");
		scanner.close();
		
//		vSugang = (VSugang)
//			((CGangjwaControl) this.getControl() ).input(vUser); // ���� Ÿ�� ĳ����
		System.out.println("Gangjwa List : " + vSugang.getGangjwaID() + "," + vSugang.getGangjwaName() );
	}
*/
	public void sugangSincheong(VUser vUser)
			throws UserIDNotFoundException,
			PasswordNotMatchException, IOException {
		// show Gangjwa List
		try {
			CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
			Vector<CGangjwa> gangjwaList = gangjwaControl.getCGanajwaList();
			for(CGangjwa gangjwa: gangjwaList){
				System.out.println("���� ID : " + gangjwa.getID() +" "+ gangjwa.getName());
			}
			Scanner scanner = new Scanner(System.in);
			System.out.println("��û�Ϸ��� ���¹�ȣ�� �Է��ϼ���.");
			String gangjwaID = scanner.next();
			for(CGangjwa gangjwa : gangjwaList){
				if(gangjwa.getID().equals(gangjwaID)){
					CSugang sugang =
							new CSugang(vUser.getUserID(), gangjwa.getID());
					gangjwaControl.sugangSincheong(sugang);
					
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// select Gangjwa
		// confirm sugangSincheong
		// show result
	}
}