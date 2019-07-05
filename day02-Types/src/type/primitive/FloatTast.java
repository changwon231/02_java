package type.primitive;
/**
 * folat, double
 * 
 * @author Administrator
 *
 */
public class FloatTast {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		
		// 2. 초기화
		pi1 = 3.14F;
		pi2 = 3.14;
		
		// 3. 사용 : 변수값 출력
		System.out.println("float pi = " + pi1);
		System.out.println("double pi = " + pi2);
		
		
		System.out.println("========================== " );
		
		pi1 = 3.141592653589793238462643383279502884197169F;
		pi2 = 3.141592653589793238462643383279502884197169;
				
		System.out.println("float pi = " + pi1);
		System.out.println("double pi = " + pi2);
		
	}

}
