/**
 *  @version:
 */
package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��11������11:39:55 ;
 */
public class Test {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		Book b1= new Book("��������");
		List<People> peoples = new ArrayList<People>();
		peoples.add(new People("����"));
		peoples.add(new People("����"));
		b1.setPeoples(peoples);
		books.add(b1);
		Book b2= new Book("���μ�");
		List<People> peoples2 = new ArrayList<People>();
		peoples2.add(new People("�����"));
		peoples2.add(new People("��ɮ"));
		b2.setPeoples(peoples2);
		books.add(b2);
		
		System.out.println(books);
	}
}
