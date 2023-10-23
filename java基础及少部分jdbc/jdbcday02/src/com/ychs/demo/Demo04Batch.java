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
 *   @date: 2021��10��24������11:02:57 ;
 */
public class Demo04Batch {
public static void main(String[] args) {
	Connection conn = DBUtiil2.getConnection();
	conn.setAutoCommit(false); //�ֶ��ύ
	String sql = "insert into t_test values(null,'ddd',0)";
	String sql2 = "insert into t_test values(null,'eee',0)";
	//��ȡ����ִ����
	Statement stat=conn.createStatement();
	//��sql �����ӵ� ��������
	stat.addBatch(sql);
	stat.addBatch(sql2);
	//ִ��������
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
	//������
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
