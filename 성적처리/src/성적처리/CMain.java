package 성적처리;


import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangView;
import DAO.IDAO;
import DAO.ObjectDAO;
import DAO.TextDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import control.CSugangControl;
import entity.CEntity;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSugang;


public class CMain {

	public static void main(String[] args) {

		// login
		CLoginView loginView = new CLoginView();
		CEntity member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new TextDAO();
//		memberDAO.write(member, "member");
//		CMember member = new CMember();
		member = (CMember) memberDAO.read(member.getClass(), "member");
/*
		// 과목 개설
		CGwamokView gwamokview = new CGwamokView();
		CEntity gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokcontrol = new CGwamokControl();
		gwamok = gwamokcontrol.processGwamok(gwamok);
		IDAO gwamokDAO = new TextDAO();
//		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");

		// 강좌 개설
		CGangjwaView gangjwaview = new CGangjwaView();
		CEntity gangjwa = (CGangjwa)gangjwaview.getGangjwa();
		CGangjwaControl gangjwacontrol = new CGangjwaControl();
		gangjwa = gangjwacontrol.processGangjwa(gangjwa);
		IDAO gangjwaDAO = new TextDAO();
//		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		// 수강 신청
		CSugangView sugangview = new CSugangView();
		CSugang sugang = sugangview.getSugang();
		CSugangControl sugangcontrol = new CSugangControl();
		sugang = sugangcontrol.processSugang(sugang);
		IDAO sugangDAO = new ObjectDAO();
		sugangDAO.write(sugang, "sugang");
		sugang = (CSugang) sugangDAO.read("sugang");
*/	}

}
