package eraser.two;
/**
 * 칠판 지우개를 정의하는 클래스
 * --------------------------------
 * 칠판 지우개 속성 정의 => 맴버변수로 생성
 * 가로 : width  : double
 * 세로 : heigth : double
 * 높이 : depth	 : double
 * 겹   : layer  : int
 * 색상 : coler	 : String
 * ----------------------------------
 * 생성자 정의 : 중복 정의
 * 기본 생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * 						  : this 키워드를 사용하여 매개변수 생성자 정의
 * ----------------------------------
 * 기능 정의  : 메소드로 생성
 * 칠판지우기 : erase() : void : "칠반을 지웠습니다." 문자열 출력
 * 한겹씩 제거 : peel() : void : 현재 layer값에서 1 감소 
 *  							 layer가 0이 될때까지
 * 지우개 상태 출력 : print() : void
 * 					: 현재 지우개의 가로, 세로, 높이
 * 
 * @author Administrator
 *
 */
public class Eraser {
	
	// 1. 맴버변수 선언부
  /**지우개 가로길이 */
  double width;
  /**지우개 세로 높이*/
  double heigth;
  /**지우개 높이 길이*/
  double depth;
  /**지우개 레이어 겹*/
  int layer;
  /**지우개 색깔*/
  String coler;
  
  // 2. 생성자 선언부
  // (1) 기본 생성자
  /**
   * 지우개 클래스의 기본 생성자 
   * 각 맴버 변수플드를 타입의 기본값으로 초기화 진
   */
  Eraser(){
//  		width = 0.0;
//  		heigth = 0.0;
//  		depth = 0.0;
//  		layer = 0;
//  		coler = null;
  }
  
  // (2) 매개변수가 있는 생성자 :
  //				다섯개의 매개변수를 모두 받는다.
	Eraser(double Width, double Heigth, double Depth, int Layer, String Coler){
	 // alt + shift + a : 세로 편집 모드 토글
	 this.width = Width;
	 this.heigth = Heigth;
	 this.depth = Depth; 
	 this.layer = Layer;
	 this.coler = Coler; // <<== 리펙토링 이라 부름
	}
	// 3. 메소드 선언부
	// (1) erase
	public void erase(){
	System.out.println("칠판을 지웠습니다.");
	}

	// (2) peel
	/**
	* 남아있는 지우개 겹을 벗겨내는 메소드
	* 남아있는 layer를 체크하는 것
	*/
	public void peel(){
	if (layer >0 ){
		layer -=1;
	}else{
		System.out.println("더이상 layer가 없습니다/");
	}	
	}
	// (3) print()
	public void print(){
		System.out.printf("가로 = %4.2f 세로 = %4.2f 높이 = %4.2f 레이어 = %d 색상 = %s%n"
							,width , heigth, depth, layer, coler);
	}



}
