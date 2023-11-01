package com.ychs.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 工具类一般方法都是静态方法  单例模式（这儿是懒汉式单例）
 * 懒汉式单例：（用的时候才创建出该对象）
 * 饿汉式单例：（该类一进内存，立马创建出 sqlSessionFactory该对象）
 */
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory;
    /**
     * 有问题的  同步代码块，把公共的资源加上同一把锁
     * 同步方法（在方法的声明上面加 synchronized）锁  SqlSessionFactoryUtil.class
     * @return
     */
//    public static synchronized SqlSessionFactory getSqlSessionFactory(){
    public static SqlSessionFactory getSqlSessionFactory(){
        //锁对象
        synchronized(SqlSessionFactoryUtil.class){
            if(sqlSessionFactory==null){
                String resource = "SqlMapConfig.xml";
                InputStream inputStream = null;
                try {
                    inputStream = Resources.getResourceAsStream(resource);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sqlSessionFactory;
    }

}
