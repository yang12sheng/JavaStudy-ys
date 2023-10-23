/**
 *  @version:
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.User;
import util.DBUtil;

/**
 * @author Ysheng
 *
 *   @date: 2021年10月17日下午2:15:54 ;
 */
public class UserDao {
public List<User> getUsers(User user,int page,int pagesize) throws ClassNotFoundException, SQLException{
	Connection conn =DBUtil.getConnection();
		//3.编写sql语句
		StringBuffer sql =  new StringBuffer("select * from t_user where 1=1 ");
				// where username like concat('%',?,'%') order by id desc limit 0,2";
		//页面已知的是什么？1个是page
	if(!"".equals(user.getUsername())) {
		sql.append(" and username like ? ");
	}
	sql.append(" order by id desc ");
	sql.append("limit ?,? ");
	//4.获取预编译语句的执行者
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	//5.设置参数
	int i =0;
	if(!"".equals(user.getUsername())) {
		ps.setString(++i,user.getUsername());
	}
	ps.setInt(++i,(page-1)*pagesize);
	ps.setInt(++i,pagesize);
	//6.执行sql语句
	ResultSet rs = ps.executeQuery();
	//7.遍历结果集
	List<User> list = new ArrayList<User>();
	while(rs.next()) {
		System.out.println(rs.getInt("id")+rs.getString("username"));
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setUsername(rs.getString("username"));
		u.setPassword(rs.getString("Password"));
		//u.setRealname(rs.getString("Realname"));
		list.add(u);
		
	}
	//释放资源
	DBUtil.close(conn, ps, rs);
	return list;
}
}
