package com.winter.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.winter.app.util.DBConnection;

public class DepartmentDAO {
	private DBConnection connection;
	
	public DepartmentDAO(){
		this.connection = new DBConnection();
	}
	
	public int create(DepartmentDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
					INSERT INTO DEPARTMENTS VALUES 
					(DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)
					""";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getDepartmentName());
		st.setInt(2, dto.getManagerId());
		st.setInt(3, dto.getLocationId());
		
		int result = st.executeUpdate();
		
		System.out.println(result);
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	public DepartmentDTO detail(int departmentId) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM DEPARTMENTS	WHERE DEPARTMENT_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setInt(1, departmentId);
		
		ResultSet rs = st.executeQuery();
		
		DepartmentDTO dto = null;
		if(rs.next()) {
			dto = new DepartmentDTO();
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			dto.setManagerId(rs.getInt("MANAGER_ID"));
			dto.setLocationId(rs.getInt("LOCATION_ID"));
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
		
	}
	
	public ArrayList<DepartmentDTO> list() throws Exception {
		//1. DB 연결
		Connection con = connection.getConnection();
		
		//2. 쿼리문 작성
		String sql = "SELECT * FROM DEPARTMENTS ORDER BY DEPARTMENT_ID DESC";
		
		//3. 쿼리문 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ?값 세팅
		
		//5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		ArrayList<DepartmentDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			DepartmentDTO dto = new DepartmentDTO();
			int id = rs.getInt("DEPARTMENT_ID");
			String name = rs.getString("DEPARTMENT_NAME");
			int mid = rs.getInt("MANAGER_ID");
			int lid = rs.getInt("LOCATION_ID");
			
			dto.setDepartmentId(id);
			dto.setDepartmentName(name);
			dto.setManagerId(mid);
			dto.setLocationId(lid);
			
			ar.add(dto);
		}
		
		//6. 연결 해제
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}

}