package control;

import entity.CEntity;
import DAO.IDAO;

public class CControl {
	private IDAO dao;
	public IDAO getDao() {  return dao;	}
	public void setDao(IDAO dao) {	this.dao = dao;	}
	
	public CEntity process(CEntity entity){
		entity = dao.read(entity, "member.txt");
		return entity;
	}

}
