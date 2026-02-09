package v1;

public class Phone {

	public static enum Type {
		PERSONAL, HOME, COMPANY
	}
	
	private Phone.Type phoneType;
	private String phoneNumeber;
	
	public Phone(Type phoneType, String phoneNumeber) {
		this.phoneType = phoneType;
		this.phoneNumeber = phoneNumeber;
	}

	public Phone.Type getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumeber() {
		return phoneNumeber;
	}

	public void setPhoneNumeber(String phoneNumeber) {
		this.phoneNumeber = phoneNumeber;
	}
}
	
	
