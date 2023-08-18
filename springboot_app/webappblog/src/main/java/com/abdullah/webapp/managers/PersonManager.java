package com.abdullah.webapp.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.webapp.IRepositoriesDal.IPersonDal;

import com.abdullah.webapp.models.Person;
@Service
public class PersonManager extends GenericManager<Person>  {
    private IPersonDal iPersonDal;
	@Autowired
    public PersonManager(IPersonDal iPersonDal) {
        this.iGenericDal = iPersonDal;
        this.iPersonDal=iPersonDal;
    }  
	
	public List<Person> findSearch(String search){
		return this.iPersonDal.findByNameLikeOrEmailLike(search, search);
	}
	public List<Person> findSearchContain(String search){
		return this.iPersonDal.findByNameContainingOrEmailContaining(search, search);
	}
}
