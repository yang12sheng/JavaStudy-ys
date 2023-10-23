/**
 *  @version:
 */
package demo;
import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月17日上午9:39:32 ;
 */
public class Demo02Conn {
public static void main(String[] args)throws ClassNotFoundException, SQLException  {
	//1.注册驱动
	Class.forName("com.mysql.jdbc.Driver");
//	2.获取数据库的连接
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test", 
			"root", 
			"123456");System.out.println(conn);
//3.通过connection 对象 获取语句的执行者
Statement stat = (Statement) conn.createStatement();
//4.编写 sql 语句
String sql ="select * from t_test";
//5.执行sql语句  查询用executeQuery   增删改用 executeUpdate(sql)
ResultSet rs = stat.executeQuery(sql);
//6. 遍历结果集
while(rs.next()) {
	System.out.println(rs.getInt("id")+",,,"+rs.getString("username"));
}
//7. 释放资源
rs.close();
stat.close();
conn.close();
}
@Test
public void addTest() {
	Connection conn = null;
	Statement stat = null;
		try {//1.注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			
//			2.获取数据库的连接
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
			System.out.println(conn);
			//3.编写 sql 语句
			String sql ="insert into t_test(id,username) value(null,'ccc')";
			//4. 获取语句的执行者
			 stat = (Statement) conn.createStatement();
			//5.执行sql语句  返回影响行数
		int res = stat.executeUpdate(sql);
		System.out.println(res);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stat.close();	conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}

}

	@Test
public void oracleTest() throws ClassNotFoundException, SQLException {
	//注册驱动
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//获取数据库连接
	Connection conn= DriverManager.getConnection("jdbc:oracle:");
		System.out.println(conn);
}
}
