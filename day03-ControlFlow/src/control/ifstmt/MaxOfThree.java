package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 세 정수중 가장 큰 값을 판별하는 클래스 입력값은 가가 int num1, num2, num3; 변수에 저장 가장 큰 값은 int
 * max; 변수에 저장
 * 
 * 중접 if ~ else 로 판단
 * 
 * 마지막 출력 : printf 사용
 * 
 * @author Administrator
 *
 */
public class MaxOfThree {

	public static void main(String[] args) {
		// 1. 선언
		int num1, num2, num3, max;
		Scanner scan;
		System.out.println("세 정수를 입력하세용");
		// 2. 초기화
		scan = new Scanner(System.in);

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 3. 사용
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.printf("입력한 값은 %d , %d , %d 이고 가장 큰건 %d <-이거",num1 ,num2 ,num3, max);
	}

}
