package homework.q2_0202;

import java.util.HashMap;
import java.util.Map;

public class Flight {

	private Map<String, String> sit;
	private String flightName;
	private int existSit;
	
	
	public Flight(Map<String, String> sit, String flightName, int existSit) {
		this.sit = sit;
		this.flightName = flightName;
		this.existSit = existSit;
	}

	public Map<String, String> getSit() {
		return sit;
	}

	public void setSit(Map<String, String> sit) {
		this.sit = sit;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getExistSit() {
		return existSit;
	}

	public void setExistSit(int existSit) {
		this.existSit = existSit;
	}
	
	public void printSitStatus() {
		for (int i = 1; i <= 9; i++) {
			if (i != 9) {
				System.out.print(i + ": " + this.sit.get(String.valueOf(i)) + ", ");
			}
			else {
				System.out.println(i + ": " + this.sit.get(String.valueOf(i)));
			}
		}
	}
}
