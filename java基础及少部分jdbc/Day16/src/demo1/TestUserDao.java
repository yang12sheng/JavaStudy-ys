/**
 *  @version:
 */
package demo1;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月17日下午2:42:48 ;
 */
public class TestUserDao {
public static void main(String[] args) {
	Userdao userDao = new UserDaoImp();
	UserDaoProxyFactory factory = new UserDaoProxyFactory();
	factory.setUserDao(userDao);
	//获取代理对象
	Userdao proxy = factory.getUserDaoProxy();
	proxy.add();
	int  res = proxy.del();
	proxy.edit(3);
}
}
