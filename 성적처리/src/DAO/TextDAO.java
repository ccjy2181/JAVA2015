package DAO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entity.CEntity;

public class TextDAO implements IDAO{
	private Scanner scanner;
	private BufferedWriter writer;
	private String mode;
	@Override
	public void connect(String name, String mode) throws IOException {
		// TODO Auto-generated method stub
		this.mode = mode;
		if(this.mode.equals("r")){
			this.scanner = new Scanner(new File(name));	
		} else if(this.mode.equals("w")){		// w는 덮어쓰기
			 this.writer = new BufferedWriter(new FileWriter(name, true));
		} else if(this.mode.equals("w+")){		// w+ 는 붙여쓰기
			 this.writer = new BufferedWriter(new FileWriter(name, false));
		}
	}

	@Override
	public void disconnect() throws IOException {
		// TODO Auto-generated method stub
		if(this.mode.equals("r")){
			this.scanner.close();
		} else{
			this.writer.close();
		}
	}	
	
	@Override
	public CEntity readNext(CEntity entity) {
		// TODO Auto-generated method stub
		entity.read(scanner);
		return entity;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return scanner.hasNext();
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
		entity.write(writer);
	}
/*
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
*/
}
