package DAO;

import java.io.FileNotFoundException;

import entity.CEntity;

public interface IDAO {
	public CEntity read(CEntity entity, String ID);
	public CEntity sugangRead(CEntity entity, String ID);
	public void write(CEntity entity);
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public boolean hasNext();
}
