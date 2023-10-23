/**
 *  @version:
 */
package demo2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/**
 * @author Ysheng
 *元注解：4个专门定义注解的注解，用来自定义注解
 *@Retention 定义该注解的生命周期   source《 -- class《---running:
 *@Target 该注解用于类 方法 字段。。。
 *   @date: 2021年8月17日下午3:26:19 ;
 */

public @interface MyAnnotation {
//定义体 注解里面的参数名称叫value  参数值的类型是int 类型
	//如果说注解里面只有一个属性的时候尽量使用value  可以省略
	//可以给定默认值
	public int name() default 1;
}
