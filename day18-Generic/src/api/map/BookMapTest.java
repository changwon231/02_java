package api.map;

import static java.lang.Integer.valueOf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * key 		= Integer
 * value 	= Book
 * -----------------------------------
 * 데이터 입력
 * key : Book 객체의 seq 를 입력
 * value : Book 객체 자체 
 * -----------------------------------
 * 데이터 출력
 * foreach
 *  (1) key set 얻기
 *  (2) get(key) 로 추출 => 출력
 *  
 * foreach
 *  (1) key set 얻기
 *  (2) 각 Book 객체의 가격 10% 할인가로 출력
 *   
 *  
 * @author Administrator
 *
 */
public class BookMapTest {

	public static void main(String[] args) {
		// 1. 선언 : key : Integer, Value : String
		Map<Integer, Book> books;
		books = new HashMap<Integer, Book>();
		
		Book vegetrian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10000, 10);
		Book littlePrins = new Book(2, "9788932917245", "어린 왕자", "앙투안 드 생택쥐페리 ", "더 스토리", 150, 8820, 5);
		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바 ", "위즈덤 하우스", 192, 10800, 3);
		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "혼", 208, 12420, 2);
		Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		// 데이터 입력
		books.put(valueOf(vegetrian.getSequence()), vegetrian);
		books.put(littlePrins.getSequence(), littlePrins);
		books.put(noDaap.getSequence(), noDaap);
		books.put(dduk.getSequence(), dduk);
		books.put(ax.getSequence(), ax);
		books.put(6,new Book());
		// 데이터 출력
		// key set 얻기
		Set<Integer> keys = books.keySet();
				
		// 출력 foreach
		for (int key : keys) {
			System.out.printf("key = %d\t : value = %s%n", 
					key, books.get(key).toString());
		}
		// 가격을 전부 %10 다운시켜서 출력
		for (int key : keys) {
			int price = books.get(key).getPrice();
			books.get(key).setPrice((int)(price * 0.9));
			System.out.printf("key = %d\t : value = %s%n", 
					key, books.get(key).toString());
		}
		
//		Map<Integer, Book>[] bookMaps = new HashMap[5];		
//		List<Map<Integer, Book>> booksList;
//		Set<Map<Integer, Map<Integer, List<Integer>>>> booksSet;
	}

}
