/**
 *  @version:
 */
package com.ychs.Demo;

/**
 * @author Ysheng
 *	traffic
 *   @date: 2021��7��29������10:36:11 ;
 */
public class Demo05 {
	public static void main (String[] args)  {
		TrafficDemo05 light =	TrafficDemo05.Red;   //ö������
		// switch ������ı��ʽ ֻ���� int�� String,enum ����
		//��char�� byte��short�����Զ�������int ���ͣ�Ҳ����ʹ�ã�
		//case �����ǳ������ʽ
		//default λ�ÿ������� caseǰ���ߺ�
		//breakʹ��Ҫ����Ҫ��
		switch(light) {
		case Red:System.out.println("���");
		default:System.out.println("���Ϸ�");
		case Green:System.out.println("�̵�");
		case Yellow:System.out.println("�Ƶ�");
		
		}
	}
}
