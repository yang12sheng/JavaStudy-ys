/**
 *  @version:
 */
package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;

import bean.User;
import dao.UserDao;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月17日上午11:13:14 ;
 */
public class Demo03 {
@Test
public void queryUser() throws ClassNotFoundException, SQLException {
	String username = "admin";
	String password = "123456";

//1.注册驱动
Class.forName("com.mysql.jdbc.Driver");
// 2.获取数据库连接
Connection conn = DriverManager.getConnection
("jdbc:mysql://localhost:3306/test","root","123456");
//3.编写sql语句
String sql = "selsct*from t_user"+"where username = '"+username+"'and password='"+password+"'";
//4.获取语句执行者
Statement stat = conn.createStatement();
//5.执行sql语句
ResultSet rs= stat.executeQuery(sql);
//6.遍历结果集
while(rs.next()) {
	System.out.println(rs.getInt(1)+",,,"+rs.getInt(2)+",,,"+rs.getInt(3));
}
//7.释放资源
rs.close();
}


@Test
public void queryUser() throws 	lassNotFoundException, SQLException {
	String username = "admin";
	String password = "123456";

//1.注册驱动
Class.forName("com.mysql.jdbc.Driver");
// 2.获取数据库连接
Connection conn = DriverManager.getConnection
("jdbc:mysql://localhost:3306/test","root","123456");
//3.编写sql语句 ?表示占位符
String sql = "selsct*from t_user where username = ?and password=?";
//4.获取预编译语句执行者
PreparedStatement ps = conn.prepareStatement(sql);
//设置参数
ps.setString(1,username);
ps.setString(2,password);
//5.执行sql语句
ResultSet rs= ps.executeQuery();
//6.遍历结果集
while(rs.next()) {
	System.out.println(rs.getInt(1)+",,,"+rs.getInt(2)+",,,"+rs.getInt(3));
}
//7.释放资源
rs.close();
ps.close();
conn.close();
}

@Test
public void getUsers() throws ClassNotFoundException, SQLException {
	UserDao userdao = new UserDao();
	User user = new User();
	user.setUsername("a");
List<User> list = userdao.getUsers(user, 1, 2);
System.out.println(list);
	
	
	
	
}



}
