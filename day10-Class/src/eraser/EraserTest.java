package eraser;
/**
 * 칠판 지우개를 만들고 사용해보는 클래스
 * 
 * */
public class EraserTest {

	public static void main(String[] args) {
		// 1. 선언 : 칠판 지우개 객체 참조 변수
		Eraser laftEraser;
		Eraser rigthEraser;
		
		// 2. 초기화
		// (1) 왼쪽 지우개는 기본생성자로 초기화
		laftEraser = new Eraser();
		
		// (2) 오른쪽 지우개는 매개변수 생성자로 초기화
		rigthEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색");
		
		// 3. 사용
		// (1) 두 지우개 초기 상태 출력
		laftEraser.print();
		rigthEraser.print();
		
		// (2) 오른쪽 지우개에 한겹 제거
		rigthEraser.peel();
		
		// (3) 두 지우개 상태 출력
		laftEraser.print();
		rigthEraser.print();
		
		// (4) 오른쪽 지우개 한 겹 제거
		rigthEraser.peel();
		
		// (5) 왼쪽 지우개로 칠판 지우기
		laftEraser.erase();
		
		// (6) 두 지우개 상태 출력
		laftEraser.print();
		rigthEraser.print();
		
	}

}
