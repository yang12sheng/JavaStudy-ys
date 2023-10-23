package com.ychs.demo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.ychs.util.DBUtiil2;

public class Demo05PreBatch {
public static void main(String[] args) {
	Connection conn = DBUtiil2.getConnection();
	conn.setAutoCommit(false);
	String sql ="insert into t_test values(null,?,?)";
	PreparedStatement ps = conn.clientPrepareStatement(sql);
	
	ps.setString(1, "zs");
	ps.setInt(2, 100);
	ps.setBatch();
}
}
