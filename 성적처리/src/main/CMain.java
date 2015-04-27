package main;


import view.CExceptionView;
import view.CLoginView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import control.CGangjwaControl;
import entity.VUser;


public class CMain {

	public static void main(String[] args) {		
		//start program
		try {
			// components
			CLoginView loginView = new CLoginView();
			CSugangView sugangView = new CSugangView();
			CLoginControl loginControl = new CLoginControl();
			CGangjwaControl sugangControl = new CGangjwaControl();
			IDAO dao = new TextDAO();
			// association
			loginView.setControl(loginControl);
			sugangView.setControl(sugangControl);
			loginControl.setDao(dao);
			sugangControl.setDao(dao);
			// start
			VUser vUser = loginView.login();
			sugangView.sugangSincheong(vUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}	
}
