package com.ychs.demo;

public class Demo01 {
	//成员变量有初值 局部变量没有初始化值
	byte b = 12;
	byte b1 = 12;	
	byte b2 = 1;
	byte b3 = (byte) (b1 + b2);//强转 才行
	//声明 float 数字后加f  F
	
    int i;
    public static void main(String[]args) {
    	char c=65;
        char c2 = '\u0061'; // 使用 Unicode 码赋值
        System.out.println(c);
        System.out.println(c2);

    }
    
}
