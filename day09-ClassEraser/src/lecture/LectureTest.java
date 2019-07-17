package lecture;

public class LectureTest {

	public static void main(String[] args) {
		Eraser laftEraser;
		Eraser rigthEraser;
		
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 2. 초기화
		laftEraser = new Eraser(3.5, 12.0, 5.5, 3, "검정", "왼쪽");
		rigthEraser = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");

		red = new Marker(true, "빨강", true); 
		blue = new Marker(false, "파랑", true); 
		green = new Marker(true, "초록", true); 
		black = new Marker(true,  "검정", true); 
		
		// 3. 사용
		// (1) 네개의 마커를 한번씩 사용
		red.use();
		blue.use();
		green.use();
		black.use();
		// (2) 오른쪽, 왼쪽 지우개로 사용한 내용 지우기
		laftEraser.erase();
		rigthEraser.erase();
		// (3) 오른쪽 지우개 한 겹 벗겨내기
		rigthEraser.peel();
		// (4) 오른쪽 지우개 상태 출력
		rigthEraser.print();
	}

}
