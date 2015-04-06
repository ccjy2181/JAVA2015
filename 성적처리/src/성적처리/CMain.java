package 己利贸府;


import view.CLoginView;
import DAO.IDAO;
import DAO.TextDAO;
import control.CLoginControl;
import entity.CEntity;
import entity.CMember;


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
		member = (CMember) memberDAO.read(member, "member.txt");

	}	
}
