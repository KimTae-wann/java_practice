package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {

	private String name;		// 이름
	private String nickName;	// 닉네임
	private String email;		// 이메일
	
	private String lastName;	// 김
	private String firstName;	// 태완
	
	private Company company;	// 근무중인 회사 정보
	
	private List<Phone> phones;	// 연락처 목록
	
	private String memo;		// 메모
	
	public Contact() {
		this.phones = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		String phoneInfo = "";
		for (Phone phone : phones) {
			phoneInfo += phone.getPhoneType() + " " + phone.getPhoneNumber() + "\n";
		}
		return "풀네임: " + this.name +
				"\n닉네임: " + this.nickName +
				"\n이메일: " + this.email +
				"\n성: " + this.lastName +
				"\n이름: " + this.firstName +
				"\n\n회사 정보" + this.company +
				"\n\n연락처 목록\n" + phoneInfo +
				"\n메모\n" + memo + "\n----finish----\n";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contact c)) return false;
		return Objects.equals(this.name, c.name) &&
				Objects.equals(this.nickName, c.nickName) &&
				Objects.equals(this.email, c.email) &&
				Objects.equals(this.lastName, c.lastName) &&
				Objects.equals(this.firstName, c.firstName) &&
				Objects.equals(this.memo, c.memo) &&
				Objects.equals(this.company, c.company) &&
				Objects.equals(this.phones, c.phones);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, nickName, email, lastName, firstName, memo, company, phones);
	}
}
