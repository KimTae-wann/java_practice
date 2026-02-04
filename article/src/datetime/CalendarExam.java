package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExam {
	
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		System.out.println(now.get(Calendar.YEAR) + "년 " + 
				(now.get(Calendar.MONTH) + 1) + "월 " + 
				now.get(Calendar.DAY_OF_MONTH) + "일 " + 
				now.get(Calendar.HOUR) + "시 " + 
				now.get(Calendar.MINUTE) + "분 " + 
				now.get(Calendar.SECOND) + "초 ");
		
//		System.out.println(now.get(Calendar.DAY_OF_WEEK));
//		String day = now.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA);
//		System.out.println(day);
		
		// 생일 요일
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(1997, 11 - 1, 13);
		String birthDay = birthDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.JAPAN);
		System.out.println(birthDay);
		
		// 100일 뒤에는 무슨 요일
		Calendar date = Calendar.getInstance();
		date.add(Calendar.DAY_OF_MONTH, 100);
		String day = date.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA);
		System.out.println(day);
		
		// 2025년 2월 4일은 2026년 2월 4일보다 과거인가?
		Calendar now2 = Calendar.getInstance();
		Calendar past = Calendar.getInstance();
		past.set(2025, 2 - 1, 4);
		
		// 인스턴트 비교
		long nowTime = now2.getTimeInMillis();
		long pastTime = past.getTimeInMillis();
		if (pastTime < nowTime) {
			System.out.println("더 과거입니다.");
		} else if(pastTime > nowTime){
			System.out.println("더 미래입니다.");
		} else {
			System.out.println("현재입니다.");
		}
		
		// 2026년 2월 4일 부터 2026년 6월 14일 까지 며칠이 걸리나?
		Calendar now3 = Calendar.getInstance();
		int daysCount = 0;
		while(true) {
			now3.add(Calendar.DAY_OF_MONTH, 1);
			daysCount++;
			if (now3.get(Calendar.YEAR) == 2026 && now3.get(Calendar.MONTH) == 6 && now3.get(Calendar.DAY_OF_MONTH) == 14) {
				break;
			}
		}
		System.out.println(daysCount + "일 걸렸습니다.");
		
		// 오늘 부터 7영업일 이후는 몇년 몇월 며칠인가
		Calendar now4 = Calendar.getInstance();
		int cnt = 0;
		while (true) {
			if (cnt == 7) {
				break;
			}
			if (now4.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA).equals("토요일") ||
					now4.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.KOREA).equals("일요일")) {
				now4.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			}
			now4.add(Calendar.DAY_OF_MONTH, 1);
			cnt++;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = sdf.format(now4.getTime());
		System.out.println(dateString);
//		System.out.println(now4.get(Calendar.YEAR) + "년 " +  
//						(now4.get(Calendar.MONTH) + 1) + "월 " +
//						now4.get(Calendar.DAY_OF_MONTH) + "일");
		
		// 이거 차이 나는데 멀티스레드 환경에서 어떻게 처리함?
		// 그냥 감당 하는것임. 근데? 23시 59분 59초에 요청을 했는데 Calender.getInstance()로 가져오는게 늦어질 수도있잖아.
		// 그럼 데이터 정합성에 문제가 생기는데?
		// 그래서 로직 처음에 인스턴스를 받아 쓰고 더 이상 건드리지 않음
//		Calendar compareDate1 = Calendar.getInstance();
//		String str = "";
//		for (int i = 0; i < 10000; i++) {
//			str += "asdada";
//		}
//		Calendar compareDate2 = Calendar.getInstance();
//		System.out.println(compareDate2.getTimeInMillis() - compareDate1.getTimeInMillis());
		
		
	}
}
