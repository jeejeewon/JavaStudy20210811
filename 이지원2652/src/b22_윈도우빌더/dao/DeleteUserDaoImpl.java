package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DBConnectionMgr;

public class DeleteUserDaoImpl implements DeleteUSerDao {
	private DBConnectionMgr pool;
	
	public DeleteUserDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public boolean deleteUser(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;		
		
		try {
			con = pool.getConnection();
			sql = "delete from user_mst where user_id =?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			flag = true;
			
		} catch (Exception e) {					
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
		return flag;
	}

}
