package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CGangjwaControl;
import entity.CGangjwa;
import entity.CSugang;
import entity.VUser;
import exception.SugangCodeNotMatchException;

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
		System.out.println("신청하려는 강좌번호를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		vSugang.setUserID(vUser.getUserID());
		vSugang.setGangjwaID(scanner.next());
		// confirm sugangSincheong
		
		// show result
		vSugang = gangjwaControl.selectGangjwa(vSugang);
		System.out.println(vSugang.getGangjwaID()+" "+vSugang.getGangjwaName()+" 강좌를 수강신청하였습니다.");
		scanner.close();
		
//		vSugang = (VSugang)
//			((CGangjwaControl) this.getControl() ).input(vUser); // 강제 타입 캐스팅
		System.out.println("Gangjwa List : " + vSugang.getGangjwaID() + "," + vSugang.getGangjwaName() );
	}
*/
/*
	public void sugangSincheong(VUser vUser, String number)
			throws UserIDNotFoundException,
			PasswordNotMatchException{
		// show Gangjwa List
		try {
			// 강좌 리스트 받기
			CGangjwaControl gangjwaControl = (CGangjwaControl)this.getControl();
			Vector<CGangjwa> gangjwaList;
			gangjwaList = gangjwaControl.getCGanajwaList();
			for(CGangjwa gangjwa: gangjwaList){
				System.out.println("강좌 ID : " + gangjwa.getID() +" "+ gangjwa.getName());
			}
			// 수강 신청 강좌 번호 입력
			Scanner scanner = new Scanner(System.in);
			System.out.println("신청하려는 강좌번호를 입력하세요.");
			String gangjwaID = scanner.next();
			// 강좌 번호 유효성 확인
			for(CGangjwa gangjwa : gangjwaList){
				if(gangjwa.getID().equals(gangjwaID)){
					CSugang sugang =
							new CSugang(vUser.getUserID(), gangjwa.getID());
					gangjwaControl.sugangSincheong(sugang);
					return;
				}
			}
			throw new SugangCodeNotMatchException("강좌 ID가 일치하지 않습니다.");
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// select Gangjwa
		// confirm sugangSincheong
		// show result
	}
	*/
		public void sugangSingcheong(VUser vUser, String number) throws IOException {
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
					sugangSingcheong(vUser,"1");
				}else{
					return;
				}
		}else if(number.equals("2")){
			// 수강신청 내역 출력
			Vector<CSugang> sugangList = gangjwaControl.getsugangList();
		}
	}
}