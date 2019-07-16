package array.multi;

import java.util.Scanner;

public class ArxheryCore {

	public static void main(String[] args) {
		// 1. 선언  2. 초기화
		Scanner scan = new Scanner(System.in);
		int[][] score = new int [3][9];
		int[] sum = new int [3];
		int max = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장
		System.out.println("양궁선수의 점수 입력");
		for(int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번째 선수 점수 입력");
			for(int num = 0; num < 9; num ++) {
				System.out.printf("%d 차시", num +1);
				score[i][num] = scan.nextInt();
			}		
		}
		
		int tt ;
		int oo ;
		System.out.println(" 세 선수의 점수는 ");
		for(oo = 0; oo < 3; oo++) {
			for(tt = 0; tt < 9 ; tt++) {
				sum[oo] += score[oo][tt];
				
			}
			
			System.out.printf("%d \t",sum[oo]);
		}
		int s ;
		int sunsu = 0;
		System.out.println(" \n\n우승 선수는\n ");
		for (s = 0 ;s<3; s++) {
			if(max < sum[s]) {
				max = sum[s];
				sunsu = s;
			}
		}System.out.printf("=======================\n %d 번째 선수! 점수는 ~ ~ ~  %d\n===================== ", s + 1 , max);
	}

}
