package demo.service;

import java.util.List;

import com.github.pagehelper.Page;

import demo.entity.User;


public interface UserService {

	public User getUser(String id);
	
	public User getUserByUserName(String username);
	
	public List<User> getAllUser();
	
	public void addUser(User user);
	
	public boolean delUser(String id);
	
	public boolean updateUser(User user);
	
	public Page<User> getPagedUser(int page,int size);
}
