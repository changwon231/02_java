package control.loop;
/**
 * while 문을 이용하여 1~100 사이의 홀수의 합을 구하는 클래스
 * @author Administrator
 *
 */
public class PlusOfAdd {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화
		int d = 1;
		int c = 0;
		
		int sum = 0;
		
		
		// 3. 사용
		while(d <= 100) {
			if(d % 2 == 1) {
				sum += d;
			}
			
			d++;
		}
		System.out.printf("1~100까지 홀수의 합은 %d%n", sum);
		
		
		
		sum = 0;
		while(c <= 100) {
			sum = sum+c;	
			c += 2;
					
		}System.out.printf("1~100까지 짝수의 합은 %d", sum);
		
	}

}
