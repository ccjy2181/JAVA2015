package control;

import entity.CEntity;
import control.CControl;
import entity.CMember;

public class CLoginControl extends CControl {

	private CMember member;

	public CEntity login(CEntity member) {

		this.member = (CMember)member;
		return this.member;
	}
}
