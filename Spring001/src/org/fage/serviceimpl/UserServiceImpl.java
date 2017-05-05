package org.fage.serviceimpl;

import org.fage.dao.UserDao;
import org.fage.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//增加用户
	/* (non-Javadoc)
	 * @see org.fage.serviceimpl.UserService#addUser()
	 */
	public void addUser(){
		userDao.add();
	}
	
	public void show(){
		System.out.println(message);
	}
	
}
