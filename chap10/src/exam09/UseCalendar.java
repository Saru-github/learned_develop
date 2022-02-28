package exam09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UseCalendar {

	public static void main(String[] args) {

		// 현재 날짜
		// Calendar today = new Calendar();

		Calendar today = Calendar.getInstance();
		
		// 년, 월, 일 구하기
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// 시, 분, 초 구하기
		int hour = today.get(Calendar.HOUR_OF_DAY);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
		// 요일 구하기
		
		String[] DAY_OF_WEEK = {"일", "월", "화", "수", "목", "금", "토"};
		int week = today.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println("오늘은 " + DAY_OF_WEEK[week] + "요일 입니다.");
		
		// Date
		
		Date now = new Date();
		System.out.println("현재 시간: " +now.toString());
		
		now = today.getTime(); // Date 타입으로 변경
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a");
		
		String date = sdf.format(now);
		System.out.println(date);
		
		// Calendar -> Date 변환
		Date d1 = new Date(today.getTimeInMillis()); // Date(long date)
		
		
		// Date -> Calendar 변환
		Date d2 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
		
		
		
		
	}

}
