/**
 *  @version:
 */
package com.ychs.demo;

/**
 * @author Ysheng
 * ���Ժ���Ϊ
 *   @date: 2021��8��2������9:38:04 ;
 */
public class Person {
	//����һ�����ó�˽�е�  �������ǵ�ǰ�Լ�����������ܷ���
	private String idenfied;
	private String name;
	private int age;
	private boolean flag;
	private char sex ;
	//���췽�� ��д������� jvm �ṩ�� Ĭ���޲� �Ĺ��췽��
	//����ṩ�˹��췽��java ����� �����ṩ�޲εĹ��췽�� ����Ҫ�Լ��ṩ
	//����Ա���� ��ֵ �����ַ�����һ����set  ��ֵ  ���Ϻã�����һ�� ���췽����ֵ ��
	//���췽���� ����������
	//���� ��1.�������� 2. ��ʼ����Ա����
	public Person() {
		
	}
  	public Person(int age,char sex) {
		this.age=age;
		this.sex=sex;
	}
  	// alt  shift s
	public Person(String idenfied, String name, int age, boolean flag, char sex) {
		super();
		this.idenfied = idenfied;
		this.name = name;
		this.age = age;
		this.flag = flag;
		this.sex = sex;
	}
	public void show() {
		System.out.println("���֤�� " +idenfied+"������"+name+"����"+age+"���Ա�"+sex+",,"+flag);
	}
	public void setIdenfied(String idenfied) {
		//d��ǰ�������˼
		this.idenfied=idenfied;
	}
	public void setName(String name) {
		//d��ǰ�������˼
		this.name=name;
	}
	public void setAge(int age1) {
		//d��ǰ�������˼
		this.age=age1;
	}
}
