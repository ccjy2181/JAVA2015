package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import entity.CEntity;
import entity.CLoginInfo;

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
	public CEntity read() {
		// TODO Auto-generated method stub
		CEntity entity = new CEntity();
		entity.read(scanner);
		return entity;
	}

	@Override
	public void write(CEntity entity) {
		// TODO Auto-generated method stub
		
	}
		
}
