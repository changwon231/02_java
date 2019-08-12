package book;

import book.resp.ListResp;
import book.resp.MessageResp;
import book.resp.Response;
import book.resp.SingleResp;

/**
 * 책장(BookShelf)을 사용하는 북 매니저를 나타내는 클래스
 * ------------------------------------------------------
 * 서점의 북 매니저는 
 * 
 * 1. 책을 책장에 꼽거나(추가하거나)
 * 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나
 * 3. 어떤 책의 수량이나 가격정보를 수정하거나 
 * 4. 더 이상 판매하지 않을 책을 폐기 하고
 * 5. 이 서점에서 파는 책 목록을 안내
 * 
 * 하는 등에 작업을 진행합니다.
 * --------------------------------------------------------
 * 전제조건 : 북 메니저는 책장이 어디있는지, 무었인지 알고 있어야 한다.
 *   ======================================================
 * 1. 캡슐화 적용 : 맴버변수는 private
 * 					생성자, 메소드 public
 *   ======================================================
 * @author Administrator
 *
 */
public class BookManager {
	// 1. 맴버변수 선언부
	private BookShelf bookShelf;
	// 메니저가 어떤 작엡 후에 어떻게 응답해야 할 지를 나타내는 타입
	private Response response;
	// 2. 생성자 선언부
	// (1) 기본 생성자 명시
	public BookManager(){
		bookShelf = new ArrayBookShelf();
	}
	// (2) 매개변수 생성자 작성
	public BookManager(BookShelf bookShelf){
		this.bookShelf = bookShelf;
	}
	
	// 3. 메소드 선언
	// (1) 매니저는 책 한권을 책장에 가져가서 새로 꼽을 수 있다.
	public void add(Book book) {
		int addCnt = this.bookShelf.add(book);
		String message;
		response = new MessageResp();
		if (addCnt > 0) {
			message = String.format(book.toString() + "%d 건이 추가되었습니다." ,addCnt);
		} else {
			message = String.format(book.toString() + "가 이미 존재합니다.");
		}
		response.response(message);
	}
	
	// (2) 매니저는 책장에 가서 더 이상 팔지 않을
	// 폐기할 책을 제거할 수 있다. 
	public void remove(Book book) {
		int rmCnt = this.bookShelf.remove(book); 
		
		String message;
		response = new MessageResp();
		
		if (rmCnt > 0) {
			message = String.format(book.toString() 
					+ "%d 건이 삭제되었습니다.", rmCnt);
		} else {
			message = "삭제하려는 도서가 존재하지 않습니다.";
		}
		
		response.response(message);
	}
	
	// (3) 매니저는 책장에서 찾아달라고 고객이 요청한
	//     책 한개를 가지고 올 수 있다.
	public void get(Book book) {
		Book findBook = this.bookShelf.get(book);
		
		if (findBook != null) {
			// 책 한건의 정보를 출력하는 기능을 담당하는 응답 타입인
			// SingleResp 타입으로 응답 인스턴스를 생성하고
			response = new SingleResp();
			//  바로 찾은 findBook 객체를 넘겨 찾은 책의 정보를 출력한다.
			response.response(findBook);
		} else {
			// 찾은 책이 없는 경우는 찾는 도서가 없습니다. 라는 메시지를 처리할 수 있어야 하므로
			// 메시지를 처리할 수 있는 MessageResp 타입으로
			// 응답 인스턴스를 생성하고 
			response = new MessageResp();
			// 이렇게 생성한 response 객체에 찾기 실패 메시지를 출력하도록 한다.
			response.response("찾는 도서가 존재하지 않습니다.");
		}
	}
	
	// (4) 매니저는 책장에 가서 판매 가격 등 
	//	   책의 정보를 수정할 수 있다.
	public void set(Book book) {
		int setCnt = this.bookShelf.set(book);
		
		String message;
		response = new MessageResp(); 
		if (setCnt > 0) {
			message = String.format(book.toString() 
					+ " %d 건을 수정하였습니다.", setCnt);
		} else {
			message = "수정하려는 도서가 존재하지 않습니다.";
		}
		
		response.response(message);
	}
	
	// (5) 매니저는 서점에서 판매되고 있는 책의 목록을
	//	   보여줄 수 있다. 조회할 수 있다.
	public void getAllBooks() {
		response = new ListResp();
		response.response(bookShelf.getAllBooks());
	}
}
