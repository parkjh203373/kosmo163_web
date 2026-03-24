package com.winter.app.test.employees;

import com.winter.app.employees.EmployeeDAO;

public class EmployeeTest {
	
	public static void main(String[] args) {
		EmployeeDAO ed = new EmployeeDAO();
		try {
			ed.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ed.detail(199);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
