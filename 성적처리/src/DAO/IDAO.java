package DAO;

public interface IDAO {
	
	public Object read(Class clazz, String filename);
	public void write(Object object, String filename);
	
}
