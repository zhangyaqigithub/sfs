package cn.appsys.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.appsys.dao.user.UserMapper;
import cn.appsys.pojo.User;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	
	public User login(String devName,String devPassword) {
		
		return userMapper.login(devName, devPassword);
	}
	
	
}
