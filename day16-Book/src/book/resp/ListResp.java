package book.resp;

import book.Book;

public class ListResp implements Response {
	/**
	 * 입력된 데이터가 전체 책 목록(배열)일때
	 */
	@Override
	public void response(Object object) {
		
		Book[] books = (Book[])object;
		for (Book book: books) {
			System.out.println(book);
		}
		
	}

}
