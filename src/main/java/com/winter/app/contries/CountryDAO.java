package com.winter.app.contries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.util.DBConnection;

public class CountryDAO {
	
	public int create(CountryDTO dto) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "INSERT INTO COUNTRIES VALUES (?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getCountryId());
		st.setString(2, dto.getCountryName());
		st.setInt(3, dto.getRegionId());
		
		int result = st.executeUpdate();
		
		System.out.println(result);
		
		st.close();
		con.close();
		
		return result;
		
	}
	
	public CountryDTO detail(String countryId) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, countryId);
		
		ResultSet rs = st.executeQuery();
		
		CountryDTO dto = null;
		if(rs.next()) {
			dto = new CountryDTO();
			dto.setCountryId(rs.getString("COUNTRY_ID"));
			dto.setCountryName(rs.getString("COUNTRY_NAME"));

		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
		
	}
	
	public ArrayList<CountryDTO> list() throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		ArrayList<CountryDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			CountryDTO dto = new CountryDTO();
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			
			dto.setCountryId(id);
			dto.setCountryName(name);
			
			ar.add(dto);
			
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}

}
