package 성적처리;


import java.io.IOException;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangView;
import DAO.IDAO;
import DAO.ObjectDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSugang;


public class CMain {

	public static void main(String[] args) {

		// login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new ObjectDAO();
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");

		// 과목 개설
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokcontrol = new CGwamokControl();
		gwamok = gwamokcontrol.processGwamok(gwamok);
		IDAO gwamokDAO = new ObjectDAO();
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");

		// 강좌 개설
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwacontrol = new CGangjwaControl();
		gangjwa = gangjwacontrol.processGangjwa(gangjwa);
		IDAO gangjwaDAO = new ObjectDAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		// 수강 신청
		CSugangView sugangview = new CSugangView();
		CSugang sugang = sugangview.getSugang();
		CSugangControl sugangcontrol = new CSugangControl();
		sugang = sugangcontrol.processSugang(sugang);
		IDAO sugangDAO = new ObjectDAO();
		sugangDAO.write(sugang, "sugang");
		sugang = (CSugang) sugangDAO.read("sugang");
	}

}
