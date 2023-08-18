package com.abdullah.webapp.IRepositoriesDal;

import com.abdullah.webapp.models.User;
import com.abdullah.webapp.repositories.IGenericDal;

public interface IUserDal  extends IGenericDal<User>{
	User findByEmail(String email);
}