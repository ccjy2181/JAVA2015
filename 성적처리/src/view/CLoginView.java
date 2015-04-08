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
			System.out.println("아이디를 입력하세요.");
			readID = scanner.next();
			String temp;
			String[] Data;
			while ( (temp = dataReader.readLine()) != null ){
				Data = temp.split(" ");
				if(readID.equals(Data[0])){
					System.out.println("비밀번호를 입력하세요.");
					readPassword = scanner.next();
					if(readPassword.equals(Data[1])){
						System.out.println(Data[0] + "님 환영합니다.");
						break;
					} else {
						System.out.println("패스워드가 틀렸습니다.");
						break;
					}
				}
			}
			if(temp == null){
				System.out.println("해당 사용자 아이디가 없습니다.");
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
