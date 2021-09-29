package b22_윈도우빌더.dao;

public interface LoginDao {
	public int login(String id, String password);
	public String getLoginUserName(String id);

}
