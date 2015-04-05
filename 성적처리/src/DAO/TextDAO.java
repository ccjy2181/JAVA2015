package DAO;

import java.lang.reflect.Field;

import entity.CEntity;

public class TextDAO implements IDAO{

	@Override
	public Object read(String filename) {

		return null;
	}

	@Override
	public void write(Object object, String filename) {
		Field[] fields = object.getClass().getDeclaredFields();
		((CEntity) object).write(filename);
	}
		
}
