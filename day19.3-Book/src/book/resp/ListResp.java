package book.resp;

import java.util.List;

import book.Book;

public class ListResp implements Response {
	/**
	 * 입력된 데이터가 전체 책 목록(배열)일때
	 */
	@Override
	public void response(Object object) {
		
		List<Book> books = (List<Book>)object;
		for (Book book: books) {
			System.out.println(book);
		}
		
	}

}
