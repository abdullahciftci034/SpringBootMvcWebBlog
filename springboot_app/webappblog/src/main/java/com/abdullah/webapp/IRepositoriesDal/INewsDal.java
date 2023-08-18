package com.abdullah.webapp.IRepositoriesDal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah.webapp.models.News;
import com.abdullah.webapp.models.Person;
import com.abdullah.webapp.repositories.IGenericDal;

public interface INewsDal extends IGenericDal<News> {
	List<News> findByTitleLikeOrContentLike(String title, String content);
	List<News> findByTitleContainingOrContentContaining(String title, String content);
	
	
}
