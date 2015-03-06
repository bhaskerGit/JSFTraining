package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyBean {

	private String wel="welcome";
	
	public String getWel() {
		return wel;
	}

	public void setWel(String wel) {
		this.wel = wel;
	}

	private String name;

	public String getName() {
		System.out.println("inside getter");
		return name;
	}

	public void setName(String name) {
		System.out.println("inside setter");
		this.name = name;
	}
	
	public String welcome()
	{
		System.out.println("inside welcome");
		return "welcome";
	}
}
