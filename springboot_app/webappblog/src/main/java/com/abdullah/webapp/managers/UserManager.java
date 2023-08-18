package com.abdullah.webapp.managers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.webapp.IRepositoriesDal.IUserDal;
import com.abdullah.webapp.models.User;

@Service
public class UserManager extends GenericManager<User> {
	private IUserDal iUserDal;
	@Autowired
    public UserManager(IUserDal iUserDal) {
        this.iGenericDal = iUserDal;
        this.iUserDal=iUserDal;
    }
	public User userLoginControl(User user) {
		
		User user1 = this.iUserDal.findByEmail(user.getEmail());
		if(user1 != null) {
			if(user.getPassword().equals(user1.getPassword())) {
				return user1;
			}
		}
		return null;
	}
   
}
