/**
 *  @version:
 */
package com.ychs.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月13日下午2:50:07 ;
 */
public class Demo09 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream   oos = new ObjectOutputStream
				(new FileOutputStream("e:\\obj.object"));
		ObjectInputStream   ois = new ObjectInputStream
				(new FileInputStream("e:\\obj.object"));
		
		Person p = new Person();
		p.setName("ad");
		p.setAge(18);

		p.setNum2(18);
		oos.writeObject(p);
		
		Person p2 = (Person)ois.readObject();
		System.out.println(p2);
		System.out.println(p2.num);
		oos.close();
		ois.close();
	}
}
