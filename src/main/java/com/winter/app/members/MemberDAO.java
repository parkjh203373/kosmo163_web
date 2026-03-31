package com.winter.app.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.winter.app.util.DBConnection;

public class MemberDAO {
	
	private DBConnection connection;
	
	public MemberDAO() {
		this.connection = new DBConnection();
	}
	
	public MemberDTO mypage(String id) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM MEMBERS WHERE ID = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, id);
		
		ResultSet rs = st.executeQuery();
		
		MemberDTO dto = null;
		if(rs.next()) {
			dto = new MemberDTO();
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
		
	}
	
	public MemberDTO login(MemberDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM MEMBERS WHERE ID = ? AND PW = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getId());
		st.setString(2, dto.getPw());
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setEmail(rs.getString("email"));
			
			return dto;
		}
		
		st.close();
		con.close();
		
		return null;
		
	}
	
	public int join(MemberDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
					INSERT INTO MEMBERS VALUES
					(?, ?, ?, ?)
					""";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getId());
		st.setString(2, dto.getPw());
		st.setString(3, dto.getName());
		st.setString(4, dto.getEmail());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
	}

}
