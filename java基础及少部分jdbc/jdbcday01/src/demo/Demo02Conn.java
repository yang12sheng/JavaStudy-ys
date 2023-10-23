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
 *   @date: 2021��10��17������9:39:32 ;
 */
public class Demo02Conn {
public static void main(String[] args)throws ClassNotFoundException, SQLException  {
	//1.ע������
	Class.forName("com.mysql.jdbc.Driver");
//	2.��ȡ���ݿ������
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/test", 
			"root", 
			"123456");System.out.println(conn);
//3.ͨ��connection ���� ��ȡ����ִ����
Statement stat = (Statement) conn.createStatement();
//4.��д sql ���
String sql ="select * from t_test";
//5.ִ��sql���  ��ѯ��executeQuery   ��ɾ���� executeUpdate(sql)
ResultSet rs = stat.executeQuery(sql);
//6. ���������
while(rs.next()) {
	System.out.println(rs.getInt("id")+",,,"+rs.getString("username"));
}
//7. �ͷ���Դ
rs.close();
stat.close();
conn.close();
}
@Test
public void addTest() {
	Connection conn = null;
	Statement stat = null;
		try {//1.ע������
			Class.forName("com.mysql.jdbc.Driver");
			
//			2.��ȡ���ݿ������
			 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
			System.out.println(conn);
			//3.��д sql ���
			String sql ="insert into t_test(id,username) value(null,'ccc')";
			//4. ��ȡ����ִ����
			 stat = (Statement) conn.createStatement();
			//5.ִ��sql���  ����Ӱ������
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
	//ע������
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//��ȡ���ݿ�����
	Connection conn= DriverManager.getConnection("jdbc:oracle:");
		System.out.println(conn);
}
}
