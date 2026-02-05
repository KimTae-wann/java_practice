package fp.basic.kakao;

import java.time.LocalDate;
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
	
	public void printSpecialFriends(Search search) {				
		
		for (Friend friend : this.friends) {
			//LocalDate birthDate = friend.getBirthDate();
			//birthDate = birthDate.withYear(LocalDate.now().getYear());
			
			if (search.check(friend)) {
				System.out.println(friend);
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
