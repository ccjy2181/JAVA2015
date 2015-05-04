package view;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import control.CControl;
import exception.PasswordNotMatchException;
import exception.UserIDNotFoundException;

public class CView {
	private String menuText;
	private CControl control;
	private Vector<CView> viewList;


	public void add(CView view) {		viewList.add(view);	}
	public CControl getControl() {		return control;	}
	public void setControl(CControl control) {		this.control = control;	}
	public String getMenuText() {			return menuText;		}
	
	public CView(String menuText){
		this.menuText = menuText;
		viewList = new Vector<CView>();
	}
	
	public void show(Scanner scanner) throws IOException, UserIDNotFoundException, PasswordNotMatchException{
		int selection = 0;
		while(selection != 9){
			// print out child menuItems
			for(int i =0; i<viewList.size();i++){
				System.out.println(i+ ". " + viewList.get(i).getMenuText());
			}
			System.out.print("--Selection Input : ");
			selection = scanner.nextInt();
			viewList.get(selection).show(scanner);
		}
	}
}
