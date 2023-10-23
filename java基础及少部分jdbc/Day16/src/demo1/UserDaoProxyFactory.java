/**
 *  @version:
 */
package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ysheng
 *生成代理对象的工厂类
 *   @date: 2021年8月17日下午2:29:11 ;
 */
public class UserDaoProxyFactory {
	private Userdao userDao;
	public Userdao getUserDao() {
		return userDao;
	}
	public void setUserDao(Userdao userDao) {
		this.userDao = userDao;
	}
	public Userdao getUserDaoProxy() {
		//proxy  生成代理对象
		//第一个参数  类加载器
		return(Userdao)  Proxy.newProxyInstance(
				UserDaoProxyFactory.class.getClassLoader(),
				UserDaoImp.class.getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始。。。");
						//执行目标方法
						Object obj = method.invoke(userDao, args);
								System.out.println("end。。。");
						return obj;
					}
				});
	}
}
