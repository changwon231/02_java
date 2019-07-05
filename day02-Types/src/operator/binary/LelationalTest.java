package operator.binary;

import java.util.Scanner;

public class LelationalTest {

	public static void main(String[] args) {
		Scanner scan;
		int i = 10;

		  while(i > 0){

			  scan = new Scanner(System.in);
				System.out.println("정수 두 개를 입력 :");
		

		 
		// 1. 선언, 2. 초기화
				int a = scan.nextInt();
				int b = scan.nextInt();
				
		// 3. 비교 연산자 사용
		System.out.println("등가 비교 연산자");
		System.out.println("---------------------------------");
		
		System.out.printf("(%d == %d) : %b%n",a ,b, (a==b));
		System.out.printf("(%d != %d) : %b%n",a ,b, (a!=b));
		
		System.out.println("대소 비교 연산자");
		System.out.println("---------------------------------");
		
		System.out.printf("(%d < %d) : %b%n",a ,b, (a<b));
		System.out.printf("(%d > %d) : %b%n",a ,b, (a>b));
		System.out.printf("(%d >= %d) : %b%n",a ,b, (a>=b));
		System.out.printf("(%d <= %d) : %b%n",a ,b, (a<=b));
		
		
		System.out.println(i);

		i--;
		
		// 이클립스 IDE의 단축기
		// ctrl + d 		: 커서가 있는 행 전체 삭제
		// alt + shift + a 	: 세로줄 편집 기능 토글
		// alt + up/down 	: 행 전체 상하 이동
		// ctrl + shift + L : 단축키 모음 안내창 오픈
		// ctrl + F6 		: 열려있는 파일 사이를 이동 
		  
		  
		  }
	}

}
