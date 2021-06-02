package cafe.service;

import java.sql.Connection;

import cafe.persistence.CafeDAO;

import static cafe.persistence.JDBCUtil.*;

public class CafeLeaveService {
	public boolean leave(String userid,String currentPassword) {
		
		Connection con = getConnection();
		CafeDAO dao = new CafeDAO(con);
		
		boolean removeFlag = false;
		
		int result = dao.remove(userid, currentPassword);
		
		if(result > 0) {
			removeFlag = true;
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return removeFlag;
	}
}
