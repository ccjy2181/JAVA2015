package view;

import entity.CEntity;
import entity.CGangjwa;

public class CGangjwaView {

	public CEntity getGangjwa() {

		CEntity gangjwa = new CGangjwa();
		gangjwa.read();
		return gangjwa;
	}

}
