package cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.service.CafeLeaveService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CafeLeaveAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userid = request.getParameter("userid");
		String currentPassword = request.getParameter("current_Password");
		
		CafeLeaveService service = new CafeLeaveService();
		boolean removeFlag = service.leave(userid, currentPassword);
		
		if(removeFlag) {
			HttpSession session = request.getSession();
			session.removeAttribute("loginVO");
		}
		else {
			path = "";
		}
		
		return new ActionForward(path, true);
	}

}
