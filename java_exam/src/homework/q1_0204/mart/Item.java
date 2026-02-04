package homework.q1_0204.mart;

import java.time.LocalDate;

public class Item {

	private String name;
	private LocalDate expireDate;
	
	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}
	
	public LocalDate getExpireDate() {
		return expireDate;
	}
	
	@Override
	public String toString() {
		return "이름: " + this.name + " 소비기한: " + this.expireDate + "\n";
	}
	
	
}
