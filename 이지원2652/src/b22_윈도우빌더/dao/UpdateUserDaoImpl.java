package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class UpdateUserDaoImpl implements UpdateUserDao {
	
	private DBConnectionMgr pool = null;
	
	public UpdateUserDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	
	@Override
	public boolean updatePassword(String id, String password) {		
		Connection con = null;
		PreparedStatement pstmt = null;	
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "update user_mst set user_password = ? where user_id = ?";		
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			pstmt.executeQuery();
			
			flag = true;
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return flag;
	}

}
