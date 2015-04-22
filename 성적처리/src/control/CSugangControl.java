package control;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;
import entity.CSugang;
import entity.VSugang;
import entity.VUser;
import exception.UserIDNotFoundException;

public class CSugangControl extends CControl {
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
			vSugang.setGwamok1(sugang.getGwamok1());
			vSugang.setGwamok2(sugang.getGwamok2());
			return vSugang;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 빨간색 에러 출력부분
		}
		return vSugang;
	}

	public Vector<CGangjwa> getCGanajwaList() throws FileNotFoundException {
		// TODO Auto-generated method stub
		this.getDao().connect("gangjwa.txt");
		Vector<CEntity> entityList = this.getDao().readAll();
		this.getDao().disconnect();	
		
		// type cast
		Vector<CGangjwa> gangjwaList = new Vector<CGangjwa>();
		for(CEntity entity : entityList){
			gangjwaList.add((CGangjwa)entity);
		}
		
		return gangjwaList;
	}

}
