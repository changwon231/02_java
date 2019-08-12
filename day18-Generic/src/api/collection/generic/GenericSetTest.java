package api.collection.generic;

import java.util.HashSet;
import java.util.Set;


/**
 * 컬렉션에 저장할 타입의 제한을 주는
 * Generic 이 적용된 Set 을 테스트
 * 
 * @author Administrator
 *
 */
public class GenericSetTest {

	public static void main(String[] args) {
		// 1. 선언 : Integer 만 저장하는 Set  
		Set<Integer> set;
		// Book 만 저장하는 set
		Set<Book> books;
		
		// 2. 초기화 : HashSet 으로 초기화 : 
		// 			   Integer 만 저장하는 HashSet 으로 초기화
		set = new HashSet<Integer>();
		
		// 3. 엘리먼트 추가
		// auto-boxing 
		set.add(1);
		set.add(20);
		set.add(new Integer(300));
//		set.add("사백") Integer 형식만 넣도록 기능을 설정해 오류가 발생
		
		
		// Book객체들 생성
		books = new HashSet<Book>();
		Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10);
		Book littlePrins = new Book(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2);
		Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		
		books.add(vegetrian);
		books.add(littlePrins);
		books.add(noDaap);
		books.add(dduk);
		books.add(ax);
		
		// 3. 사용
		// Integer Set 에서 데이터 추출 : foreach
		for (Integer number : set) {
			// set 에서 추출된 값에 * 100을 출력
			System.out.println(number * 100);                          // < --- 여기에 generic, auto-boxing , 한개 더 
		}
	
		// Book Set 에서 데이터 추출
		for(Book book : books) {
			// book 의 가격을 10% 다운
			int price = book.getPrice();
			book.setPrice((int)(price * 0.9));
			
			System.out.println(book);
		}
		
	}

}
