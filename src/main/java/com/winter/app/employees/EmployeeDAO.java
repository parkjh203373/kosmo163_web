package com.winter.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

import com.winter.app.util.DBConnection;

public class EmployeeDAO {
	
	private DBConnection connection;
	
	public EmployeeDAO() {
		this.connection = new DBConnection();
	}
	
	public EmployeeDTO login(EmployeeDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ? AND PASSWORD = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, dto.getEmployeeId());
		st.setString(2, dto.getPassword());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			dto.setFirstName(rs.getString("FIRST_NAME"));
			dto.setLastName(rs.getString("LAST_NAME"));
			dto.setHireDate(rs.getDate("HIRE_DATE"));
			dto.setSalary(rs.getDouble("SALARY"));
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			
			return dto;
		}
		
		return null;
		
	}
	
	public void detail(int employeeId) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, employeeId);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			int id = rs.getInt("EMPLOYEE_ID");
			String first_name = rs.getString("FIRST_NAME");
			String last_name = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			String phone_number = rs.getString("PHONE_NUMBER");
			LocalDateTime hire_date = rs.getObject("HIRE_DATE", LocalDateTime.class);
			String job_id = rs.getString("JOB_ID");
			int salary = rs.getInt("SALARY");
			String commission_pct = rs.getString("COMMISSION_PCT");
			String manager_id = rs.getString("MANAGER_ID");
			String department_id = rs.getString("DEPARTMENT_ID");
			
			System.out.println(id + " " + first_name + " " + last_name + " " + email + " " + phone_number + " " + hire_date
					 + " " + job_id + " " + salary + " " + commission_pct + " " + manager_id + " " + department_id);
		}else {
			System.out.println("해당하는 ID의 사원이 없습니다");
		}
		
		rs.close();
		st.close();
		con.close();
		
	}
	
	public void list() throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM EMPLOYEES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("EMPLOYEE_ID");
			String first_name = rs.getString("FIRST_NAME");
			String last_name = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");
			String phone_number = rs.getString("PHONE_NUMBER");
			LocalDateTime hire_date = rs.getObject("HIRE_DATE", LocalDateTime.class);
			String job_id = rs.getString("JOB_ID");
			int salary = rs.getInt("SALARY");
			String commission_pct = rs.getString("COMMISSION_PCT");
			String manager_id = rs.getString("MANAGER_ID");
			String department_id = rs.getString("DEPARTMENT_ID");
			
			System.out.println(id + " " + first_name + " " + last_name + " " + email + " " + phone_number + " " + hire_date
					 + " " + job_id + " " + salary + " " + commission_pct + " " + manager_id + " " + department_id);
		}
		
		rs.close();
		st.close();
		con.close();
		
	}

}
