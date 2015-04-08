package view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView{
	
	public void login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		String readID = null;
		String readPassword = null;
		
		try {
			BufferedReader dataReader = new BufferedReader(new FileReader("member.txt"));
			System.out.println("���̵� �Է��ϼ���.");
			readID = scanner.next();
			String temp;
			String[] Data;
			while ( (temp = dataReader.readLine()) != null ){
				Data = temp.split(" ");
				if(readID.equals(Data[0])){
					System.out.println("��й�ȣ�� �Է��ϼ���.");
					readPassword = scanner.next();
					if(readPassword.equals(Data[1])){
						System.out.println(Data[0] + "�� ȯ���մϴ�.");
						break;
					} else {
						System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
						break;
					}
				}
			}
			if(temp == null){
				System.out.println("�ش� ����� ���̵� �����ϴ�.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		member = (CMember) this.getControl().process(member);
//		return member;	
		scanner.close();
	}
	
}
