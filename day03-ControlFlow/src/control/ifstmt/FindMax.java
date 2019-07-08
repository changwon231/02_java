package control.ifstmt;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 1. 선언 , 2. 초기화
		
		int x;
		int y;
		int max = 0;
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하세요");
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (x > y) {
			max = x;
		}
		if (x <= y) {
			max = y;
		}
		System.out.printf("x = %d, y = %d, 큰 수는 = %d%n", x, y, max);
	}

}
