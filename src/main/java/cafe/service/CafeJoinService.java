package cafe.service;

import cafe.domain.CafeVO;
import cafe.persistence.CafeDAO;

import static cafe.persistence.JDBCUtil.*;

import java.sql.Connection;

public class CafeJoinService {
	public boolean register(CafeVO vo) {
		
		Connection con = getConnection();
		CafeDAO dao = new CafeDAO(con);
		
		boolean insertFlag = false;
		int result = dao.insert(vo);
		
		if(result>0) {
			insertFlag = true;
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		
		return insertFlag;
	}
}
