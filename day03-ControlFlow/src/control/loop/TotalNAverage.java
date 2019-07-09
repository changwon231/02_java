package control.loop;

import java.util.Scanner;

/**
 * 총점과 평균 구하기
 * @author Administrator
 *
 */

public class TotalNAverage {
	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int total = 0; 
		int score = 0;
		int count = 0;
		double average;
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요, (끝내려면 -1을 입력)");

		// 3. 사용
		while(score != -1) {
			total += score;
			score = scan.nextInt();
			count++;
		}
		if (count == 1)	{
			System.out.println("입력된 값이 없습니다.");
		}else{
		average = (double)total/(count-1);
		System.out.printf("총점 = %d ,  평균 = %f", total, average);
	
		}
	}
}
