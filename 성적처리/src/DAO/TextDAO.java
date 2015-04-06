package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.Scanner;

import entity.CEntity;

public class TextDAO implements IDAO{

	@Override
	public Object read(CEntity entity, String filename) {
		try {
			Scanner scanner = new Scanner(new File(filename));
			entity.read(scanner);
			return entity;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void write(Object object, String filename) {
		Field[] fields = object.getClass().getDeclaredFields();
		((CEntity) object).write();
	}
		
}
