package com.winter.app.test.departments;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;

public class DepartmentTest {

	public static void main(String[] args) {
		DepartmentDAO dd = new DepartmentDAO();
		
		try {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartmentName("class4");
			dto.setManagerId(200);
			dto.setLocationId(1700);
			dd.create(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
