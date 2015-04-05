package entity;

import java.io.Serializable;

abstract public class CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	public abstract void read();
	public abstract void write(String filename);

}
