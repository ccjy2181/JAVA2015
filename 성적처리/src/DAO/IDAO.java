package DAO;

import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

public interface IDAO {
	public CEntity read(CEntity entity);
	public void write(CEntity entity);
	public void connect(String name) throws FileNotFoundException;
	public void disconnect();
	public boolean hasNext();
}
