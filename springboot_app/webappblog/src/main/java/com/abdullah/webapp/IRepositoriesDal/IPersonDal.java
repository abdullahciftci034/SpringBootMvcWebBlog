package com.abdullah.webapp.IRepositoriesDal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.webapp.models.News;
import com.abdullah.webapp.models.Person;
import com.abdullah.webapp.repositories.IGenericDal;

public interface IPersonDal  extends IGenericDal<Person>{
	List<Person> findByNameLikeOrEmailLike(String name, String email);
	List<Person> findByNameContainingOrEmailContaining(String name, String email);
}