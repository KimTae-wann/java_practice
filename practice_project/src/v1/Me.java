package v1;

import java.util.Scanner;

import v1.Phone.Type;

public class Me {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// setting
		Phone phone1 = new Phone(Type.PERSONAL, "010-1111-1111");
		Phone phone2 = new Phone(Type.HOME, "02-2222-2222");
		Phone phone3 = new Phone(Type.COMPANY, "02-3333-3333");
		
		Phone phone4 = new Phone(Type.PERSONAL, "010-4444-4444");
		Phone phone5 = new Phone(Type.HOME, "02-5555-5555");
		
		Phone phone6 = new Phone(Type.HOME, "02-6666-6666");
		Phone phone7 = new Phone(Type.COMPANY, "02-7777-7777");
		
		Phone phone8 = new Phone(Type.PERSONAL, "010-8888-8888");
		Phone phone9 = new Phone(Type.COMPANY, "02-9999-9999");
		
		Contact contact1 = new Contact();
		contact1.setName("김범수");
		contact1.setNickName("김");
		contact1.setEmail("kim@naver.com");
		contact1.setLastName("김");
		contact1.setFirstName("범수");
		Company cp1 = new Company("엔터1", "사원", "방배");
		contact1.setCompany(cp1);
		contact1.getPhones().add(phone1);
		contact1.getPhones().add(phone2);
		contact1.getPhones().add(phone3);
		contact1.setMemo("랄랄라");
		
		Contact contact2 = new Contact();
		contact2.setName("나얼");
		contact2.setNickName("나");
		contact2.setEmail("na@gmail.com");
		contact2.setLastName("나");
		contact2.setFirstName("얼");
		Company cp2 = new Company("엔터2", "대리", "서초");
		contact2.setCompany(cp2);
		contact2.getPhones().add(phone4);
		contact2.getPhones().add(phone5);
		contact2.setMemo("랄랄루");
		
		Contact contact3 = new Contact();
		contact3.setName("박효신");
		contact3.setNickName("박");
		contact3.setEmail("park@naver.com");
		contact3.setLastName("박");
		contact3.setFirstName("효신");
		Company cp3 = new Company("엔터3", "과장", "논현");
		contact3.setCompany(cp3);
		contact3.getPhones().add(phone6);
		contact3.getPhones().add(phone7);
		contact3.setMemo("랄랄리");
		
		Contact contact4 = new Contact();
		contact4.setName("이수");
		contact4.setNickName("이");
		contact4.setEmail("lee@gmail.com");
		contact4.setLastName("이");
		contact4.setFirstName("수");
		Company cp4 = new Company("엔터4", "부장", "청담");
		contact4.setCompany(cp4);
		contact4.getPhones().add(phone8);
		contact4.getPhones().add(phone9);
		contact4.setMemo("랄랄랄");
		
		ContactManager cm = new ContactManager();
		cm.addContact(contact1);
		cm.addContact(contact2);
		cm.addContact(contact3);
		cm.addContact(contact4);
		
		// module test
		
		while (true) {
			System.out.println("===== 전화번호부 어플입니다. =====");
			System.out.println("메뉴를 골라주세요");
			System.out.println("0: 종료\n"
					+ "1: 모든 연락처 출력\n"
					+ "2: 전화번호로 검색\n"
					+ "3: 이름으로 검색\n"
					+ "4: 이메일로 검색\n"
					+ "5: 연락처 정보 수정\n"
					+ "6: 연락처 정보 삭제\n");
			int option = sc.nextInt();
			sc.nextLine();
			if (option == 0) {
				break;
			} else if (option == 1) {
				cm.printContactList();
			} else if (option == 2) {
				String searchNumber = sc.nextLine();
				cm.searchNumberContactList(searchNumber);
			} else if (option == 3) {
				String nameSearch = sc.nextLine();
				cm.searchNameContactList(nameSearch);
			} else if (option == 4) {
				String emailSearch = sc.nextLine();
				cm.searchEmailContactList(emailSearch);
			} else if (option == 5) {
				System.out.print("수정할 연락처의 이름을 입력하세요: ");
				String contactName = sc.nextLine();
				System.out.println("어떤 정보를 수정하시나요?");
				System.out.println("1: 풀네임\n"
						+ "2: 닉네임\n"
						+ "3: 이메일\n"
						+ "4: 성\n"
						+ "5: 이름\n"
						+ "6: 근무중인 회사\n"
						+ "7: 연락처 목록\n"
						+ "8: 메모\n");
				int updateOption = sc.nextInt();
				sc.nextLine();
				cm.updateContactList(contactName, updateOption);
			} else if (option == 6) {
				System.out.print("삭제할 연락처의 이름을 입력하세요: ");
				String contactName = sc.nextLine();
				cm.deleteContactList(contactName);
			}
		}
		System.out.println("종료합니다.");
	}
}
