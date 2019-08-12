package book.resp;

import book.Book;

public class SingleResp implements Response{

	@Override
	public void response(Object object) {
		
		/**
		 * 입력된 한 건의 데이터(object) 가 
		 * Book 한권의 정보일때 그것을 출력
		 */
		Book book = (Book)object;
		System.out.println(book);		
		
	}

}
