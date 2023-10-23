/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>  
 * <p>Company: yckj</p>
 * @version 1.0   
 */
package com.ychs.Demo;

import java.util.Scanner;

/**	
 * @author ysheng
 * @date 2021年7.29
 */
public class Demo14 {
	public static void main(String[] args) {
		User u = new User();
		u.setUsername("admin");
		u.setPassword("123456");
			User u2 = new User();
			int i;
		for( i=0; i<3;i++) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("输入用户名");
		String username = sc.nextLine();
		System.out.println("输入密码");
		String password = sc.nextLine();
		u2.setUsername(username);
		u2.setPassword(password);
		
		if(u.equals(u2)) {
			System.out.println("登陆成功");break;
		}else {
			System.out.println("登陆失败"+"还有"+(2-i)+"次机会");
		}
		
		}
	}
}






