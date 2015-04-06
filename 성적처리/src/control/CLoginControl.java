package control;

import entity.CEntity;
import entity.CMember;

public class CLoginControl {

	private CMember member;

	public CEntity login(CEntity member) {

		this.member = (CMember)member;
		return this.member;
	}
}
