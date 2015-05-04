package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import valueObject.VSugang;
import valueObject.VUser;
import entity.CGangjwa;
import entity.CSugang;
import exception.UserIDNotFoundException;

public class CGangjwaControl extends CControl {
	
	public VSugang input(VUser vUser) throws UserIDNotFoundException, IOException {
		VSugang vSugang = new VSugang();
		CSugang sugang = new CSugang(vUser.getUserID(),"");
		try {
			this.getDao().connect("sugang.txt","r");
			sugang = (CSugang)this.getDao().read(sugang,vUser.getUserID());
			this.getDao().disconnect();
			if( sugang == null)
				throw new UserIDNotFoundException();
			vSugang.setUserID(vUser.getUserID());
			vSugang.setGangjwaID(sugang.getGangjwaID());
			return vSugang;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 빨간색 에러 출력부분
		}
		return vSugang;
	}

	public Vector<CGangjwa> getCGanajwaList() throws IOException {
		// TODO Auto-generated method stub
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		this.getDao().connect("gangjwa.txt","r");
		while(this.getDao().hasNext()){
			CGangjwa gangjwa = new CGangjwa();
			gangjwa = (CGangjwa) this.getDao().readNext(gangjwa);
			gangjwaList.add(gangjwa);
		}
		this.getDao().disconnect();	
		return gangjwaList;
	}
	public void sugangSincheong(CSugang sugang) throws IOException {
		// TODO Auto-generated method stub
		this.getDao().connect("sugang.txt","w+");
		this.getDao().write(sugang);
		this.getDao().disconnect();
	}
	
	public Vector<CSugang> getsugangList() throws IOException {
		Vector<CSugang> sugangList = new Vector<CSugang>();
		this.getDao().connect("sugang.txt", "r");
		while(this.getDao().hasNext()){
			CGangjwa sugang = new CGangjwa();
			sugang = (CGangjwa) this.getDao().readNext(sugang);
			System.out.println("수강신청한 내용 : "+ sugang.getID()+ " "+ sugang.getName());
		}
		this.getDao().disconnect();
		return sugangList;
		
	}

}
