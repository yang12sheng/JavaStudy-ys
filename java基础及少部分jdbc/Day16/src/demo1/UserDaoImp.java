/**
 *  @version:
 */
package demo1;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月17日下午2:22:08 ;
 */
public class UserDaoImp implements Userdao{

	@Override
	public void add() {
	System.out.println("add..");
		
	}

	@Override
	public int del() {
		System.out.println("del..");
		return 1;
	}

	@Override
	public void edit(int i) {
		System.out.println("edit.."+i);
		
	}

}
