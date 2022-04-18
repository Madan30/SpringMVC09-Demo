package come.NepalCode.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = " * Your name cannot be blank")
	//@Min(value =3 , message = "your name should have at least 3 char")
	@Size(min =3, max=15 ,  message = " * Your name should have char at least 3-15")
	private String userName;
	
	@NotBlank(message = " * Cursh name cannot be blank")
	@Size(min =3, max=15 ,  message = " * Crush name should have char at least 3-15")
	private String crushName;
	
	// it is boolean becuase it holds true or false
	@AssertTrue(message = "You have to agree to use our app")
	private boolean termAndCondition;
	
	// creating getter and setter

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
	
	
	
	

}
