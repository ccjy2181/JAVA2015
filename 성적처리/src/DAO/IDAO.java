package DAO;

import java.io.FileNotFoundException;

import entity.CEntity;

public interface IDAO {
	public CEntity read();
	public void write(CEntity entity);
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
}
