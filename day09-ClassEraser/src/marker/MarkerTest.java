package marker;

public class MarkerTest {

	public static void main(String[] args) {
		// 1. 선언
		Marker red;
		Marker blue;
		Marker green;
		Marker black;
		
		// 2. 초기화
		red = new Marker(true, "빨강", true); 
		blue = new Marker(false, "파랑", true); 
		green = new Marker(true, "초록", true); 
		black = new Marker(true,  "검정", true); 
		
		// 3. 사용
		red.print();
		blue.print();
		green.print();
		black.print();
		
		red.use();
		black.use();
 	}

}
