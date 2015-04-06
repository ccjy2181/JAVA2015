package view;

import entity.CEntity;
import entity.CMember;

public class CLoginView {
	
	public CEntity login() {
		
		CEntity member = new CMember();
		member.read(null);
		return member;	
	}
	
}
