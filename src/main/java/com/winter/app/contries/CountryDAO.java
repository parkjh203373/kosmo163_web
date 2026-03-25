package com.winter.app.contries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.winter.app.util.DBConnection;

public class CountryDAO {
	
	public void detail(String countryId) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, countryId);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_NAME");
			System.out.println(id + " : " + name);
		}else {
			System.out.println("나라가 없다");
		}
		
		rs.close();
		st.close();
		con.close();
		
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
