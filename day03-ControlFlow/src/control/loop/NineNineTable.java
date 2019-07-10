package control.loop;
/**
 * 중첩 for loop 를 사용하여 구구단을 출력
 * 2 ~ 9 단 출력
 * 
 * 각 단을 시작할 때 단의 제목 출력
 * @author Administrator
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화 3. 사용
		
		// 외부 for loop 사용
		for(int stage = 2; stage<10; stage++) {
			System.out.printf("%n%d 단 %n",stage);
			for(int times = 1; times < 10 ;times ++) {
				System.out.printf("%d X %d = %d  %n", stage, times, stage*times);
			}
		}
	}

}
