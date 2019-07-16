package practice.methods;

import java.util.Calendar;
import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
		// 1. 메소드 정의 클래스 VarietyMethods 의 
		// 	  변수 선언
		VarietyMethods methods;
		Scanner scan = new Scanner(System.in);
		// 2. 초기화
		methods = new VarietyMethods();
/*		
		// 3. 사용
		methods.sayHello();
		methods.maxims("홍길동", "호부호형을 못하니...");
		methods.maxims("소크라테스", "Know Yourself");
		methods.maxims("피터사간", "모든 사람은 두 종류의 고통을 선택해야 한다." + 
								   " 훈련하는 고통이거나, 후회하는 고통이거나");
		// 1. 
		System.out.println("온도를 입력하세요 (숫자)\n");
		double cel = methods.fahToCel(scan.nextDouble());
		System.out.println("cel = " + cel);
	
		// 2. 
		System.out.println("이름과 생년 출생월을 입력하세요\n");
		methods.birthYearMonth(scan.next(), scan.nextInt(), scan.nextInt());
		
		// 3. 
		System.out.println("구구단중 원하는 단을 입력하세요 : \n");
		methods.printNineNineTable(scan.nextInt());
		
		// 4.
		System.out.println("구구단중 몇단까지 나오게 할까? \n");
		methods.printNineNineTable(scan.nextInt());
		
		// 5.
		System.out.println("키(cm)와 몸무게(kg)을 입력\n");
		String s = methods.calcBmi(scan.nextDouble(),scan.nextDouble());
		System.out.printf(" 당신은 : %s\n",s);
		
		// 6.
		System.out.println("두 정수를 입력해\n");
		int c = methods.min(scan.nextInt(), scan.nextInt());
		System.out.println("두 값중 작은 수는 \n");
		System.out.printf("%d",c);
		
		// 7.
		System.out.println("두 정수를 입력해\\n");
		int cc = methods.max(scan.nextInt(), scan.nextInt());
		System.out.println("두 값중 큰 수는 \n");
		System.out.printf("%d",cc);
*/		
		// 8.
		System.out.println("몇개를 입력할거냐?%n");
		int[] number;
		number = new int[scan.nextInt()];
		System.out.println("숫자를 입력해");
		for (int idx = 0; idx < number.length; idx++) {
				number[idx] = scan.nextInt(); 
		}
		int sum = methods.sumOfArray(number);
		System.out.printf("합은 : %d",sum);
		
	
		// 9.
		System.out.println("몇개를 입력할거냐?\n");
		int[] input ;
		input = new int[scan.nextInt()];
		System.out.println("숫자를 입력해");
		for (int ii = 0; ii < input.length; ii++) {
			input[ii] = scan.nextInt(); 
		}
		double av = methods.avgOfArray(input);
		System.out.printf("평균은 : %f",av);

	
	}
	

}
