package MyBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {

	private String userLabel="User Name :";
	private String userText;
	private String userPwdLabel="User Password :";
	private String userPwdText;
	private String registerText="Register";
	public String getUserLabel() {
		return userLabel;
	}
	public void setUserLabel(String userLabel) {
		this.userLabel = userLabel;
	}
	public String getUserText() {
		return userText;
	}
	public void setUserText(String userText) {
		this.userText = userText;
	}
	public String getUserPwdLabel() {
		return userPwdLabel;
	}
	public void setUserPwdLabel(String userPwdLabel) {
		this.userPwdLabel = userPwdLabel;
	}
	public String getUserPwdText() {
		return userPwdText;
	}
	public void setUserPwdText(String userPwdText) {
		this.userPwdText = userPwdText;
	}
	public String getRegisterText() {
		return registerText;
	}
	public void setRegisterText(String registerText) {
		this.registerText = registerText;
	}
	
	public String register()
	{
		System.out.println(userText);
		if(userText.endsWith("Bhasker")&&userPwdText.equals("yadav"))
			return "welcome";
		else
			return "invalid";					
	}
}
