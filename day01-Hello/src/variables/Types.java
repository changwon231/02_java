package variables;
/**
 * 
 *문서 주석
 *
 *
 * 자바의 자료형을 테스트 하는 클래스이다.
 *
 **/
public class Types {

	public static void main(String[] args) {
		// 1. 변수의 선언
			
		//    변수 선언 구문 : 타입이름 변수이름;
		
		// (1) char : 문자 1글자를  저장하는 타입
		char c;
		
		// (2) int : 꽤 큰 정수를  저장하는 타입
		int size;
		
		// (3) String : 1글자 이상의 문자열을 저장하는 타입
		String name;
		
		// 2. 초기화 구문
		c ='A';
		size =  95;
		name = " 김수한무거북이와두루미 ";
		
		// 3. 사용 : 출력
		System.out.println("c ="+c);
		System.out.println("size =" + size);
		System.out.println("name =" + name);
		
		
	}

}
