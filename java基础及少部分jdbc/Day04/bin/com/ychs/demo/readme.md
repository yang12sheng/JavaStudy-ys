###1、swith case
语法格式：swith(表达式){
	case 常量值：语句；break;
	default:语句
}
注意：1、表达式：int---byte,short,char/String/枚举
	 2、case 是常量，不能重复
	 3、default 语句可以和case交换顺序
	 4、break 是按需使用
###2、循环结构
 	for(;;){}    第二个表达式必须是boolean 型 第一个和第三个表达式可以是多个  中间用逗号分开，大括号里的定义变量有作用范围
 	break：跳出内层循环 
 	do{}while()  最少执行一次
###3.equals 和==
 	== 比较普通类型   == 比较对象 比较的是地址
 	比较对象类型用equals     但是equals ，默认比较还是地址，因为调用的是object 里的equals 如果想比较内容的话需要重写equals