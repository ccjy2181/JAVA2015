package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import entity.CEntity;

public interface IDAO {
	public CEntity read(CEntity entity, String ID);
	public void write(CEntity entity) throws IOException;
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public Vector<CEntity> readAll();
}
