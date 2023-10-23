###1.线程
 线程类：thread 
 有两种方式
 一：1. A  extends Thread
 2. 创建线程对象
 3.启动线程
 二：1.A implements Runnable
 2. 创建线程对象 Thread t = new Thread( new A());
 3.启动线程
 区别：把线程的任务和线程对象区分开  降低代码耦合度
 可以把线程任务看成公共的资源
 避免了单继承
 ###2.线程的声明周期、
 开始  ---> 就绪    --->运行 --->   阻塞  
                 		  结束
 ###3.多线程
 同步锁    synchronize 
 1. 用在方法的声明上   this
 2.代码块（this，static 变量，.class）
 3.static 方法 （当前类的  .class 文件）
 
 
 
 