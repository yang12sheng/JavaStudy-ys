/**
 *  @version:
 */
package demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Ysheng
 *���ɴ������Ĺ�����
 *   @date: 2021��8��17������2:29:11 ;
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
		//proxy  ���ɴ������
		//��һ������  �������
		return(Userdao)  Proxy.newProxyInstance(
				UserDaoProxyFactory.class.getClassLoader(),
				UserDaoImp.class.getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("��ʼ������");
						//ִ��Ŀ�귽��
						Object obj = method.invoke(userDao, args);
								System.out.println("end������");
						return obj;
					}
				});
	}
}
