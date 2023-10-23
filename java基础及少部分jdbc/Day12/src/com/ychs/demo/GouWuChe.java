/**
 *  @version:
 */
package com.ychs.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日下午2:44:13 ;
 */
public class GouWuChe {
	public static void main(String[] args) {
		Map<Book,Integer> map = new HashMap<Book,Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("输入1 加购物车   2 退出       3 减书");
			int flag = sc.nextInt();
			if(flag==1) {
				System.out.print("输入书名 ");
				String bookname=sc.next();
				System.out.print("输入 价格");
				double price = sc.nextDouble();
				Book book = new Book(bookname,price);
				if(map.containsKey(book)) {
					map.put(book,map.get(book)+1);
				}else {
					map.put(book,1);
				}
				
			}else if (flag ==2) {
				break;
			}
			else if (flag ==3) {        //减书
				System.out.print("输入书名 ");
				String bookname=sc.next();
				System.out.print("输入 价格");
				double price = sc.nextDouble();
				Book book = new Book(bookname,price);
				
				Integer num =map.get(book);    //map 里有多少书
				num--;
				if(num==0)
				{
					map.remove(book);
				}
				else {
					map.put(book,num);
			
					
				break;
				}
			}
		}
		//遍历购物车
		Set<Entry<Book, Integer>> entrySet = map.entrySet();
		for(Entry<Book, Integer> entry:entrySet) {
			System.out.println(entry.getKey().getBookName()+"..."
		+entry.getKey().getPrice()+"..."+entry.getValue());
			
		}
	}
}
