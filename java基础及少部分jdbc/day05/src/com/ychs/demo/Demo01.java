/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * main ����
 *   @date: 2021��8��2������9:21:31 ;
 */
public class Demo01 {
	public static void main(String[] args) {
		Refrigerator ref = new Refrigerator(); //��������
		ref.open();
		ref.putElephant(new Elephant());
		ref.close();
	}
}
