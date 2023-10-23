/**
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2020</p>  
 * <p>Company: yckj</p>
 * @version 1.0   
 */
package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Demo02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.注册驱动		
		Class.forName("com.mysql.jdbc.Driver");
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		2.获取数据库的连接
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test01", 
				"root", 
				"123456");

		System.out.println(conn);
		//3銆佺紪鍐檚ql 璇彞
		String sql = "insert into t_class(cno,cname) values(11,'11鐝�')";
//		String sql = "insert into t_class values(null,11,'11鐝�')";
		//4銆佽幏鍙栬鍙ョ殑鎵ц鑰�
		Statement stat = conn.createStatement();
		//5銆佹墽琛宻ql璇彞锛屽浜庡鍒犳敼 杩斿洖褰卞搷鐨勮鏁�
		int res = stat.executeUpdate(sql);
		if(res>0) {
			System.out.println("娣诲姞鎴愬姛");
		}else {
			System.out.println("fail.....");
		}
		//6銆侀噴鏀捐祫婧愶紝鍏抽棴鏁版嵁搴撶殑杩炴帴
		stat.close();
		conn.close();
		
	}
	
	/**
	 * 鏌ヨ鐝骇鐨勬墍鏈変俊鎭�
	 */
	@Test
	public void queryClass() {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			//1銆佹敞鍐岄┍鍔�
			Class.forName("com.mysql.jdbc.Driver");
			//2銆佽幏鍙栨暟鎹簱杩炴帴   1銆乽rl鍦板潃     2銆佺敤鎴峰悕   3銆佹暟鎹簱瀵嗙爜
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test01",
					"root",
					"123456");
			//3銆佺紪鍐檚ql
			String sql = "select * from t_class";
			//4銆佽幏鍙栬鍙ョ殑鎵ц鑰�
			stat = conn.createStatement();
			//5銆佹墽琛宻ql璇彞锛岃繑鍥炵粨鏋滈泦
			rs = stat.executeQuery(sql);
			//6銆侀亶鍘嗙粨鏋滈泦
			while(rs.next()) {
				System.out.println(rs.getInt(1)+","+rs.getInt("cno")+
						","+rs.getString("cname"));
			}
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//7銆侀噴鏀捐祫婧�
			try {
				rs.close();
				stat.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
	
}















