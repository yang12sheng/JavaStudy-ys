/**
 *  @version:
 */
package com.ychs.Demo;
	import java.util.Scanner;
/**
 * @author Ysheng
 *�����·��ж��ǵڼ������ȣ���ʲô���ڡ�
 *   @date: 2021��7��29������10:57:38 ;
 */
public class Demo06 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("�������·ݣ�");
			int month = scan.nextInt();
			switch (month) {
			    case 3:
			    case 4:
			    case 5:
			    	   System.out.println("��һ�������Ǵ���");
			    	   break;
			    case 6:
			    case 7:
			    case 8:
			    	   System.out.println("�ڶ����������ļ�");
			    	   break;
			    case 9:
			    case 10:
			    case 11:
			    	   System.out.println("�������������＾");
			    	   break;
			    case 12:
			    case 1:
			    case 2 :
			    	    System.out.println("���ĸ������Ƕ���");
			    	    break;
			    default:
			    	   System.out.println("��������޷��ж�");
	            break;
			}

		}

	}


