package com.ychs.util;

import java.sql.Connection;
import java.util.LinkedList;

public class MyDataSource {
    //定义的池子   存放的是连接 Connection
    private static LinkedList<Connection> pool = new LinkedList<>();
    static{
        for(int i=0;i<3;i++){
            pool.addLast(DBUtil.getConnection());
        }
    }
    public static Connection getConnection(){
        if(pool.isEmpty()){
            for(int i=0;i<3;i++){
                pool.addLast(DBUtil.getConnection());
            }
        }
        return pool.removeFirst();
    }
    public static void backConnection(Connection conn){
        pool.addLast(conn);
    }

    public static void main(String[] args) {
        System.out.println(MyDataSource.getConnection());
    }

}
