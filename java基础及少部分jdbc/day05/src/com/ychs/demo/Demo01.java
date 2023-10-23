/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * main 方法
 *   @date: 2021年8月2日上午9:21:31 ;
 */
public class Demo01 {
	public static void main(String[] args) {
		Refrigerator ref = new Refrigerator(); //创建对象
		ref.open();
		ref.putElephant(new Elephant());
		ref.close();
	}
}
