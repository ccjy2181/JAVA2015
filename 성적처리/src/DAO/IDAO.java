package DAO;

import entity.CEntity;

public interface IDAO {
	
	public Object read(CEntity entity, String filename);
	public void write(Object object, String filename);
	
}
