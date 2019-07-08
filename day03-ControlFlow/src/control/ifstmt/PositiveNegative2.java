package control.ifstmt;

import java.util.Scanner;

/**
 * 하나의 정수를 입력받아서 
 * 음수인지, 양수인지 판단하는 클래서
 * 
 * 단, 여기서는 0에 대한 판단은 하지 않는다.
 * 
 * 입력받을 변수 input 을 선언하여 Scanner 로 입력받고
 * if ~ else 구문으로 부호를 판별한 후 
 * 판별 결과를 저장하는 변수 String result 에 저장하여
 * 
 * "입력값 100은(는) 양수 입니다."
 * "입력값 -1 은(는) 음수 입니다." 
 * "입력값 0 은 0 입니다." 라는 문장을 출력하시오.
 * @author Administrator
 *
 */
public class PositiveNegative2 {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int input ;
		String result;
		// 입력함수
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		input = scan.nextInt();
		
		// 3. 사용
		if (input > 0) {
			result = "양수";		
		}else if(input < 0){
			result = "음수";
		}else {
			result = "양수도아니고 음수도아닌수";
		}
			
		System.out.printf("입력값 %d은(는) %s 입니다.",input , result);
		
	}

}
