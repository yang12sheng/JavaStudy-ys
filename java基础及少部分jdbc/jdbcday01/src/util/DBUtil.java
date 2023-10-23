/**
 *  @version:
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月17日下午4:15:12 ;
 */
public class DBUtil {
 public static Connection getConnection() {
	 Connection conn =null;
			try {//1.注册驱动	
				Class.forName("com.mysql.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			2.获取数据库的连接
		 conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/test01", 
						"root", 
						"123456");

				System.out.println(conn);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
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
}
