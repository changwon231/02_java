package control.loop;
/**
 * 화씨온도(F) -> 섭씨온도(C) 변환공식 C = 5/9(F-32) 를 이용
 * 화씨온도 -> 섭씨온도 변환표 출력
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도 까지 출력
 * for loop 이용, 온도는 double 타입으로 계산 
 * 
 * @author Administrator
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언
		double tempurture;
		double C=0;
		
		// 2. 초기화
		
		
		// 3. 사용
		for (tempurture = 0; tempurture <= 100; tempurture += 10.0) {
			C=(5.0/9)*(tempurture-32);
			System.out.printf("%5.1f F  = %5.1f C\n",tempurture , C);
		}
		
		
	}

}
