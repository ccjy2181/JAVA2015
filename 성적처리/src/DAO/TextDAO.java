package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;

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
	public CEntity read(CEntity entity) {
		// TODO Auto-generated method stub
		entity.read(scanner);
		return entity;
	}

	@Override
	public void write(CEntity entity) {
		// TODO Auto-generated method stub
		entity.write(scanner);
	}
		
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.scanner.hasNext();
	}
}
