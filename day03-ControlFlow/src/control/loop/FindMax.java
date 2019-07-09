package control.loop;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// 1. 선언
		int input;
		int max;
		Scanner scan = new Scanner(System.in);
		// 2. 초기화
		max = 0;
		// 3. 입력값으로 부터 max 를 반복 설정
		do {
			System.out.println("양수를 입력(끝내려면 0입력)");
			input = scan.nextInt();
			if(input > max) {
				max = input;
			}
		}while(input>0);
		System.out.printf("최대값은 %d 입니다.",max);
		
		
	}

}
