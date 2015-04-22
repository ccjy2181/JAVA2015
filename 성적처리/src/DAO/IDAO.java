package DAO;

import java.io.FileNotFoundException;
import java.util.Vector;

import entity.CEntity;

public interface IDAO {
	public CEntity read(CEntity entity, String ID);
	public void write(CEntity entity);
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public Vector<CEntity> readAll();
}
