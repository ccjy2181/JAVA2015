package main;


import view.CExceptionView;
import view.CLoginView;
import view.CMenuView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CGangjwaControl;
import control.CLoginControl;
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
			CMenuView menuView = new CMenuView();
			// start
			VUser vUser = loginView.login();
			menuView.menu(vUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}	
}
