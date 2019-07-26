package school;
/**
 * 학교 시스템에서 교직원의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * -------------------------------------------------
 * dept : String : 소속 부서 이름
 * --------------------------------------------------
 * @author Administrator
 *
 */
public class Employee extends Person implements Lesson, Attendance {
	
	// 1. 맴버변수 선언부
	/** 직원의 소속부서 이름*/
	private String dept;
	
	public Employee() {
		
	}
	
	public Employee(String dept) {
		this.dept = dept;
	}
	/**
	 * Employee 만의 필드 dept를 초기화 하는 생성자 
	 *      dept : String : 소속 부서명
	 */
	
	/**
	 * Person 에서 물려받는 필드 (id name age)을
	 * @param id
	 * @param namem
	 * @param agem
	 */
	public Employee(String id, String name, int age, String dept) {
		super(id, name, age);
		this.dept = dept;
	}
	
	// 3. 메소드 선언부 
	// (1) toStirng() 재정의
	@Override
	public String toString() {
		String empStr = String.format(", 부서 : %s ", dept);
		return String.format("직원 정보 [%s%s]", super.toString(), empStr);
	}

	@Override
	public String attend() {
		// TODO Auto-generated method stub
		return String.format("직원 %s 이 부서[%s] 출근하였습니다", getId(), dept);
	}

	@Override
	public String lesson() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
