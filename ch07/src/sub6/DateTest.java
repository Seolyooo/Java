package sub6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/*
 * 2025/07/22
 * 설유진
 * 자바 날짜 시간 클래스 실습하기
 * 
 */
public class DateTest {

	public static void main(String[] args) {

		//date 클래스
		Date date = new Date();
		System.out.println("date : "+ date); //.toString() 생략
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = sdf.format(date);	
		System.out.println("result : "+ result);
		
		//Calendar 클래스
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		int year= cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH)+1;
		int dt= cal.get(Calendar.DATE);
		int hour= cal.get(Calendar.HOUR_OF_DAY);
		int min= cal.get(Calendar.MINUTE);
		int sec= cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d", year, month, dt, hour, min, sec);
		
		System.out.println();
		
		LocalDate today = LocalDate.now();
		System.out.println("today: "+today);
		
		LocalTime now = LocalTime.now();
		System.out.println("now : "+now);
		
		
		LocalDateTime dt2 = LocalDateTime.now();
		System.out.println("dt : "+dt2);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy--MM-dd HH:mm:ss");
		String str = dt2.format(fmt);
		System.out.println(str);
	}

}
