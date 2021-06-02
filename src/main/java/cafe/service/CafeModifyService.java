package cafe.service;

import java.sql.Connection;

import cafe.persistence.CafeDAO;

import static cafe.persistence.JDBCUtil.*;

public class CafeModifyService {
	public boolean modify(String userid, String currentPassword, String changePassword) {
		Connection con = getConnection();
		CafeDAO dao = new CafeDAO(con);
		
		boolean modifyFlag = false;
		
		int result = dao.update(userid, currentPassword, changePassword);
		
		if(result > 0) {
			modifyFlag = true;
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return modifyFlag;
	}
}
