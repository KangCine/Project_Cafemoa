package cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.domain.CafeVO;
import cafe.service.CafeModifyService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CafeModifyAction implements Action {
	
	private String path;
	
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String currentPassword = request.getParameter("current_password");
		String newPassword = request.getParameter("new_pasword");
		String confirmPassword = request.getParameter("confirm_password");
		
		HttpSession session = request.getSession();
		CafeVO vo = (CafeVO)session.getAttribute("loginVO");
		
		if(!newPassword.equals(confirmPassword)) {
			path = "";
		}
		else {
			CafeModifyService service = new CafeModifyService();
			boolean modifyFlag = service.modify(vo.getUserid(), currentPassword, newPassword);
			
			if(!modifyFlag) {
				path = "";
			}
			else {
				session.removeAttribute("loginVO");
			}
		}
		
		return new ActionForward(path, true);
	}

}
