package b22_윈도우빌더.service;

import b22_윈도우빌더.dto.UserDto;

public interface LoginService {
	public int loginTextCheck(String id, String pwd);
	public int loginLogic(String id, String pwd);
	public UserDto getUserDto(String id);

}
