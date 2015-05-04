package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import valueObject.VUser;
import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import exception.SugangCodeNotMatchException;

public class CSugangView  extends CView{

	public CSugangView() {
		super("���� ��û");
		// TODO Auto-generated constructor stub
	}

	public void show(VUser vUser, String number) throws IOException {
		// show Gangjwa List
		CGangjwaControl gangjwaControl = (CGangjwaControl) this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getCGanajwaList();
		Scanner scanner = new Scanner(System.in);
		
		if(number.equals("1")){
			// ���� ����Ʈ ��������
			for (CGangjwa gangjwa: gangjwaList){
				System.out.println("���� ID : "+ gangjwa.getID() + " " + gangjwa.getName());
			}
			String repeat = "y";
			while(repeat.equals("y")){
				
				try {
					// ���� ����Ʈ �ޱ�
					gangjwaList = gangjwaControl.getCGanajwaList();
					for(CGangjwa gangjwa: gangjwaList){
						System.out.println("���� ID : " + gangjwa.getID() +" "+ gangjwa.getName());
					}
					// ���� ��û ���� ��ȣ �Է�
					System.out.println("��û�Ϸ��� ���¹�ȣ�� �Է��ϼ���.");
					String gangjwaID = scanner.next();
					// ���� ��ȣ ��ȿ�� Ȯ��
					for(CGangjwa gangjwa : gangjwaList){
						if(gangjwa.getID().equals(gangjwaID)){
							CSugang sugang =
									new CSugang(vUser.getUserID(), gangjwa.getID());
							gangjwaControl.sugangSincheong(sugang);
							System.out.println("�� ������û �Ͻðڽ��ϱ�? y / n");
							repeat = scanner.next();
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
			if(repeat == "y"){
				show(vUser,"1");
			}else{
				return;
			}
		}else if(number.equals("2")){
			// ������û ���� ���
			Vector<CSugang> sugangList = gangjwaControl.getsugangList();
		}
	}
}