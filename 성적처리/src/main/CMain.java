package main;


import view.CLoginView;
import view.CSugangView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import control.CSugangControl;


public class CMain {

	public static void main(String[] args) {

		// create objects

		// view
		CLoginView loginView = new CLoginView();
		CSugangView sugangView = new CSugangView();
		// control
		CLoginControl loginControl = new CLoginControl();
		CSugangControl sugangControl = new CSugangControl();
		// dao
		IDAO dao = new TextDAO();

		//association
		loginView.setControl(loginControl);
		sugangView.setControl(sugangControl);
		loginControl.setDao(dao);
		sugangControl.setDao(dao);
		
		//start program
		loginView.login();
		sugangView.sugangSet(loginControl);

	}	
}
