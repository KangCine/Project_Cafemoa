package cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cafe.domain.CafeVO;
import cafe.service.CafeJoinService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CafeJoinAction implements Action {
	
	private String path;
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		CafeVO vo = new CafeVO();
		vo.setUserid(request.getParameter("userid"));
		vo.setPassword(request.getParameter("password"));
		vo.setConfirmPassword(request.getParameter("confirm_password"));
		vo.setName(request.getParameter("name"));
		vo.setAddr(request.getParameter("addr"));
		vo.setPhone(request.getParameter("phone"));
		vo.setGender(request.getParameter("gender"));
		vo.setEmail(request.getParameter("email"));
		
		if(vo.passwordEqualsConfirmPassword()) {
			CafeJoinService service = new CafeJoinService();
			boolean insertFlag = service.register(vo);
			
			if(!insertFlag) {
				path = "";
			}
		}else {
				path = "";
		}
		return new ActionForward(path, true);
	}
		
}

