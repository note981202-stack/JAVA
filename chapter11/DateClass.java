package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH:mm:ss");
		
		System.out.println(now);
		System.out.println(sdf.format(now));
		
		System.out.println();
		//------------------------------------------- 캘린더
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);		
		int month = today.get(Calendar.MONTH)+1;		
		int day = today.get(Calendar.DAY_OF_MONTH);
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		int amPm = today.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.print(second + "초");
		
		//-----------------------------------
		//시간 조작할 때에는 loacldatetime을 쓴다
		LocalDateTime Today2 = LocalDateTime.now();
		LocalDateTime xmas = LocalDateTime.of(2026, 12, 25, 0, 0, 0);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd.E요일");
		long remainYear = Today2.until(xmas, ChronoUnit.YEARS);
				long remainMonths = Today2.until(xmas, ChronoUnit.MONTHS);
				long remainDays = Today2.until(xmas, ChronoUnit.DAYS);
				long remainHous = Today2.until(xmas, ChronoUnit.HOURS);
				long remainMinutes = Today2.until(xmas, ChronoUnit.MINUTES);
				long remainSeconds = Today2.until(xmas, ChronoUnit.SECONDS);
		
				System.out.println();
				System.out.println("\n미래의 어느날 --------------");
				LocalDateTime resulty = Today2.plusYears(1);
				LocalDateTime resultm = Today2.plusMonths(1);
				LocalDateTime resultd = Today2.plusDays(7);
				System.out.println("일년 후 : " + resulty.format(dtf));
				System.out.println("한달 후 : " + resultm.format(dtf));
				System.out.println("7일 후 : " + resultd.format(dtf));
				
				System.out.println("\n과거의 어느날 --------------");
				LocalDateTime result_y = Today2.minusYears(1);
				LocalDateTime result_m = Today2.minusMonths(1);
				LocalDateTime result_d = Today2.minusDays(7);
				System.out.println("일년 전 : " + result_y.format(dtf));
				System.out.println("한달 전 : " + result_m.format(dtf));
				System.out.println("7일 전 : " + result_d.format(dtf));
		
	}

}
