package com.nichijou.springmvcdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.nichijou.springmvcdemo.model.User;

@Repository
public interface IUserDao {

	public List<User> getAllUser();

	public void add(User user);
	
	//������paramָ�����������Ϊ��������
	public User getUserById(@Param("id")int id);

	public void update(User newuser);
	
	public void delete(int id);


}
