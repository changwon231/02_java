package api.wrapper;
import static java.lang.System.currentTimeMillis;
public class SystmeTest {

	public static void main(String[] args) {

		long start, end;
		start = System.currentTimeMillis();
		
		System.out.println("현재 시간 :" + start);
		System.out.println("10,000 만 번 반복문 시작" );
		int s, r, a;
		for(int i = 0; i < 1000; i++) {
			s = i + i;
			r = s + i;
			a = r + r;
					
		}
		System.out.println("10,000 만 번 반복문 종료");
		
		end = System.currentTimeMillis();
		System.out.println("반복 종료 시간 : " + end);
		System.out.println("반복 소요 시간 : " + (end - start));
		
	}

}
