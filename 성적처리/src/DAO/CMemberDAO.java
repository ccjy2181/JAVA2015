package DAO;

import entity.CMember;

public class CMemberDAO {
	// Data Access Object
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("����� ID : "+ member.getUserID());
		System.out.println("����� ��й�ȣ : "+ member.getPassword());
	};
}
