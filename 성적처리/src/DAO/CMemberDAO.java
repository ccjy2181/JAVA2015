package DAO;

import entity.CMember;

public class CMemberDAO {
	// Data Access Object
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("사용자 ID : "+ member.getUserID());
		System.out.println("사용자 비밀번호 : "+ member.getPassword());
	};
}
