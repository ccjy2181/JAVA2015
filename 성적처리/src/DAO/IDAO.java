package DAO;

import java.io.FileNotFoundException;
import java.io.IOException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name, String mode) throws IOException;
	public void disconnect() throws IOException ;
	public CEntity read(CEntity entity, String ID);
	public void write(CEntity entity) throws IOException;
//	public Vector<CEntity> readAll();
	public CEntity readNext(CEntity entity);
	public boolean hasNext();
}
