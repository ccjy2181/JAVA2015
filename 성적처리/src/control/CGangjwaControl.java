package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import entity.CGangjwa;
import entity.CSugang;
import entity.VSugang;
import entity.VUser;
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
	public void sugangSincheong(CSugang sugang) {
		// TODO Auto-generated method stub
		
	}
	
}
