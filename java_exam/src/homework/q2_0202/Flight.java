package homework.q2_0202;

import java.util.HashMap;
import java.util.Map;

public class Flight {

	private Map<String, String> seats;
	private String flightName;
	private int existSeats;
	
	
	public Flight(Map<String, String> seat, String flightName, int existSeats) {
		this.seats = seat;
		this.flightName = flightName;
		this.existSeats = existSeats;
	}

	public Map<String, String> getSeats() {
		return seats;
	}

	public void setSeats(Map<String, String> seats) {
		this.seats = seats;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public int getExistSeats() {
		return existSeats;
	}

	public void setExistSeats(int existSeats) {
		this.existSeats = existSeats;
	}
	
	public void printSeatsStatus() {
		for (int i = 1; i <= 9; i++) {
			if (i != 9) {
				System.out.print(i + ": " + this.seats.get(String.valueOf(i)) + ", ");
			}
			else {
				System.out.println(i + ": " + this.seats.get(String.valueOf(i)));
			}
		}
	}
}
