package com.winter.app.community;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.winter.app.util.DBConnection;

public class CommunityDAO {
	
	private DBConnection connection;
	
	public CommunityDAO() {
		this.connection = new DBConnection();
	}
	
	public int update(CommunityDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
					UPDATE COMMUNITY 
					SET TITLE = ?, NAME = ?, CONTENTS = ?, STAR = ?
					WHERE NUM=?
					""";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getTitle());
		st.setString(2, dto.getName());
		st.setString(3, dto.getContents());
		st.setInt(4, dto.getStar());
		st.setLong(5, dto.getNum());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;		
		
	}
	
	public int delete(CommunityDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "DELETE COMMUNITY WHERE NUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, dto.getNum());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
			
	}
	
	public int create(CommunityDTO dto) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = """
					INSERT INTO COMMUNITY VALUES
					(COMM_SEQ.NEXTVAL, ?, ?, ?, sysdate, ?)
					""";

		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, dto.getTitle());
		st.setString(2, dto.getName());
		st.setString(3, dto.getContents());
		st.setInt(4, dto.getStar());
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
		
		
	}
	
	public CommunityDTO detail(long num) throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COMMUNITY WHERE NUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setLong(1, num);
		
		ResultSet rs = st.executeQuery();
		
		CommunityDTO dto = null;
		if(rs.next()) {
			dto = new CommunityDTO();
			dto.setNum(rs.getLong("num"));
			dto.setTitle(rs.getString("title"));
			dto.setName(rs.getString("name"));
			dto.setContents(rs.getString("contents"));
			dto.setCreateTime(rs.getDate("createTime"));
			dto.setStar(rs.getInt("star"));
		}
		
		rs.close();
		st.close();
		con.close();
		
		return dto;
		
	}
	
	public ArrayList<CommunityDTO> list() throws Exception {
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COMMUNITY";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		ArrayList<CommunityDTO> ar = new ArrayList<>();
		
		while(rs.next()) {
			CommunityDTO dto = new CommunityDTO();
			long num = rs.getLong("num");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String contents = rs.getString("contents");
			Date createTime = rs.getDate("createTime");
			int star = rs.getInt("star");
			
			dto.setNum(num);
			dto.setTitle(title);
			dto.setName(name);
			dto.setContents(contents);
			dto.setCreateTime(createTime);
			dto.setStar(star);
			
			ar.add(dto);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
	}

}
