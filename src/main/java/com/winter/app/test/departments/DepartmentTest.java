package com.winter.app.test.departments;

import com.winter.app.departments.DepartmentDAO;

public class DepartmentTest {

	public static void main(String[] args) {
		DepartmentDAO dd = new DepartmentDAO();
		try {
			dd.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			dd.detail(50);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
