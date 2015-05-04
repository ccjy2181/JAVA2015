package main;


import valueObject.VUser;
import view.CExceptionView;
import view.CLoginView;
import view.CMainView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CGangjwaControl;
import control.CLoginControl;


public class CMain {

	public static void main(String[] args) {		
		//start program
		try {
			// components
//			CMainView menuView = new CMainView();
//			CSugangView sugangView = new CSugangView();
//			CLoginControl loginControl = new CLoginControl();
//			CGangjwaControl sugangControl = new CGangjwaControl();
//			IDAO dao = new TextDAO();
//			
//			// association
//			menuView.setControl(loginControl);
//			sugangView.setControl(sugangControl);
//			loginControl.setDao(dao);
//			sugangControl.setDao(dao);
			
			// start
			CMainView mainView = new CMainView();
			mainView.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			CExceptionView.processException(e);
		}
	}	
}
