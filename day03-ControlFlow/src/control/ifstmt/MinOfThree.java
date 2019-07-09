package control.ifstmt;

import java.util.Scanner;

/**
 * 세 정수를 입력받아서 그중 가장 작은 정수를 판별하는 클래스이다.
 * ----------------------------------------- 가장 작은 정수를 판별할 때 중첩 if ~ else 구문을 사용
 * -----------------------------------------
 * 
 * @author Administrator
 *
 */
public class MinOfThree {

	public static void main(String[] args) {
		// 선언.
		int num1;
		int num2;
		int num3;
		int min;

		Scanner scan;
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("세 정수를 입력하시오 (space bar 로 분리)");

		// 입력값 저장
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		// 3. 사용 : 입력값의 대소 비교
		if (num1 < num2) {
			// num1이 적을 때 진입
			if (num1 < num3) {
				min = num1;
			} else {
				min = num3;
			}
		} else {
			if (num2 < num3) {
				min = num2;
			} else {
				min = num3;
			}

		}
		System.out.printf("입력한 값은 %d , %d , %d 이고 가장 작은건 %d <-이거", num1, num2, num3, min);
	}

}
