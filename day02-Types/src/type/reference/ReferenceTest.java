package type.reference;

import java.util.Scanner;

/**
 * 기본형 8가지 외의 모든 타입은 
 * 참조형 타입을 테스트 하는 클래스
 * ---------------------------------
 * 
 * 참조형 : 클래스, 인터페이스, 배열
 * 
 * 참조형의 대표격인 String 클래스 타입으로
 * 테스트 시작 !!
 * 
 * 
 * @author Administrator
 *
 */
public class ReferenceTest {

	public static void main(String[] args) {
		
		// 1. 선언 : 타입이름 변수이름;
		//	  		 선언할 때, 타입이름 자리에 기본형 8가지가 아닌 이름이 올때
		//			 무조건 그 변수는 참조형
		
		//		==> 변수 칸에 화살표가 저장되고 진짜 값은 다른곳에 존재하는 타입
		
		//		==> 자바는 참조형에 대해서 화살표를 자동으로 따라가서 진짜값을
		//			꺼내 쓸 수 있도록 편의를 제공한다.
		
		String name;
		
		// 2. 초기화
		name = "Chang won";
		
		// 3. 사용
		System.out.println("name = " + name);
		Scanner scan = new Scanner(System.in);
		String i;
		System.out.println("입력");
		i = scan.next();
		System.out.printf("%s", i);
		
		
		
	}

}
