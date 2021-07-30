package springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVC.dao.userDAO;
import springMVC.model.user;

@Service
public class userService 
{
	@Autowired
	private userDAO ud;
	public int createUser(user us)
	{
		return this.ud.saveUser(us);
	}
	
}
