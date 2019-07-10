package control.loop;

/**
 * 중첩 for loop 를 사용하여 구구단을 출력 2 ~ 9 단 출력
 * 
 * 각 단을 시작할 때 단의 제목 출력
 * 
 * @author Administrator
 *
 */
public class NineNineTable3 {

	public static void main(String[] args) {
		int dan = 1;
		int stage = 0;
		int times = 5;

		for (int k = 2; k < 10; k += 3) {

			System.out.printf("%2d단 %12d단 %12d단\n", k, k + 1, k + 2);

			for (int j = 1; j < 10; j++) {

				for (int i = dan; i <4; i++) {
					System.out.printf("%2d  X %2d = %2d  ", i, j, (i * j));
					
				}
				times++;
				System.out.println("");

			}
			System.out.println("");
		}

	}

}
