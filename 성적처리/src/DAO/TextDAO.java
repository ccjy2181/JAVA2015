package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import entity.CEntity;
import entity.CGangjwa;

public class TextDAO implements IDAO{
	private Scanner scanner;
	@Override
	public void connect(String name) throws FileNotFoundException {
		// TODO Auto-generated method stub
		this.scanner = new Scanner(new File(name));
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		this.scanner.close();
	}	
	
	@Override
	public CEntity read(CEntity entity, String ID) {
		// TODO Auto-generated method stub
		while(scanner.hasNext()){
			entity.read(scanner);
			if(entity.getID().equals(ID)){
				return entity;
			}
		}
		return null;
	}

	@Override
	public void write(CEntity entity) throws IOException {
		// TODO Auto-generated method stub
		entity.write(scanner);
	}

	@Override
	public Vector<CEntity> readAll() {
		// TODO Auto-generated method stub
		Vector<CEntity> ventity = new Vector<CEntity>();
		while (scanner.hasNext()) {
			CGangjwa gangjwa = new CGangjwa();
			gangjwa.read(scanner);
			ventity.add(gangjwa);
		}	
		return ventity;
	}
}
