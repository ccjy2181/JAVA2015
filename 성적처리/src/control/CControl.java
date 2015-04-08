package control;

import DAO.IDAO;

public class CControl {
	private IDAO dao;
	
	//포인터 연결에만 사용
	public IDAO getDao() {  return dao;	} 
	public void setDao(IDAO dao) {	this.dao = dao;	}

}
