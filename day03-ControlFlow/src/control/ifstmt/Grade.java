package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여 다음의 기준으로 학점을 계산하는 클래스
 * ------------------------------------------- 
 * A : 90점 이상 
 * B : 80 ~ 89점 사이 
 * C : 60 ~ 79점 사이 
 * D : 40 ~ 59점 사이
 * F : 이하 나머지
 * 
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int grade, score;
		Scanner n;
		n = new Scanner(System.in);

		// 입력 알림
		System.out.println("점수를 입력하세요");

		// 2. 초기화
		score = n.nextInt();

		// 3. 사용
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 60) {
			grade = 'C';
		} else if (score >= 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("학점은 : %c 임 ㅋ", grade);  // ctrl + shift + f - 줄맞춤

	}

}
