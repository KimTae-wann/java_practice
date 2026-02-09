package v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager {

	private List<Contact> contactList;

	public ContactManager() {
		this.contactList = new ArrayList<>();
	}
	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	public void addContact(Contact contact) {
		this.contactList.add(contact);
	}
	
	// 2. contactList에 모든 연락처 정보를 출력하는 기능
	public void printContactList() {
		for (Contact contact : this.contactList) {
			System.out.println(contact);
		}
	}
	
	// 3. contactList에서 전화번호 검색 결과 출력하는 기능
	// ex> input: "010" --> 전화번호에 "010"이 포함된 연락처의 모든 정보를 출력
	public void searchNumberContactList(String number) {
		for (Contact contact : contactList) {
			List<Phone> phones = contact.getPhones();
			for (Phone phone : phones) {
				if (phone.getPhoneNumber().contains(number)) {
					System.out.print(contact.getName() + "의 번호 --> ");
					System.out.println(phone);
				}
			}
		}
	}
	
	// 4. contactList에서 이름 검색 결과 출력하는 기능
	// ex> input: "김" --> 이름에 "김"이 포함된 name, firstName, lastName, companyName
	// 에 "김"이 포함된 연락처의 모든 정보를 출력
	public void searchNameContactList(String name) {
		for (Contact contact : contactList) {
			if (contact.getName().contains(name)) {
				List<Phone> phones = contact.getPhones();
				for (Phone phone : phones) {
					System.out.print(contact.getName() + "의 번호 --> ");
					System.out.println(phone);
				}
			}
		}
	}
	
	// 5. contactList에서 email 검색 결과 출력하는 기능
	// ex> input: "@abc.com" --> 이메일에 "@abc.com"이 포함된 모든 email 출력
	public void searchEmailContactList(String email) {
		for (Contact contact : contactList) {
			if (contact.getEmail().contains(email)) {
				List<Phone> phones = contact.getPhones();
				for (Phone phone : phones) {
					System.out.print(contact.getName() + "의 번호 --> ");
					System.out.println(phone);
				}
			}
		}
	}
	
	// 6. 연락처 정보 수정 기능
	// ex> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
	// 이름을 변경, 전화번호를 추가, 전화번호 수정, 회사 정보 수정 .....
	public void updateContactList(String contactName, int updateOption) {
		Scanner sc = new Scanner(System.in);
		
		Contact c = null;
		for (Contact contact : contactList) {
			if (contact.getName().equals(contactName)) {
				c = contact;
			}
		}
		if (c == null){
			System.out.println("연락처에 " + contactName + "라는 사람은 없습니다.");
			sc.close();
			return ;
		}
		String updateString = "";
		if (updateOption != 6 && updateOption != 7) {
			System.out.print("수정 될 정보를 입력하세요:");
			updateString = sc.nextLine();
		}
		if (updateOption == 1) {
			c.setName(updateString);
		} else if (updateOption == 2) {
			c.setNickName(updateString);
		} else if (updateOption == 3) {
			c.setEmail(updateString);
		} else if (updateOption == 4) {
			c.setName(updateString + c.getFirstName());
			c.setLastName(contactName);
		} else if (updateOption == 5) {
			c.setName(c.getLastName() + updateString);
			c.setFirstName(updateString);
		} else if (updateOption == 6) {
			System.out.println("회사의 어떤 정보를 수정하나요?");
			System.out.println("1: 이름\n"
					+ "2: 직급\n"
					+ "3: 주소");
			int companyOption = sc.nextInt();
			sc.nextLine();
			Company company = c.getCompany();
			System.out.print("수정 될 정보를 입력하세요:");
			updateString = sc.nextLine();
			if (companyOption == 1) {
				company.setCompanyName(updateString);
			} else if (companyOption == 2) {
				company.setJob(updateString);
			} else if (companyOption == 3) {
				company.setAddress(updateString);
			}
		} else if (updateOption == 7) {
			for (Phone phone : c.getPhones()) {
				System.out.println(phone);
			}
			System.out.println("어떤 번호를 수정하시나요?: 0 ~ " + (c.getPhones().size() - 1));
			int contactOption = sc.nextInt();
			sc.nextLine();
			Phone phone = c.getPhones().get(contactOption);
			System.out.print("수정 될 정보를 입력하세요:");
			updateString = sc.nextLine();
			phone.setPhoneNumber(updateString);
			
		} else if (updateOption == 8) {
			c.setMemo(updateString);
		}
		sc.close();
	}
	
	
	// 7. 연락처 정보 삭제 기능
	// ex> 다양한 검색의 결과중 하나를 선택해 연락처 정보를 삭제할 수 있는 기능
	public void deleteContactList(String contactName) {
		for (Contact contact : contactList) {
			if (contact.getName().equals(contactName)) {
				contactList.remove(contact);
				break;
			}
		}
	}
}
