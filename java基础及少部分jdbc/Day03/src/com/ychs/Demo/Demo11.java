/**
 *  @version:
 */
package com.ychs.Demo;

import java.util.Scanner;

/**
 * @author Ysheng
 * ����һ����    ����ӷ���
 *   @date: 2021��7��29������2:55:54 ;
 */
public class Demo11 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("������һ������");
			int num = 0;
			if (scan.hasNextInt()) {   // �ж��Ƿ�Ϊ����
				num = scan.nextInt();
				System.out.println("�������������������¼ӷ���");
				for (int i = 0; i <= num; i++) {
					System.out.println(i + "+" + (num - i) + "=" + num);
				}
			}else{
				System.out.println("��ʽ����������һ������");
				
			}
		}
	}

