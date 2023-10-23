/**
 *  @version:
 */
package demo2;

import java.lang.reflect.Field;

/**
 * @author Ysheng
 *
 *   @date: 2021年8月17日下午3:51:24 ;
 */
public class Test02 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		User u = new User();
		Field[] fields = User.class.getDeclaredFields();
		for (Field field : fields) {
			//判断该字段是否被注解标识过了
			if(field.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
				System.out.println(annotation.name());//获取到的是值
				System.out.println(field.getName());   //获取属性名
				field.setAccessible(true);
				field.set(u, annotation.name());
			}
		}
		System.out.println(u);
		
	}
}





