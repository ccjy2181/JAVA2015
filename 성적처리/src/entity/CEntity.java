package entity;

import java.io.Serializable;

abstract public class CEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	abstract void read();
	abstract void write();
}
