package homework.q1_0128;

public class Main {
    public static void main(String[] args) {
        // 1. 상품 준비
        Product snack = new Product("다이제", 2_000);
        Product lunchBox = new Product("혜자도시락", 5_000);
        Product tv = new Product("스마트TV", 100_000);

        // 2. 가게 오픈
        Store normalMart = new NormalMart();
        Store cvs = new ConvenienceStore();
        Store deptStore = new DepartmentStore();

        // 상황 1. 일반 마트에서 2,000원 짜리 다이제 2개 구매 / 500 포인트 사용하려고 함 -> 반려
        System.out.println("========== 1. 일반 마트 테스트 ==========");
        Customer c1 = new Customer("Normal", 1_000, 10_000); // 1천 포인트, 1만 원
        System.out.println("[구매 전] 현금: " + c1.getAccount() + " / 포인트: " + c1.getPoint());
        c1.buy(normalMart, snack, 2, 500); 
        System.out.println("[구매 후]남은 돈: " + c1.getAccount() + " / 포인트: " + c1.getPoint());
        System.out.println("[기대 결과] 현금: 6,000원, 포인트: 1,000점" );
        
        // 상황 2. 편의점에서 5,000원 짜리 도시락 1개 구매 / 5000 포인트 사용하려고 함 -> 강제로 있는 포인트 다 사용
        System.out.println("\n========== 2. 편의점 테스트 (포인트 전액 사용) ==========");
        // 포인트 12,000점 보유, 상품 5,000원 구매 -> 포인트 다 뺏기고 0원 결제
        Customer c2 = new Customer("Normal", 12_000, 50_000);
        System.out.println("[구매 전] 현금: " + c2.getAccount() + " / 포인트: " + c2.getPoint());
        c2.buy(cvs, lunchBox, 1, 5000); // 보유 포인트 1 만원 넘어가면 무조건 다 사용 
        System.out.println("[구매 후] 현금: " + c2.getAccount() + " / 포인트: " + c2.getPoint());
        System.out.println("[기대 결과] 현금: 50,000원, 포인트: 5점" );

        // 상황 3. VVIP 고객이 백화점에서 100,000원 짜리 스마트 TV 1개 구매 / 5000 포인트 사용하려고 함
        System.out.println("\n========== 3. 백화점 테스트 (VVIP) ==========");
        // 상황: VVIP (10% 할인, 3% 적립), 10만원짜리 구매, 포인트 20,000점 중 5,000점만 사용 희망
        Customer c3 = new Customer("VVIP", 50_000, 2_000_000);
        System.out.println("[구매 전] 현금: " + c3.getAccount() + " / 포인트: " + c3.getPoint());
        c3.buy(deptStore, tv, 1, 5000);
        System.out.println("[구매 후] 현금: " + c3.getAccount() + " / 포인트: " + c3.getPoint());
        System.out.println("[기대 결과] 현금: 1,915,000원, 포인트: 48,000점");
        
        // 상황 4. VIP 고객이 백화점에서 100,000원 짜리 스마트 TV 1개 구매 / 5000 포인트 사용하려고 함
        System.out.println("\n========== 4. 백화점 테스트 (VIP) ==========");
        Customer c4 = new Customer("VIP", 20_000, 1_000_000);
        System.out.println("[구매 전] 현금: " + c4.getAccount() + " / 포인트: " + c4.getPoint());
        c4.buy(deptStore, tv, 1, 5000);
        System.out.println("[구매 후] 현금: " + c4.getAccount() + " / 포인트: " + c4.getPoint());
        System.out.println("[기대 결과] 현금: 908,000원, 포인트: 15,000점");
        
        // 상황 5. 일반 고객이 백화점에서 100,000원 짜리 스마트 TV 1개 구매 / 5000 포인트 사용하려고 함 -> 10000점이 안넘어서 사용 불가
        System.out.println("\n========== 5. 백화점 테스트 (NORMAL) ==========");
        Customer c5 = new Customer("NORMAL", 9_000, 500_000);
        System.out.println("[구매 전] 현금: " + c5.getAccount() + " / 포인트: " + c5.getPoint());
        c5.buy(deptStore, tv, 1, 5000);
        System.out.println("[구매 후] 현금: " + c5.getAccount() + " / 포인트: " + c5.getPoint());
        System.out.println("[기대 결과] 현금: 400,000원, 포인트: 9,500점");
        
    }
}
