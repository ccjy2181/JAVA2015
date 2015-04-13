package main;


import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;


public class CMain {

	public static void main(String[] args) {

		// create objects

		// view
		CLoginView loginView = new CLoginView();
		// control
		CLoginControl loginControl = new CLoginControl();
		// dao
		IDAO dao = new TextDAO();

		//association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
		//start program
		loginView.login();

	}	
}
