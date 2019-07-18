package snack;
/**
 * Oreo 쿠키가 3개 들어있는 oreoBox 라는 변수를
 * Oreo 배열 타입으로 선언하고
 * 
 * oreoBox[0] ~ [2] <== Oreo 쿠키를 입력
 * 크림의 종류는 바닐라, 초코, 딸기, 커스터드 중 하나로 입력할 것.
 * 
 * foreach 를 사용하여
 * oreoBox 에서 모든 쿠키의 상태를 출력
 * 
 * for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
 * 
 * foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
 * 
 * @author Administrator
 *
 */
public class OreoTest {

	public static void main(String[] args) {
		// 1. 선언
		Oreo oreoBoxs[] = new Oreo[3];
		
		// 2. 초기화
		oreoBoxs[0] = new Oreo("딸기");
		oreoBoxs[1] = new Oreo("초코");
		oreoBoxs[2] = new Oreo("커스터드");
		
		// 3. 사용
		// oreoBox 에서 모든 쿠키의 상태를 출력
		for(Oreo oreoBox : oreoBoxs) {
			oreoBox.print();
		}
		
		// for를 사용하여 모든 쿠키의 크림을 바닐라로 변경
		for(int i = 0; i < oreoBoxs.length; i++) {
			oreoBoxs[i].changeCream("바닐라");
		}
		
		// foreach 사용해서 모든 쿠키의 크림 변경 상태 확인을 위한 출력
		for(Oreo oreoBox : oreoBoxs) {
			oreoBox.print();
		}
		
	}

}
