/**
 *  @version:
 */
package demo2;

import java.lang.reflect.Field;

/**
 * @author Ysheng
 *
 *   @date: 2021��8��17������3:51:24 ;
 */
public class Test02 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		User u = new User();
		Field[] fields = User.class.getDeclaredFields();
		for (Field field : fields) {
			//�жϸ��ֶ��Ƿ�ע���ʶ����
			if(field.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
				System.out.println(annotation.name());//��ȡ������ֵ
				System.out.println(field.getName());   //��ȡ������
				field.setAccessible(true);
				field.set(u, annotation.name());
			}
		}
		System.out.println(u);
		
	}
}





