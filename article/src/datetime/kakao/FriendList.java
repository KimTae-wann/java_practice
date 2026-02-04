package datetime.kakao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
	
	private List<Friend> friends;
	
	public FriendList() {
		this.friends = new ArrayList<>();
	}
	
	public void add(Friend friend) {
		this.friends.add(friend);
	}
	
	public void printSpecialFriends(Base base) {				
		
		for (Friend friend : this.friends) {
			LocalDate birthDate = friend.getBirthDate();
			birthDate = birthDate.withYear(LocalDate.now().getYear());
			if (base == Base.FUTURE) {
				// 오늘을 기준으로 7일 이내에 생일을 맞이하는 친구 출력
				if (birthDate.isAfter(LocalDate.now()) &&
						birthDate.isBefore(LocalDate.now().plusDays(8))) {
					System.out.println("7일 이내에 생일을 맞이하는 친구\n" + friend);
				}
				
			} else if (base == Base.NOW) {
				// 오늘이 생일인 친구를 출력
				if (birthDate.isEqual(LocalDate.now())) {
					System.out.println("오늘이 생일인 친구\n" + friend);
				}
			} else if (base == Base.PAST) {
				// 오늘을 기준으로 7일 이내에 생일이 지난 친구.
				if (birthDate.isBefore(LocalDate.now()) &&
						birthDate.isAfter(LocalDate.now().minusDays(8))) {
					System.out.println("7일 이내에 생일이 지난 친구\n" + friend);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		if (this.friends.size() == 0) {
			sb.append("등록된 친구가 없습니다.");
		}
		
		for (Friend friend : this.friends) {
			sb.append(friend);
		}
		return sb.toString();
	}
	
	
}
