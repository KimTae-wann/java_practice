package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalSeriesExam {
	
	public static void main(String[] args) {
		/*
		 * 
		 * LocalDate: 날짜만 처리
		 * LocalTime: 시간만 처리
		 * LocalDateTime: 날짜 & 시간 처리
		 */
		
		// 현재 날짜를 출력
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		
		// 현재 날짜를 출력
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = dtf.format(nowTime);
		System.out.println(formattedTime);
		
		// 현재 날짜와 시간을 출력
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-ss E요일 HH:mm:ss");
		formattedTime = dtf.format(nowDateTime);
		System.out.println(formattedTime);
		
		// 태어난 일이 무슨 요일인가?
		LocalDate birthDate = LocalDate.parse("1997-11-13");
		System.out.println(birthDate);
		
		// LocalDateParseException
//		LocalDate birthDate2 = LocalDate.parse("1997년 11월 13일");
//		System.out.println(birthDate2);

		LocalDate birthDate2 = LocalDate.parse("1997년 11월 13일",
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(birthDate2);
		
		LocalDate birthDate3 = LocalDate.of(1997, 11, 13);
		System.out.println(birthDate3.getDayOfWeek());
		System.out.println(birthDate3.format(DateTimeFormatter.ofPattern("EEEE", Locale.KOREA)));
		
		// 오늘 날짜부터 19일 이후가 언제인가?
		System.out.println(LocalDate.now().plusDays(19));
		// 오늘 날짜부터 35년 후가 언제인가?
		System.out.println(LocalDate.now().plusYears(35));
		// 오늘 날짜부터 97년 전은 언제인가?
		System.out.println(LocalDate.now().minusYears(97));
		// 오늘 날짜부터 1300개월 이후는 언제인가?
		System.out.println(LocalDate.now().plusMonths(1300));
		
		// 2025년 1월 1일은 2026년 1월 1일보다 과거 인가?
		LocalDate pastDate = LocalDate.of(2025, 1, 1);
		LocalDate currentDate = LocalDate.of(2026, 1, 1);
		String result = pastDate.isBefore(currentDate) ? "과거임" : "과거 아님";
		System.out.println(result);
		
		//2026년 12월 11일은 2025년 2월 5일보다 미래인가?
		LocalDate futureDate = LocalDate.of(2026, 12, 11);
		LocalDate currentDate2 = LocalDate.of(2025, 2, 5);
		String result2 = futureDate.isAfter(currentDate2) ? "미래임" : "미래 아님";
		System.out.println(result2);
		
		Period period = Period.between(futureDate, currentDate2);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		long betweenDays = ChronoUnit.DAYS.between(futureDate, currentDate2);
		System.out.println(betweenDays);

		long betweenYears = ChronoUnit.YEARS.between(futureDate, currentDate2);
		System.out.println(betweenYears);
		
		// 
	}
}
