package homework.q2_0202;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Map<지역, Map<비행기 편명, List<비행기 좌석>>>
		Map<String, List<Flight>> flightTicket = new HashMap<>();
		List<Flight> toBusan = new ArrayList<>();
		// 세팅
		Map<String, String> sitStatus0091 = new HashMap<>();
		sitStatus0091.put("1", "X");
		sitStatus0091.put("2", "X");
		sitStatus0091.put("3", "X");
		sitStatus0091.put("4", "X");
		sitStatus0091.put("5", "X");
		sitStatus0091.put("6", "X");
		sitStatus0091.put("7", "X");
		sitStatus0091.put("8", "X");
		sitStatus0091.put("9", "X");
		
		toBusan.add(new Flight(sitStatus0091, "0091", 0));
		
		Map<String, String> sitStatus0001 = new HashMap<>();
		sitStatus0001.put("1", "O");
		sitStatus0001.put("2", "X");
		sitStatus0001.put("3", "O");
		sitStatus0001.put("4", "O");
		sitStatus0001.put("5", "X");
		sitStatus0001.put("6", "O");
		sitStatus0001.put("7", "X");
		sitStatus0001.put("8", "X");
		sitStatus0001.put("9", "X");
		
		toBusan.add(new Flight(sitStatus0001, "0001", 4));
		
		flightTicket.put("부산", toBusan);
		
		while(true) {
			System.out.println("목적지를 입력하면 비행기 편을 예약할 수 있습니다.");
			System.out.print("목적지를 입력하세요: ");
			String dest = sc.nextLine();
			
			List<Flight> flightList = flightTicket.get(dest);
			
			// 목적지 체크
			if (flightList == null) {
				System.out.println(dest + "행 비행기편은 존재하지 않습니다.\n");
				continue;
			}
			
			
			System.out.println(dest + "행 비행기 편은 아래와 같습니다.");
			for (Flight f : flightList) {
				System.out.println(f.getFlightName() + " 예매가능 좌석 수: "	+ f.getExistSit()); 
			}
			
			// 비행기 선택 루프
			while (true) {
				System.out.print("비행기 편을 입력하세요: ");
				String flightNum = sc.nextLine();
				if(flightNum.equals("exit")) {
					break;
				}
				
				Flight selectedFlight = null;
				// 리스트에서 비행기 찾기
				for (Flight f : flightList) {
					if (f.getFlightName().equals(flightNum)) {
						selectedFlight = f;
						break;
					}
				}
				
				if (selectedFlight == null) {
					System.out.println(flightNum + "편은 존재하지 않습니다.");
					continue;
				}
				
				// 좌석 예약
				System.out.println(flightNum + " 편의 좌석 현황입니다.");
				selectedFlight.printSitStatus();
				
				if (selectedFlight.getExistSit() <= 0) {
					System.out.println("예약 가능한 좌석이 없습니다.");
					continue;
				}
				
				System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
				int sitNum = Integer.parseInt(sc.nextLine()); // NumberFormatException Handling
				String key = String.valueOf(sitNum);
				
				// Flight 클래스의 Map
				Map<String, String> seats = selectedFlight.getSit();
				
				if (seats.get(key).equals("X")) {
					System.out.println(sitNum + "번 좌석은 이미 예약된 좌석입니다.");
				}
				else {
					System.out.print(sitNum + "번 좌석을 예약하시겠습니까? (y/N)");
					String confirm = sc.nextLine();
					if(confirm.equalsIgnoreCase("y")) { // 대소문자
						seats.put(key, "X"); // 예약
						selectedFlight.setExistSit(selectedFlight.getExistSit() - 1);
						System.out.println("예약이 완료되었습니다.");
						break;
					}
				}
			}
		}
	}	
}
