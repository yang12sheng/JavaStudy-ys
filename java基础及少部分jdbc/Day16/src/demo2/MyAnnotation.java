/**
 *  @version:
 */
package demo2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/**
 * @author Ysheng
 *Ԫע�⣺4��ר�Ŷ���ע���ע�⣬�����Զ���ע��
 *@Retention �����ע�����������   source�� -- class��---running:
 *@Target ��ע�������� ���� �ֶΡ�����
 *   @date: 2021��8��17������3:26:19 ;
 */

public @interface MyAnnotation {
//������ ע������Ĳ������ƽ�value  ����ֵ��������int ����
	//���˵ע������ֻ��һ�����Ե�ʱ����ʹ��value  ����ʡ��
	//���Ը���Ĭ��ֵ
	public int name() default 1;
}
