package control.loop;
/**
 * 0 ~ 10까지 출력하는 클래ㅅ,
 * 
 * while 구문을 사용하여
 * 반복출력을 구한다.
 * @author Administrator
 *
 */
public class PrintToTen {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int number = 0;
		// 3.
		while (number <= 10) {
			System.out.printf("number = %d%n",number ++);
		}// end while
		
		
	}// end main

}// end class
