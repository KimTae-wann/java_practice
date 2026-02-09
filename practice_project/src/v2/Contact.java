package v2;

import java.util.Objects;

public class Contact {
	
	private String name;
	private String lastName;
	private String firstName;
	
	private String nickName;
	private String email;
	private String phone;
	private String memo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return "풀네임: " + this.name +
				"\n닉네임: " + this.nickName +
				"\n이메일: " + this.email +
				"\n성: " + this.lastName +
				"\n이름: " + this.firstName +
				"\n연락처: " + this.phone +
				"\n메모: " + this.memo + 
				"\n----finish----\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contact c)) return false;
		return Objects.equals(this.name, c.name) &&
				Objects.equals(this.lastName, c.lastName) &&
				Objects.equals(this.firstName, c.firstName) &&
				Objects.equals(this.nickName, c.nickName) &&
				Objects.equals(this.email, c.email) &&
				Objects.equals(this.phone, c.phone) &&
				Objects.equals(this.memo, c.memo);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, nickName, email, lastName, firstName, memo, phone);
	}
	
}
