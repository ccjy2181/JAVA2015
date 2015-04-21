package main;


import view.CExceptionView;
import view.CLoginView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import control.CSugangControl;
import entity.VLogin;


public class CMain {

	public static void main(String[] args) {		
		//start program
		try {
			CLoginView loginView = new CLoginView();
			CSugangView sugangView = new CSugangView();
			CLoginControl loginControl = new CLoginControl();
			CSugangControl sugangControl = new CSugangControl();
			
			IDAO dao = new TextDAO();
			loginView.setControl(loginControl);
			sugangView.setControl(sugangControl);
			loginControl.setDao(dao);
			sugangControl.setDao(dao);

			VLogin result = loginView.login();
			sugangView.sugangSet(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}	
}
