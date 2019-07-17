package marker;

public class Marker {
	// 1 - -  변 수  선언
	// 1. 새것인지
	boolean isNew;
	// 2. 색깔
	String coler;
	// 3. 열렸는지 닫혔는지
	boolean isOpend;
	
	
	
	// 2 - -  생성자 선언 - 중복정의
	Marker(){	
	};
	
	Marker(boolean isNew){
		this();
		this.isNew = isNew;
	};
	
	Marker(boolean isNew, String coler){	
		this(isNew);
		this.coler = coler;
	};
	
	Marker(boolean isNew, String coler, boolean isOpend){	
		this(isNew, coler);
		this.isOpend = isOpend;
	};
	// 3 - -  메소드 선언
	/**
	 * ~색의 마커를 사용하고 있습니다.
	 * 라는 문장을 출력하는 메소드
	 * */
	public void use() {
		System.out.printf("%s의 색의 마커를 사용하고 있습니다.%n",coler);
	}
	
	/**
	 * 
	 * */
	public void print() {
		String message = "마커 색상 : %s, %s, %s %n";
		
		String openStatus = "";
		String newStatus = "";
		
		if(isOpend) {
			openStatus = "뚜껑이 열려 있습니다.";
		}else {
			openStatus = "뚜껑이 닫혀 있습니다.";
		}
		
		if(isNew) {
			newStatus = "새 마커입니다.";		
		}else {
			newStatus = "다쓴 마커입니다.";		
		}
		System.out.printf(message, coler, openStatus, newStatus);
	}
	
	
	
	
	
	
	
	
}
