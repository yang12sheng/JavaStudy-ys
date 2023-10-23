/**
 *  @version:
 */
package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日上午11:39:55 ;
 */
public class Test {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		Book b1= new Book("三国演义");
		List<People> peoples = new ArrayList<People>();
		peoples.add(new People("吕布"));
		peoples.add(new People("貂蝉"));
		b1.setPeoples(peoples);
		books.add(b1);
		Book b2= new Book("西游记");
		List<People> peoples2 = new ArrayList<People>();
		peoples2.add(new People("孙悟空"));
		peoples2.add(new People("唐僧"));
		b2.setPeoples(peoples2);
		books.add(b2);
		
		System.out.println(books);
	}
}
