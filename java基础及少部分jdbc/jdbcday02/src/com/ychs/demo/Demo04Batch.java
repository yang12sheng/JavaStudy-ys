/**
 *  @version:
 */
package com.ychs.demo;

import java.sql.Connection;

import com.mysql.jdbc.Statement;
import com.ychs.util.DBUtiil2;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月24日上午11:02:57 ;
 */
public class Demo04Batch {
public static void main(String[] args) {
	Connection conn = DBUtiil2.getConnection();
	conn.setAutoCommit(false); //手动提交
	String sql = "insert into t_test values(null,'ddd',0)";
	String sql2 = "insert into t_test values(null,'eee',0)";
	//获取语句的执行者
	Statement stat=conn.createStatement();
	//把sql 语句添加到 批处理中
	stat.addBatch(sql);
	stat.addBatch(sql2);
	//执行批处理
	int[] res = stat.executeBatch();
	boolean flag = true;
	for(int i:res) {
		if(i<=0) {
			flag =false;
			break;
		}
	}
	if(flag) {
		conn.commit();
		
	}else {
		conn.rollback();
		
	}
	//处理结果
	//[0 1][1 0]
//	for(int i :res) {
//		if(i>0) {
//			conn.commit();
//		}else {
//			conn.rollback();
//		}
//	}
		
		finally {
			conn.clses();
			res.clses();
		}
}
}
