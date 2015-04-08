package DAO;

import entity.CEntity;

public interface IDAO {
	
	public CEntity read(CEntity entity, String filename);
	public void write(Object object, String filename);
	
}
