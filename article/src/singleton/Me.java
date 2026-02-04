package singleton;

public class Me {
	
	private static Me me;
	
	private String name;
	
	private Me() {
		this.name = "김태완";
	}
	
	public static Me getInstance() {		
		if (Me.me == null) {
			Me.me = new Me();
		}
		return Me.me;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
