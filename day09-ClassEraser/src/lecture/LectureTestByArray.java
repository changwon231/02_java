package lecture;

/**
 * 2개의 지우개와 4개의 마커를 
 * 배열을 사용하여 사용/ 관리 하는 테스트 클래스
 * -------------------------------------------------
 * 1. 마커(Marker)배열 markers를 선언
 * 	  지우개(Eraser)배열 erasers를 선언
 * 
 * 2. markers 는 길이 4로 생성
 * 	  eraser는 길이 2로 생성
 * 
 * markers[0] ~
 * markers[3] red, green, blue, black 마커를 저장
 * 
 * erasers[0], [1] 에는 순서대로, leftEraser, rightEraser를 저장
 * 
 * 3. foreach 를 사용하여
 * 	(1) 모든 마커를 한번씩 사용(use())
 * 	(2) 모든 지우개를 한번씩 사용(eraser())
 *  (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
 *  (4) 모든 지우개의 상태 출력
 *  (5) 모든 마커의 상태 출력
 *  
 * @author Administrator
 *
 */
public class LectureTestByArray {

	public static void main(String[] args) {
		// 1. 배열 선언
		Marker[] markers;
		Eraser[] erasers;
	

		// 2. 초기화(길이 생성)
		markers = new Marker[4];
		erasers = new Eraser[2];
		
		markers[0] = new Marker(true, "빨강", true); ;
		markers[1] = new Marker(false, "파랑", true);
		markers[2] = new Marker(true, "초록", true); 
		markers[3] = new Marker(true,  "검정", true);
		
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "오른쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "흰색", "왼쪽");		
		
		// 3. 
		// (1) 모든 마커를 한번씩 사용
		for(Marker marker:markers) {
			marker.use();
		}
		// (2) 모든 지우개를 한번씩 사용(eraser())
		for(Eraser eraser:erasers) {
			eraser.erase();
		}
		
		// (3) 모든 지우개를 한번씩 한 겹 벗겨내기(peel())
		for(Eraser eraser:erasers) {
			eraser.peel();
		}
		
		// (4) 모든 지우개의 상태 출력
		for(Eraser eraser:erasers) {
			eraser.print();
		}
		
		// (5) 모든 마커의 상태 출력
		for(Marker marker:markers) {
			marker.print();
		}
		
	
	
	}

}
