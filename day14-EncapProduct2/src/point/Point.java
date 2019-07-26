package point;

/**
 * x, y 좌표를 정수로 가지는 
 * 수학의 한 점을 나타내는 클래스
 * 
 * @author Administrator
 *
 */
public class Point {

	// 1. 맴버변수
	private int x;
	private int y;		
	
	// 2. 생성자
	
	// 기본 생성자
	public Point() {
		
	}
	// 매개변수 받는 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 3. 메소드
	// 접근자 / 수정자
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		if(x >= 10) {
			this.x = 10;
		}else if(x < -10){
			this.x = -10;
		}else {
			this.x = x;
		}
	}
	
	public int getY() {
		return y;
	}
	/**
	 * y는 -10 ~ 10 까지 
	 * @param y
	 */
	public void setY(int y) {
		if(y >= 10) {
			this.y = 10;
		}else if(y < -10){
			this.y = -10;
		}else {
			this.y = y;
		}
	}
	
	/** toString
	 * 자바의 최상위 클래스인 Object 로 부터 물려받은 메소드
	 * 이 객체를 대표하는 문자열 
	 * 		: 맴버변수 필드를 조합하는 문자열을 리턴
	 * 		  print 계열의 메소드에서 자동으로 작동
	 */
	@Override // <-- anotation 이 메소드가 재정의되고 있음을 확인
	public String toString() {
//		return "(" + x + ", " + y + ")";
		return String.format("(%d, %d)",x, y) ;
	}
	
	public double distanceFrom(Point q) {
		
		return Math.sqrt(Math.pow(q.getX() - x, 2) + Math.pow(q.getY() - y , 2));
	}
	
	
}
