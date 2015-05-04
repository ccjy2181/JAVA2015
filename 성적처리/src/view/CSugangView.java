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
		super("수강 신청");
		// TODO Auto-generated constructor stub
	}

	public void show(VUser vUser, String number) throws IOException {
		// show Gangjwa List
		CGangjwaControl gangjwaControl = (CGangjwaControl) this.getControl();
		Vector<CGangjwa> gangjwaList = gangjwaControl.getCGanajwaList();
		Scanner scanner = new Scanner(System.in);
		
		if(number.equals("1")){
			// 강좌 리스트 가져오기
			for (CGangjwa gangjwa: gangjwaList){
				System.out.println("강좌 ID : "+ gangjwa.getID() + " " + gangjwa.getName());
			}
			String repeat = "y";
			while(repeat.equals("y")){
				
				try {
					// 강좌 리스트 받기
					gangjwaList = gangjwaControl.getCGanajwaList();
					for(CGangjwa gangjwa: gangjwaList){
						System.out.println("강좌 ID : " + gangjwa.getID() +" "+ gangjwa.getName());
					}
					// 수강 신청 강좌 번호 입력
					System.out.println("신청하려는 강좌번호를 입력하세요.");
					String gangjwaID = scanner.next();
					// 강좌 번호 유효성 확인
					for(CGangjwa gangjwa : gangjwaList){
						if(gangjwa.getID().equals(gangjwaID)){
							CSugang sugang =
									new CSugang(vUser.getUserID(), gangjwa.getID());
							gangjwaControl.sugangSincheong(sugang);
							System.out.println("더 수강신청 하시겠습니까? y / n");
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
			// 수강신청 내역 출력
			Vector<CSugang> sugangList = gangjwaControl.getsugangList();
		}
	}
}