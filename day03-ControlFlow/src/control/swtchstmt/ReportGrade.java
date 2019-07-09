package control.swtchstmt;

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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언
		double grede;
		int score;
		Scanner scan;
		System.out.println("점수를 입력하시오.");
		
		// 2. 초기화
		scan = new Scanner(System.in);
		score = scan.nextInt();
		//System.out.printf("%f" ,  score/3);
		
		// 3. 사용
		
		switch(score/10) {
		case 9 : case 10 :
			System.out.println("학점은 A");
		break;
		case 8 :
			System.out.println("학점은 B");
		break;
		case 6 :  case 7 :
			System.out.println("학점은 C");
		break;
		case 4 :  case 5 :
			System.out.println("학점은 D");
		break;
		default :
			System.out.println("학점은 F");
			
		
		}
		
		
	}

}
