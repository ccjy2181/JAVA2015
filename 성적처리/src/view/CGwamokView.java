package view;

import entity.CEntity;
import entity.CGwamok;

public class CGwamokView {

	public CEntity getGwamok() {

		CEntity gwamok = new CGwamok();
		gwamok.read(null);
		return gwamok;
	}


}
