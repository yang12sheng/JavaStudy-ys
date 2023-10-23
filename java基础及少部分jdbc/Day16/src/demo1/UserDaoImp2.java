/**
 *  @version:
 */
package demo1;

/**
 * @author Ysheng
 *
 *   @date: 2021定8埖17晩和怜2:23:36 ;
 */
public class UserDaoImp2 implements Userdao{

	@Override
	public void add() {
		System.out.println("start。。。");
		
	System.out.println("add..");
	System.out.println("end。。。");
		
	}

	@Override
	public int del() {		
		System.out.println("start。。。");
		System.out.println("del..");	
		System.out.println("end。。。");
		return 1;
	}

	@Override
	public void edit(int i) {		
		System.out.println("start。。。");
		System.out.println("edit.."+i);	
		System.out.println("end。。。");
		
	}
	
}
