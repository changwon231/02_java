package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * 
 * Scanner 를 사용하여 입력된 정수를 input 변수에 저장하고
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오.
 * 2의 배수 판별 결과는 String result 에 저장하시오
 * 
 * (1).---------------------------------------------------------
 * 2의 배수일 때 	  : "입력값 4은(는) 2의 배수 입니다."
 * 2의 배수가 아닐 때 : "입력값 5 은(는) 2의 배수가 아닙니다."
 * (2)-----------------------------------------------------------
 * 나머지는 int mod; 에 저장하여 사용하시오.
 * 
 * 2의 배수일 때 	  : "입력값 4은(는) 2의 배수 입니다."
 * 2의 배수가 아닐 때 : "입력값 5 은(는) 2의 배수가 아닙니다."
 * 						"나머지가 1입니다."
 * 
 * @author Administrator
 *
 */
public class MultipleOfTwo {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int mod;
		int i = 0;
		String result;
		Scanner scan;
		
		// 질문
		System.out.println("정수를 입력하세요");
				
		// 2. 초기화
		scan = new Scanner(System.in);
		while( i <10) {
			
		
		input = scan.nextInt();

		// 2.1 판단 조건
		mod = input%2;
		
		// 3. 사용
		// 입력값이 0인 경우 : " 0은 배수 판별할 수 없습니다."
		if (input == 0) {
			result = "배수를 판별할 수 없습니다.";
		}else if (input % 2 == 0) {
			// 위의() 안의 연산은 연산자 우선 순위에 의해
			// input % 2 의 연산이 먼저 수행되고 난 뒤
			// 그 결과가 0과 같은지 == 연산이 수행됩니다.
			result = "2의 배수 입니다.";
		}else{
			result = "2의 배수가 아닙니다.\n나머지가 1입니다.";
		}
		System.out.printf("입력값 %d 은(는)  %s%n",input,result);
	}i++;
	}
}
