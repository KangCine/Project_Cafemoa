package cafe.action;

public class CafeActionFactory {
	
	private static CafeActionFactory caf;
	
	private CafeActionFactory() {}
	
	public static CafeActionFactory getInstance() {
		if(caf==null) {
			caf = new CafeActionFactory();
		}
		return caf;
	}
	public Action action(String cmd) {
		Action action = null;
		
		if(cmd.equals("/login.do")) {
			action = new CafeLoginAction("");
		}else if(cmd.equals("/logout.do")) {
			action = new CafeLogoutAction("");
		}else if(cmd.equals("/modify.do")) {
			action = new CafeModifyAction("");
		}else if(cmd.equals("/leave.do")) {
			action = new CafeLeaveAction("");
		}else if(cmd.equals("/join.do")) {
			action = new CafeJoinAction("");
		}
		return action;
	}
}
