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
 *   @date: 2021��10��17������2:15:54 ;
 */
public class UserDao {
public List<User> getUsers(User user,int page,int pagesize) throws ClassNotFoundException, SQLException{
	Connection conn =DBUtil.getConnection();
		//3.��дsql���
		StringBuffer sql =  new StringBuffer("select * from t_user where 1=1 ");
				// where username like concat('%',?,'%') order by id desc limit 0,2";
		//ҳ����֪����ʲô��1����page
	if(!"".equals(user.getUsername())) {
		sql.append(" and username like ? ");
	}
	sql.append(" order by id desc ");
	sql.append("limit ?,? ");
	//4.��ȡԤ��������ִ����
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	//5.���ò���
	int i =0;
	if(!"".equals(user.getUsername())) {
		ps.setString(++i,user.getUsername());
	}
	ps.setInt(++i,(page-1)*pagesize);
	ps.setInt(++i,pagesize);
	//6.ִ��sql���
	ResultSet rs = ps.executeQuery();
	//7.���������
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
	//�ͷ���Դ
	DBUtil.close(conn, ps, rs);
	return list;
}
}
