package com.winter.app.test.util;

import java.sql.Connection;

import com.winter.app.contries.CountryDAO;
import com.winter.app.departments.DepartmentDAO;
import com.winter.app.util.DBConnection;

public class DBConnectionTest {

	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		try {
			Connection con = connection.getConnection();
			if(con != null) {
				System.out.println("연결 성공");
			}else {
				System.out.println("연결 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
