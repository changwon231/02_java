package control.loop;
/** 
 * 1. 50 ~ 0 까지 짝수만 역순으로 출력
 * 	(1) continue 없이
 * 	(2) continue 사용
 * 
 * 2. 1 ~ 10 까지 제곱표를 출력
 * 		1 X 1 = 1
 * 		2 X 2 = 4
 * 		....
 * 		10 X 10 =100
 * @author Administrator
 *
 */
public class ForTest {

	public static void main(String[] args) {
			// 1. 선언 2. 초기화
		int sum = 0;
		for(int num = 50; num > -1; num -=2) {
			System.out.printf("짝수를 출력 %d%n",num);
		}
		System.out.println("---===---==--==---==-=-=-=-====-=----==-==-=-");
		for(int num = 50; num > -1; num--) {
			if (num % 2==1)
				continue;
			
			System.out.printf("짝수를 출력 %d%n",num);
		}
		
		for(int numb = 1; numb <= 10; numb++) {
			System.out.printf("%2d  x  %2d  = %3d %n",numb ,numb ,numb*numb);
		}
			
	}

}
