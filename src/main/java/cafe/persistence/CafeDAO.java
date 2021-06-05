package cafe.persistence;

import static cafe.persistence.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cafe.domain.CafeVO;

public class CafeDAO {
	
	private Connection con;
	
	public CafeDAO(Connection con) {
		this.con = con;
	}
	//로그인
	public CafeVO isLogin(String userid,String currentPassword) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CafeVO vo = null;
		
		try {
			String sql="select userid,password,name,addr,phone,gender,email from cafeTBL "
					 + "where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, currentPassword);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				vo = new CafeVO();
				vo.setUserid(rs.getString("userid"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAddr(rs.getString("addr"));
				vo.setPhone(rs.getString("phone"));
				vo.setGender(rs.getString("gender"));
				vo.setEmail(rs.getString("email"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
	//회원탈퇴
	public int remove(String userid,String currentPassword) {
		int result = 0;
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from cafeTBL where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, currentPassword);
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	//회원 비밀번호 수정
	public int update(String userid, String currentPassword, String changePassword) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update cafeTBL set password=? where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, changePassword);
			pstmt.setString(2, userid);
			pstmt.setString(3, currentPassword);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		
		return result;
	}
	//회원 가입
	public int insert(CafeVO vo) {
		int result=0;
		PreparedStatement pstmt=null;
		
		try {
			String sql = "insert into cafeTBL(userid,password,name,addr,phone,gender,email";
			sql += " values(?,?,?,?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getAddr());
			pstmt.setString(5, vo.getPhone());
			pstmt.setString(6, vo.getGender());
			pstmt.setString(7, vo.getEmail());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
}
