package practice.methods;
/**
 * 메소드 작성 연습 클래스
 * 
 * 
 * @author Administrator
 *
 */
public class VarietyMethods {

	/**
	 * 화면에 hello, world! 를 출력하는 메소드
	 * sayHello를 작성하시오
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}
	/**
	 * 매개변수 
	 * 유명인(명사)의 이름을 입력(name) 받고 
	 * 그 사람이 한 유명한 문구(maxim) 를 입력받아
	 * 
	 * OOO(이)가 말하길 ... 라고 하였다.
	 * 
	 * 라는 문장을 출력하는 메소드
	 * maxims 을 정의하여라.
	 */
	public void maxims(String name, String maxim) {
		System.out.printf("%s(이)가 말하길 \"%s\"라고 하였다 \n",name , maxim );
		
	}
	/**
	 * 입력된 화씨온도를 섭씨온도로 변환하여 
	 * 변환된 섭씨온도를 리턴하는 메소드 
	 * fahToCel을 정의하여라.
	 * 
	 * 변환 공식 : 5 / 9 * (F - 32)
	 * @param fah : double 변환할 화씨 온도 값
	 * @return 변환된 섭씨 온도 값
	 */
	public double fahToCel(double fah) {
		return 5 / 9.0 * (fah - 32);
		
	}
	//=====================================
	/**
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 받아
	 * 
	 * OOO는 XXXX년 XX월 생입니다. 
	 * 
	 * 라는 문자응로 출력하는 메소드
	 * birthYearMonth 를 정의하시오
	 * @param name : String
	 * @param year : int
	 * @param month : int
	 * 
	 */
	public void birthYearMonth(String name, int year, int month) {
		System.out.printf("%s은 %d년 %d월 생 입니다.\n", name , year, month);
	}
	/**
	 * 출력할 단의 숫자를 입력받아
	 * 해당 단의 구구단을 출력하는 메소드
	 * printNineNineTable 을 정의하시오
	 * 
	 * 출력의 첫 줄에 X 단 이라는 제목을 출력
	 * 
	 * @param stage : int
	 */
	public void printNineNineTable(int stage) {
		System.out.printf("%d단 %n",stage);
		for(int i = 1; i < 10 ; i ++) {
		System.out.printf("%2d  x %2d = %d %n", stage , i , stage * i);
		}
	}
	/**
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해 구구단을 출력하는 메소드
	 * printNineNineTableFromArray 를 정의하시오 
	 * @param stages : int[]
	 */
	public void printNineNineTableFromArray(int[] stage) {
		for (int j=1; j < stage.length + 1; j++) {
			System.out.printf("%d단 %n",j);
			for(int i = 1; i < 10 ; i ++) {
			System.out.printf("%2d  x %2d = %d %n", j, i , j * i);
			}
		}
	}
		
	/**
	 * 키(cm), 몸무게(kg) 을 매개변수로 입력받아 BIM지수를 계산하여
	 * 비만도 판정 결과를 리턴하는 메소드 calcBmi 를 정의하시오.
	 * 
	 * 공식 : 몸무게(kg) / 키(m) 의 제곱
	 * 
	 * 15.0 미만			병적인 저체중
	 * 15.0 이상 18.5 미만	저체중
	 * 18.5 이상 23.0 미만	정상
	 * 23.0 이상 27.5 미만	과체중
	 * 27.5 초과 40.0 이하 	비만
	 * 40.0 초과			병적인 비반
	 * 
	 * @param height : double
	 * @param weight : double
	 * @return String 비만도 판정 문자열
	 */
	public String calcBmi(double height, double weight) {
				
		double t = weight/ (height * height *0.00001); 
				String s ;
				
		if (t < 15) {
				s = "병적인 저체중";	
		}else if (t < 18.5) {
				s = "저체중";
		}else if (t < 18.5) {
				s = "정상";
		}else if (t < 18.5) {
				s = "과체중";
		}else if (t < 18.5) {
				s = "비만";
		}else {
				s = "병적인 비만";
		}
		return s;
	}
	/**
	 * 입력된 두 정수중에서 작은 수를 찾아 리턴하는 메소드
	 * min 을 정의하시오 
	 * 
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 입력된 두 값중 작은 정수
	 */
	public int min (int input1, int input2) {
		int c = 0;
		if(input1 < input2) {
			c = input1;
		}else {
			c = input2;
		}
		return c;
	}
	/**
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * max 를 정의하시오 
	 * 
	 * @param input1 : int
	 * @param input2 : int
	 * @return int 입력된 두 값중 큰 정수
	 */
	public int max (int input1, int input2) {
		int c = 0;
		if(input1 < input2) {
			c = input1;
		}else {
			c = input2;
		}
		return c;
	}
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아 
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드 
	 * sumOfArray 를 정의하시오 
	 * 
	 * @param numbers : int[](int 배열)
	 * @return int 배열의 각 원소의 합
	 *
	 */
	public int sumOfArray(int [] number) {
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;		
	}
	/**
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소의 평균을 구하여 리턴하는 메소드 
	 * avgOfArray 를 정의하시오 
	 * 
	 * @param number : input[] (int 배열)
	 * @return double 배열의 각 원소의 평균
	 */
	public double avgOfArray(int [] input) {
		// 1. 배열 원소의 총합
		// (1) 총합 변수 선언, 초기화
		int sum = 0;
		// (2) 평균 변수 선언
		double avg = 0;
		// (3) 배열의 원소의 합을 구함 ==> foreach
		for(int num :input) 
			sum += num;
		
		
		// 2. 총합 / 원소의 갯수 ==> 평균
		avg = (double)sum / input.length;
		return avg;		
	}
	/**
	 * char 타입의 연산자와 두개의 정수를 매개변수로 입력받아
	 * 
	 * 입력된 연산자가 '+' 일 때만 
	 * 두 정수의 합을 구하여 출력하는 메소드 
	 * adder를 정의하시오
	 * 
	 * 출력 형태 예) 10 + 20 = 30
	 * 
	 * @param op : char 연산자가 전달되는 변수
	 * @param x : int 첫번째 피 연산자
	 * @param y : int 두번째 피 연산자
	 */
	
	
	
	
}
