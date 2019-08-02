package api.wrapper;

import java.util.Calendar;
import java.util.Date;

public class DateCalenderTest {

	public static void main(String[] args) {

		// 지금 날짜에서 -1900 해준 시간
		System.out.println(new Date(2019-1900, 8, 01));
		
		// Calender 는 추상 클래스 
		Calendar calender = Calendar.getInstance();
		System.out.println(calender.get(calender.YEAR) + "년" + calender.get(calender.MONTH) + "월" 
							+ calender.get(calender.DAY_OF_MONTH) + "일");
		
		calender.set(2019, 8, 1);
		System.out.println(calender.get(calender.YEAR) + "년" 
						+ calender.get(calender.MONTH) + "월" 
						+ calender.get(calender.DAY_OF_MONTH) + "일");

	}

}
