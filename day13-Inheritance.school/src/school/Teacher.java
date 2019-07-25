package school;
/**
 * 학교 시스템에서
 * 과목을 가르치는 선생의 정보를 저장하는 클래스
 * @author Administrator
 *
 */
public class Teacher extends Person {
	
	// 1. 맴버변수
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String subject) {
		this.subject = subject;
	}
	// (2) 매개변수를 받는 생성자
	
	/**
	 * 모든 필드를 초기화 하는 생성자
	 * --------------------------------------
	 * Person 에서 물려받는 필드 (id, name, age) 를 
	 * 부모클래스의 생성자를 빌려서 초기화하고
	 * Teacher 의 필드인 subject는 직접초기화 
	 *
	 */
	public Teacher(String id, String name, int age, String subject) {
		super(id, name, age);
		this.subject = subject;
	}
	
	// 3. 메소드
	// (1) toString()재정의
	@Override
	public String toString() {
		String tcStr = String.format(", 과목 : %s", subject);
		return String.format("교사 정보 [%s%s]", super.toString(), tcStr);
	}
}
