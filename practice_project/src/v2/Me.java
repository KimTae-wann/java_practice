package v2;

import java.util.List;
import java.util.Scanner;

public class Me {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Contact contact1 = new Contact();
		contact1.setName("김범수");
		contact1.setNickName("김");
		contact1.setEmail("kim@naver.com");
		contact1.setLastName("김");
		contact1.setFirstName("범수");
		contact1.setPhone("010-1111-2222");
		contact1.setMemo("랄랄라");
		
		Contact contact2 = new Contact();
		contact2.setName("나얼");
		contact2.setNickName("나");
		contact2.setEmail("na@gmail.com");
		contact2.setLastName("나");
		contact2.setFirstName("얼");
		contact2.setPhone("010-3333-5555");
		contact2.setMemo("랄랄루");
		
		Contact contact3 = new Contact();
		contact3.setName("박효신");
		contact3.setNickName("박");
		contact3.setEmail("park@naver.com");
		contact3.setLastName("박");
		contact3.setFirstName("효신");
		contact3.setPhone("010-6666-7777");
		contact3.setMemo("랄랄리");
		
		Contact contact4 = new Contact();
		contact4.setName("이수");
		contact4.setNickName("이");
		contact4.setEmail("lee@gmail.com");
		contact4.setLastName("이");
		contact4.setFirstName("수");
		contact4.setPhone("010-8888-9999");
		contact4.setMemo("랄랄랄");
		
		ContactManager cm = new ContactManager();
		cm.addContact(contact1);
		cm.addContact(contact2);
		cm.addContact(contact3);
		cm.addContact(contact4);
		
		while (true) {
			System.out.println("===== 전화번호부 어플입니다. =====");
			System.out.println("메뉴를 골라주세요");
			System.out.println("0: 종료\n"
					+ "1: 모든 연락처 출력\n"
					+ "2: 검색\n"
					+ "3: 연락처 정보 삭제");
			int option = sc.nextInt();
			sc.nextLine();
			System.out.println();
			if (option == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (option == 1) {
				cm.printContactList();
			} else if (option == 2) {
				System.out.println("어떤 옵션으로 검색하시겠습니까?");
				System.out.print("전화번호 / 이름 / 이메일 :");
				String searchOption = sc.nextLine();
				System.out.print("검색할 정보를 입력하세요:");
				String searchString = sc.nextLine();
				
				List<Contact> contactList = cm.search(contact -> {
							if (searchOption.equals("전화번호")) {
								return contact.getPhone().contains(searchString);
							} else if (searchOption.equals("이름")) {
								return contact.getName().contains(searchString);
							} else if (searchOption.equals("이메일")) {
								return contact.getEmail().contains(searchString);
							} else {
								System.out.println("전화번호 / 이름 / 이메일 중 하나를 입력하세요");
								return false;
							}
						});
				contactList.stream()
							.forEach(System.out::println);
			} else if (option == 3) {
				System.out.println("어떤 정보로 삭제하시겠습니까?");
				System.out.print("전화번호 / 이름 / 이메일 : ");
				String deleteOption = sc.nextLine();
				System.out.print("정보를 입력해주세요:");
				String deleteString = sc.nextLine();
				cm.deleteContact(contact -> {
					// 연락처
					if (deleteOption.equals("전화번호")) {
						return contact.getPhone().contains(deleteString);
					} else if (deleteOption.equals("이름")) {
						return contact.getPhone().contains(deleteString);
					} else if (deleteOption.equals("이메일")) {
						return contact.getEmail().contains(deleteString);
					} else {
						System.out.println("전화번호 / 이름 / 이메일 중 하나를 입력하세요.");
						return false;
					}
				});
			}
		}
	}
}
