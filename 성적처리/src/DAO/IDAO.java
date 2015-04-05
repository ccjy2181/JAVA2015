package DAO;

public interface IDAO {
	
	public Object read(String filename);
	public void write(Object object, String filename);
	
}
