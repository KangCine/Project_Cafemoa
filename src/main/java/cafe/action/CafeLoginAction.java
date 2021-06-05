package cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.domain.CafeVO;
import cafe.service.CafeLoginService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CafeLoginAction implements Action {
	
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userid = request.getParameter("userid");
		String currentPassword = request.getParameter("current_Password");
		
		CafeLoginService service = new CafeLoginService();
		CafeVO login = service.login(userid, currentPassword);
		
		HttpSession session = request.getSession();
		session.setAttribute("loginVO", login);
		
		return new ActionForward(path, true);
	}

}
