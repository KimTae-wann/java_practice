package fp.basic.stream.kakao;

import java.time.LocalDate;

public class KakaoTalk {

	public static void main(String[] args) {
		FriendList fl = new FriendList();
		
		fl.add( new Friend("A", "2000-01-01"));
		fl.add( new Friend("B", "2001-11-01"));
		fl.add( new Friend("C", "2002-05-16"));
		fl.add( new Friend("D", "2007-02-28"));
		fl.add( new Friend("E", "2006-02-05"));
		fl.add( new Friend("F", "2005-02-09"));
		fl.add( new Friend("G", "2006-01-30"));
		fl.add( new Friend("H", "2007-02-01"));
		
		/*
		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
		fl.printSpecialFriends(new Search() {
			@Override
			public boolean check(LocalDate birthDate) {
				return birthDate.isAfter(LocalDate.now()) &&
						birthDate.isBefore(LocalDate.now().plusDays(8));
			}
		});
		
		System.out.println("오늘이 생일인 친구 목록");
		fl.printSpecialFriends(new Search() {
			@Override
			public boolean check(LocalDate birthDate) {
				return birthDate.isEqual(LocalDate.now()); 
			}
		});

		System.out.println("7일 이내에 생일이 지난 친구 목록");
		fl.printSpecialFriends(birthDate -> birthDate.isBefore(LocalDate.now()) &&
				birthDate.isAfter(LocalDate.now().minusDays(8)));
		*/
		
		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
		fl.printSpecialFriends(friend -> {
			LocalDate birthDate = friend.getBirthDate().withYear(LocalDate.now().getYear());
			LocalDate now = LocalDate.now();
			return birthDate.isAfter(LocalDate.now()) && birthDate.isBefore(LocalDate.now().plusDays(8));
		});
		
		System.out.println("오늘이 생일인 친구 목록");
		fl.printSpecialFriends(friend -> {
			LocalDate birthDate = friend.getBirthDate().withYear(LocalDate.now().getYear());
			LocalDate now = LocalDate.now();
			return birthDate.equals(LocalDate.now());
		});
		
		System.out.println("7일 이내에 생일이 지난 친구 목록");
		fl.printSpecialFriends(friend -> {
			LocalDate birthDate = friend.getBirthDate().withYear(LocalDate.now().getYear());
			LocalDate now = LocalDate.now();
			return birthDate.isBefore(LocalDate.now()) && birthDate.isAfter(LocalDate.now().minusDays(8));
		});
		
		
		// 오늘 만 20세가 된 친구
		System.out.println("오늘 만 20세가 된 친구");
		fl.printSpecialFriends(friend -> friend.getBirthDate().plusYears(20).equals(LocalDate.now()));
		
		// 이름이 'A'인 친구 목록
		System.out.println("이름이 'A'인 친구 목록");
		fl.printSpecialFriends(friend -> friend.getName().equals("A"));
		
		// 이름이 'B' 또는 'C' 또는 'D'로 시작되면서 나이가 20세 이상인 친구 목록
		System.out.println("이름이 'B' 또는 'C' 또는 'D'로 시작되면서 나이가 20세 이상인 친구 목록");
		fl.printSpecialFriends(friend -> {
			boolean nameCheck = friend.getName().startsWith("B") || friend.getName().startsWith("C") || friend.getName().startsWith("D");
			boolean ageCheck = (LocalDate.now().getYear() - friend.getBirthDate().getYear()) >= 20;
			return nameCheck && ageCheck;
		});
		
		
		System.out.println("전체 친구 목록");
		//System.out.println(fl);
		fl.printSpecialFriends(friend -> true);
	}
}