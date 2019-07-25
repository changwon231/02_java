package product;
/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * --------------------------------------------------
 * 맴버변수(private, portact 등 없이)
 * 제품번호 : pcode 	: String : <== "P001"
 * 제품  명 : pname 	: String : <== "삼성 지펠..."
 * 가격 	: price		: int 	 : 진짜 그 제품 가격
 * 제고수량	: quantity	: int 	 : 
 * ---------------------------------------------------
 * 생성자 (public으로 선언)
 * 기본 생성자, 매개변수 받는 생성자 필드 1씩 늘려가며 
 * this, this() 사용
 * ----------------------------------------------------
 * 메소드 (public으로 선언)
 * print() : void
 * 	 ==> 제품의 상태를 출력
 * 
 * toString() : String
 * 	 ==> 이 제품을 대표하는 문자열을 리턴
 * 	 ==> String.format() 으로 문자열 생성후 리턴
 * 
 * discount(double percentage) : int
 * 	 ==> 입력된 퍼센트만큼 할인된 각겨을 리턴
 * 
 * sell(int amount) : void
 * 	 ==> 매장에서 판매(출고)되어
 * 	 ==> 재고수량(quantity)이 amount 만큼 줄어들도록 만영
 * 	 ==> 재고수량이 0보다 작아질 수 없도록 제한
 * 	 ==>
 * 
 * buy(int amount) : void
 * 	 ==> 매장에 입고되어 재고수량(quantity)이
 * 	 ==> amount 만큼 반영합니다
 * 
 * ================================================
 * 작성시 주의 할 것.
 * 각 필드를 선언할 때, 필드에 대한 설명을 문서 주석으로 달것.
 * 각 생성자 선언할 때, 문서주석 달 것
 * 각 메소드 선언할 때, 메소드 설명을 문서주석으로 달것
 * 
 * 
 * @author Administrator
 *
 */
public class Product {
	
	// 1. 변수 선언 - 
	/**
	 * 제품의 변수
	 * @param pcode 제품 코드
	 * @param pname 제품 이름
	 * @param price 제품 가격
	 * @param quantity 제고 수량
	 */
	String pcode;
	String pname;
	int price;
	int quantity;
	
	// 2. 생성자
	public Product() {
	}
	public Product(String pcode) {
		this();
		this.pcode = pcode;
	}
	public Product(String pcode, String pname) {
		this(pcode);
		this.pname = pname;
	}	
	public Product(String pcode, String pname, int price) {
		this(pcode, pname);
		this.price = price;
	}
	/**
	 * 중복정의
	 * @param pcode 제품 코드
	 * @param pname 제품 이름
	 * @param price 제품 가격
	 * @param quantity 제고 수량
	 */
	public Product(String pcode, String pname, int price, int quantity) {
		this(pcode, pname, price);
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언
	// 제품을 대표하는 문자열
	public String toString() {
		return String.format("제품코드 : %s, 제품 명 : %s, 가격 : %d, 재고수량 : %d"
				,pcode, pname, price, quantity );
	}
	// 제품의 상태 출력
	public void print() {
		System.out.println(this);
	}
	
	// 입력된 퍼센트 만큼 할인된 가격을 리턴
	/**
	 * 할인 가격 
	 * @param percentage 할인 률
	 * @return 할인 후 가격
	 */
	public int discount(double percentage) {
		return (int) (price - price * percentage);
	}
	/**
	 * 판매 후 제품의 양
	 * @param amount 판매 량
	 */
	public void sell(int amount) {
		if(quantity < 0) {
			System.out.println("재고가 없습니다.");;
		}
		this.quantity -= amount;
	}
	/**
	 * 구매 후 수량
	 * @param amount 구매 량
	 */
	public void buy(int amount) {
		this.quantity += amount;
	}
	
}
