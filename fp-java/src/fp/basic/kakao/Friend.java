package fp.basic.kakao;

import java.time.LocalDate;

public class Friend {

	private String name;
	private LocalDate birthDate;
	
	public Friend(String name, String birthDate) {
		this.name = name;
		this.birthDate = LocalDate.parse(birthDate);
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "이름: " + this.name + " 생일: " + this.birthDate + "\n";
	}
	
	
}
