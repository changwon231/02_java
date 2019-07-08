package control.ifstmt;

import java.util.Scanner;

/**
 * 두 정수를 입력받아
 *
 * @author Administrator
 *
 */
public class MinMax {

	public static void main(String[] args) {
		//1. 선언
		// 입력받을 변수 선언
		int x,y;
		// 큰 값, 작은 값을 저장할 변수 선언
		int min, max;
		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("두 정수를 입력 (space bar 로 분리)");
		
		// 스캐너 사용하여 x,y두 변수의 
		x = scan.nextInt();
		y = scan.nextInt();
		
		// 3. tkdyd : if ~ else 로직으로 큰 값, 작은값 판별
		if (x <= y) {
			min = x;
			max = y;
		}else {
			min = y;
			max = x;			
		}
		// 출력
		System.out.printf("입력된 두 정수 : %d, %d%n",x,y);
		System.out.printf("작은값 :  %d%n",min);
		System.out.printf("큰값 :  %d%n",max);
		
	}

}
