package com.hcl.ems;

public class EmsBal {

	public static boolean loginBal(int ID, String passWord) {
		return new EmsDao().loginDao(ID, passWord);
	}
}
