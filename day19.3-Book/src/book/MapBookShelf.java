package book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Map 구조로 구성된 책장 클래스
 * 
 * key 	: Book.sepuence 필드로 사용
 * value : Book 인스턴스 자체
 * @author Administrator
 *
 */
public class MapBookShelf implements BookShelf {

	// 1. 맴버변수 
	private Map<Integer, Book> books;
	
	// 2. 생성자
	// (1) 기본생성자
	public MapBookShelf() {
		books = new HashMap<>();
	}
	// (2) 매개변수 생성자
	public MapBookShelf(Map<Integer, Book> books) {
		this.books = books;
	}
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		
		if (!isExists(book)) {
			books.put(book.getSequence(), book);
			addCnt++;
		}
		return addCnt;
	}

	@Override
	public int set(Book book) {
		int setCnt = 0;
		
		if (isExists(book)) {
			books.put(book.getSequence(), book);
			setCnt++;
		}
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int reCnt = 0;
		
		if (isExists(book)) {
			books.remove(book.getSequence(), book);
		}
		return reCnt;
	}

	@Override
	public Book get(Book book) {
		Book getBook = null;
		
		if (isExists(book)) {
			getBook = books.get(book.getSequence());
		}
			
		return getBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// 필요시 private 메소드 추가
	Set keys = books.keySet();
	
	private boolean isExists(Book book) {
		return books.containsKey(book.getSequence());
	}
}
