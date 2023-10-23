/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月12日下午2:16:18 ;
 */
public class Demo06zi extends Demo06fu{

	
	@Override
public void f1() throws NullPointerException {
	// TODO Auto-generated method stub
	super.f1();
}
@Override
	public void f2() throws Exception {
		// TODO Auto-generated method stub
		super.f2();
	}
@Override
		public void f3() throws NullPointerException, ArrayIndexOutOfBoundsException {
			// TODO Auto-generated method stub
			super.f3();
		}
	@Override
			public void f4() throws ArrayIndexOutOfBoundsException {
				// TODO Auto-generated method stub
				super.f4();
			}
	@Override
	public void f6() {
		try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
