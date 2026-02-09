package v1;

public class Phone {

	public static enum Type {
		PERSONAL, HOME, COMPANY
	}
	
	private Phone.Type phoneType;
	private String phoneNumber;
	
	public Phone(Type phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public Phone.Type getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(Phone.Type phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		String type = "";
		if (this.phoneType == Type.PERSONAL) {
			type = "Personal";
		} else if (this.phoneType == Type.HOME) {
			type = "Home";
		} else if (this.phoneType == Type.COMPANY) {
			type = "Company";
		}
		return "타입: " + type +
				" 번호: " + phoneNumber;
	}
}
	
	
