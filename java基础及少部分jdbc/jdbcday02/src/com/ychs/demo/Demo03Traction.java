/**
 *  @version:
 */
package com.ychs.demo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ychs.util.DBUtiil2;

/**
 * @author Ysheng
 *
 *   @date: 2021��10��24������10:29:57 ;
 */
public class Demo03Traction {
	public static void main(String[] args) {
		PreparedStatement ps= null;
		Connection conn = null;
		try {//1.��ȡ���ݿ�����
		 conn =DBUtiil2.getConnection();
		 conn.setAutoCommit(false);
		//2.��дsql���
		String sql = "update t_test set money = 4000 where id = 1";
		//3.��ȡԤ��������ִ����
			 ps=conn.prepareStatement(sql);
			//4.ִ��sql���
			int res = ps.executeUpdate();
			//�������쳣
			int i = 1/0;
			String sql2="update t_test set money = 1000 where id = 2";
		 ps=conn.prepareStatement(sql2);
		int res2= ps.executeUpdate();
		System.out.println(res+res2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtiil2.close(conn,ps,null);
		}
	 public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
		 if(rs!=null) {
			 try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 if(ps!=null) {
			 try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }	 if(conn!=null) {
			 try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}}
