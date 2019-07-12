package array.basic;
/**
 * 자바 1.5 부터 지원
 * 데이터 구조화 함께 사용
 * 
 * 데이터 구조
 * @author Administrator
 *
 */
public class ForEachTest {

	public static void main(String[] args) {
		// 1. 배열의 선언(과 동시에 값을 넣으면서 초기화)
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		// 3. foreach 구문으로 배열 값 출력
		// for(원소의 타입 변수이름 : 자료구조 (==배열)){
		//     문장들
		//}
		for(int num : numbers) {
			sum += num;
			System.out.println("num = "+ num);
		}
		System.out.println("sum =" + sum);
	}

}
