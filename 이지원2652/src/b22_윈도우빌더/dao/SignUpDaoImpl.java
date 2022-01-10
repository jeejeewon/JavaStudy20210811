package b22_윈도우빌더.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class SignUpDaoImpl implements SignUpDao {
	
	private DBConnectionMgr pool;
	
	public SignUpDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	@Override
	public int idCheck(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 2;
		
		try {
			con = pool.getConnection();
			sql = "select count(user_id) from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			flag = rs.getInt(1);
			
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
		return flag;
	}
	@Override
	public boolean signUp(String[] values) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		
		
		try {
			con = pool.getConnection();
			sql = "insert into user_mst values(?,?,?,?,?,?,now(), now())";
			pstmt = con.prepareStatement(sql);
			// pstmt.setString(인덱스번호, values[])
			pstmt.setString(1, values[0]);
			pstmt.setString(2, values[1]);
			// repwd 넣을 필요 없음(이미 확인 완료)
			pstmt.setString(3, values[3]);
			pstmt.setString(4, values[4]);
			pstmt.setString(5, values[5]);
			// 성별도 필요없음(combo box)
			pstmt.setInt(6, Integer.parseInt(values[7]));
			pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		
				
				
		return flag;
	}

}
