package point;

/**
 * 수학에서 이름이 붙은 점을 나타내는 클래스
 * 
 * @author Administrator
 *
 */
public class NamedPoint extends Point {
	
	/**점의 이름을 정의하는 매개변수*/
	private String name;
	
	public NamedPoint(int x, int y) {
		super(x, y);
	}
	
	public NamedPoint(String name, int x, int y) {
		this(x, y);
		this.name = name;
	}
	
	
	// 3. 접근자 / 수정자
	public String getName() {
		return name; 

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// toString()재정의
	// 부모클래스에서 물려받은 (1,2) 와 같이 좌표를 괄호에 
	// 표기하는 문자열 앞쪽에 점의 이름을 덧붙이도록 변경
	@Override
	public String toString() {
		return name + String.format("(%d, %d)",getX() ,getY());
	}
	
}
