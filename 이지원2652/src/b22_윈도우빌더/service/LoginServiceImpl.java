package b22_윈도우빌더.service;

import b22_윈도우빌더.dao.LoginDao;
import b22_윈도우빌더.dao.LoginDaoImpl;
import b22_윈도우빌더.dto.UserDto;

/*
 * MVC Model
 * Model: DB 또는 다른 테이터를 담을 수 있는 영역(DAO, DTO, VO, Bean)
 * View: 사용자가 보는 화면
 * Controller: 사용자에게 어떤 View를 보여줄건지만 컨트롤함
 * 
 * */

public class LoginServiceImpl implements LoginService {
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		 loginDao = new LoginDaoImpl();	
	}
	
	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;
		if(id.length() == 0) {
			flag = 3;			
		} else if (pwd.length() == 0) {
			flag = 4;
		} else {
			flag = loginLogic(id, pwd);
		}	
		return flag;
	}
	
	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
	}
	
	@Override
	public UserDto getUserDto(String id) {
		return loginDao.getUserDto(id);
	}

}
