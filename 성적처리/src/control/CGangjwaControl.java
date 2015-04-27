package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;
import entity.CSugang;
import entity.VSugang;
import entity.VUser;
import exception.SugangCodeNotFoundException;
import exception.UserIDNotFoundException;

public class CGangjwaControl extends CControl {
	
	public VSugang input(VUser vUser) throws FileNotFoundException, UserIDNotFoundException {
		VSugang vSugang = new VSugang();
		CSugang sugang = new CSugang();
		try {
			this.getDao().connect("sugang.txt");
			sugang = (CSugang)this.getDao().read(sugang,vUser.getUserID());
			this.getDao().disconnect();
			if( sugang == null)
				throw new UserIDNotFoundException();
			vSugang.setUserID(vUser.getUserID());
			vSugang.setGangjwaID(sugang.getGangjwaID());
			vSugang.setGangjwaName(sugang.getGangjwaName());
			return vSugang;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 빨간색 에러 출력부분
		}
		return vSugang;
	}

	public Vector<CGangjwa> getCGanajwaList() throws FileNotFoundException {
		// TODO Auto-generated method stub
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		this.getDao().connect("gangjwa.txt");
		while(this.getDao().hasNext()){
			CGangjwa gangjwa = new CGangjwa();
			gangjwa = (CGangjwa) this.getDao().readNext(gangjwa);
			gangjwaList.add(gangjwa);
		}
		this.getDao().disconnect();	
		return gangjwaList;
	}
	
	public VSugang selectCGangjwa(VSugang vSugang) throws IOException, SugangCodeNotFoundException {
		// TODO Auto-generated method stub

		CGangjwa gangjwa = new CGangjwa();
		CSugang sugang = new CSugang();
		
		this.getDao().connect("gangjwa.txt");
		gangjwa = (CGangjwa) this.getDao().read(gangjwa, vSugang.getGangjwaID());
		this.getDao().disconnect();

		if (gangjwa == null)
				throw new SugangCodeNotFoundException();
		vSugang.setGangjwaName(gangjwa.getName());
		sugang.setID(vSugang.getUserID());
		sugang.setGangjwaID(gangjwa.getID());
		
		this.getDao().write(sugang);
		
		return vSugang;
	}

	public void sugangSincheong(CSugang sugang) {
		// TODO Auto-generated method stub
		
	}
	
}
