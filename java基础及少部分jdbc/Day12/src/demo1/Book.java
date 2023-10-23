/**
 *  @version:
 */
package demo1;

import java.util.List;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午11:33:17 ;
 */
public class Book {
	private String bookname;
	private List<People> peoples; 
	public List<People> getPeoples() {
		return peoples;
	}

	public Book(String bookname, List<People> peoples) {
		super();
		this.bookname = bookname;
		this.peoples = peoples;
	}

	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}

	public Book(String bookname) {
		super();
		this.bookname = bookname;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", peoples=" + peoples + "]";
	}

	
	
}
