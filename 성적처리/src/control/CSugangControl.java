package control;

import java.io.FileNotFoundException;

import entity.CSugang;
import entity.VSugang;
import entity.VSugang.EReadResult;
import entity.VUser;
import entity.VUser.ELoginResult;

public class CSugangControl extends CControl {
	public VSugang input (VUser vUser) {
		VSugang vSugang = new VSugang();
		CSugang sugang = new CSugang();
		try {
			this.getDao().connect("sugang.txt");
			if(vUser.geteLoginResult().equals(ELoginResult.success)){
				while(this.getDao().hasNext()) {
					sugang = (CSugang)this.getDao().sugangRead(sugang, vUser.getUserID());
					vSugang.seteReadResult(EReadResult.success);
					vSugang.setGwamok1(sugang.getGwamok1());
					vSugang.setGwamok2(sugang.getGwamok2());
				}
			}
			this.getDao().disconnect();
			if( vUser.geteLoginResult().equals(ELoginResult.idError)) {
				vSugang.seteReadResult(EReadResult.loginError);
				return vSugang;
			}
			if(vUser.geteLoginResult().equals(ELoginResult.passwordError)){
				vSugang.seteReadResult(EReadResult.loginError);
				return vSugang;
			}
			vUser.seteLoginResult(ELoginResult.success);
			vSugang.seteReadResult(EReadResult.success);
			System.out.println(vSugang.getGwamok1());
			System.out.println(vSugang.getGwamok2());
			return vSugang;
		/*
		try{
			this.getDao().connect("sugang.txt");
			if(vUser.geteLoginResult().equals(ELoginResult.success)){
				while(this.getDao().hasNext()) {
					sugang = (CSugang)this.getDao().read(sugang, vUser.getUserID());
					vSugang.seteReadResult(EReadResult.success);
					vSugang.setUserID(sugang.getID());
					vSugang.setGwamok1(sugang.getGwamok1());
					vSugang.setGwamok2(sugang.getGwamok2());
				}
				System.out.println(vSugang.getGwamok1());
				System.out.println(vSugang.getGwamok2());
			} else {
				vSugang.seteReadResult(EReadResult.loginError);
			}
			this.getDao().disconnect();
			return vSugang;
			*/
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();  // 빨간색 에러 출력부분
			vSugang.seteReadResult(EReadResult.fileNotFound);
		}
		return vSugang;
	}
}
