package ����ó��;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import view.CSugangView;
import DAO.DAO;
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
		// Model-View-Controller Pattern: 3-Tiers
		// test
		// login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		DAO memberDAO = new DAO();
		memberDAO.write(member, "member");
		member = (CMember) memberDAO.read("member");

		// ���� ����
		CGwamokView gwamokview = new CGwamokView();
		CGwamok gwamok = gwamokview.getGwamok();
		CGwamokControl gwamokcontrol = new CGwamokControl();
		gwamok = gwamokcontrol.processGwamok(gwamok);
		DAO gwamokDAO = new DAO();
		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");

		// ���� ����
		CGangjwaView gangjwaview = new CGangjwaView();
		CGangjwa gangjwa = gangjwaview.getGangjwa();
		CGangjwaControl gangjwacontrol = new CGangjwaControl();
		gangjwa = gangjwacontrol.processGangjwa(gangjwa);
		DAO gangjwaDAO = new DAO();
		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		// ���� ��û
		CSugangView sugangview = new CSugangView();
		CSugang sugang = sugangview.getSugang();
		CSugangControl sugangcontrol = new CSugangControl();
		sugang = sugangcontrol.processSugang(sugang);
		DAO sugangDAO = new DAO();
		sugangDAO.write(sugang, "sugang");
		sugang = (CSugang) sugangDAO.read("sugang");
	}

}
