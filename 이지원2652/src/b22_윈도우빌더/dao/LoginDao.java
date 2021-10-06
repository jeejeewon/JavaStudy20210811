package b22_윈도우빌더.dao;

import b22_윈도우빌더.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password);	
	public String getLoginUserName(String id);
	public UserDto getUserDto(String id);

}
