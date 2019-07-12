package array.basic;

public class ForTest {

	public static void main(String[] args) {
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
