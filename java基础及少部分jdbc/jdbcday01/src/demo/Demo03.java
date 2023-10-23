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
 *   @date: 2021��10��17������11:13:14 ;
 */
public class Demo03 {
@Test
public void queryUser() throws ClassNotFoundException, SQLException {
	String username = "admin";
	String password = "123456";

//1.ע������
Class.forName("com.mysql.jdbc.Driver");
// 2.��ȡ���ݿ�����
Connection conn = DriverManager.getConnection
("jdbc:mysql://localhost:3306/test","root","123456");
//3.��дsql���
String sql = "selsct*from t_user"+"where username = '"+username+"'and password='"+password+"'";
//4.��ȡ���ִ����
Statement stat = conn.createStatement();
//5.ִ��sql���
ResultSet rs= stat.executeQuery(sql);
//6.���������
while(rs.next()) {
	System.out.println(rs.getInt(1)+",,,"+rs.getInt(2)+",,,"+rs.getInt(3));
}
//7.�ͷ���Դ
rs.close();
}


@Test
public void queryUser() throws 	lassNotFoundException, SQLException {
	String username = "admin";
	String password = "123456";

//1.ע������
Class.forName("com.mysql.jdbc.Driver");
// 2.��ȡ���ݿ�����
Connection conn = DriverManager.getConnection
("jdbc:mysql://localhost:3306/test","root","123456");
//3.��дsql��� ?��ʾռλ��
String sql = "selsct*from t_user where username = ?and password=?";
//4.��ȡԤ�������ִ����
PreparedStatement ps = conn.prepareStatement(sql);
//���ò���
ps.setString(1,username);
ps.setString(2,password);
//5.ִ��sql���
ResultSet rs= ps.executeQuery();
//6.���������
while(rs.next()) {
	System.out.println(rs.getInt(1)+",,,"+rs.getInt(2)+",,,"+rs.getInt(3));
}
//7.�ͷ���Դ
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
