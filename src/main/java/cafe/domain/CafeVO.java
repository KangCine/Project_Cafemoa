package cafe.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CafeVO {
	private String userid;
	private String password;
	private String confirmPassword;
	private String name;
	private String addr;
	private String phone;
	private String gender;
	private String email;
	
	public boolean passwordEqualsConfirmPassword() {
		return password.equals(confirmPassword);
	}
}
