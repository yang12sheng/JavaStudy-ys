/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *1.异常处理：  2种       1.try  {可能发生异常的代码}catch（）{捕获到异常进行处理}finally{释放资源} 方式进行处理
 *                 2.抛出异常， 可以程序抛出     可以人工手动抛出  
 *                 对于抛出 运行时期异常， 只有运行的时候才能发现，
 *            
 *            对于抛出编译时期的异常（Exception）需要在方法的声明上告诉父类 代码可能发生异常   你 给我处理去
 *                    
 *   @date: 2021年8月12日上午11:31:59 ;
 */
public class Demo06 {
public static void main(String[] args) throws Exception {
	try {
		throw new Exception();
	} finally {
		// TODO Auto-generated catch block
		System.out.println("1212");
	}
}
}
