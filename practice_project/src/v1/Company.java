package v1;

import java.util.Objects;

public class Company {

	private String companyName;	// 회사 이름
	private String job;			// 직급 (사원, 대리, 과장, 차장, 부장, 이사, 대표)
	private String address;		// 회사 주소
	
	public Company(String companyName, String job, String address) {
		this.companyName = companyName;
		this.job = job;
		this.address = address;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\n회사 이름: " + companyName +
				"\n직책: " + job +
				"\n주소: " + address;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Company c)) return false;
		return Objects.equals(this.companyName, c.companyName) &&
				Objects.equals(this.job, c.job) &&
				Objects.equals(this.address, c.address);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(companyName, job, address);
	}
				
}
