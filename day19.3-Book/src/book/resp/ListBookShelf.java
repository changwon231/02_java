package book.resp;

import java.util.ArrayList;
import java.util.List;

import book.Book;
import book.BookShelf;

public class ListBookShelf implements BookShelf {

	// 1. 맴버변수
	private List<Book> books;
	
	// 2. 생성자
	// (1) 기본생성자
	public ListBookShelf() {
		books = new ArrayList<>();
	}
	
	// (2) 매개변수 생성자
	public ListBookShelf(List<Book> books) {
		System.out.println("ListBookShelf 입니다.");
		this.books = books;
	}
	
	
	@Override
	public int add(Book book) {
		int addCnt = 0;
		if (!isExists(book)) {
			books.add(book);
			addCnt++;
		}
		return addCnt;
	}

	@Override
	public int set(Book book) {
		int setCnt = 0;
		
		if (isExists(book)) {
			int index = findBookIndex(book);
			books.set(index, book);
			setCnt++;
		}
		
		return setCnt;
	}

	@Override
	public int remove(Book book) {
		int rmCnt = 0;
		
		if(isExists(book)) {
			if (books.remove(book)) {
				rmCnt++;
			}
		}
		
		return rmCnt;
	}

	@Override
	public Book get(Book book) {
		Book findBook = null;
		
		int index = findBookIndex(book);
		if(index > -1) {
			findBook = books.get(index);
		}
		
		
		
		return findBook;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 매개변수로 입력된 book 이 
	 * 이미 리스트에 존재하는지 여부를 검사하는 테스트
	 * @param book
	 * @return
	 */
	private boolean isExists(Book book) {
		boolean exists = false;
		
		for (Book findBook: books) {
			if (findBook.equals(book)) {
				exists = true;
				break;
			}
		}
		
		
		return exists;
	}
	
	private int findBookIndex(Book book) {
		int index = 0;
	
		for (int idx = 0; idx < books.size(); idx++) {
			if (books.get(idx).equals(book)) {
				index = idx;
			}
		}
		return index;
	}
}

	