package cafe.service;

import java.sql.Connection;

import cafe.domain.CafeVO;
import cafe.persistence.CafeDAO;

import static cafe.persistence.JDBCUtil.*;
public class CafeLoginService {
	public CafeVO login(String userid, String currentPassword) {
		
		Connection con = getConnection();
		CafeDAO dao = new CafeDAO(con);
		
		CafeVO login = dao.isLogin(userid, currentPassword);
		
		close(con);
		
		return login;
	}
}
