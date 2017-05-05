package org.fage.daoimpl;

import org.fage.dao.UserDao;



public class UserDaoImpl implements UserDao {

	@Override
	public void add(){
		System.out.println("增加用户成功！！");
	}
}
