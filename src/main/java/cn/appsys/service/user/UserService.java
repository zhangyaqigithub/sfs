package cn.appsys.service.user;

import cn.appsys.pojo.User;

public interface UserService {
	public User login(String devName,String devPassword);
}
