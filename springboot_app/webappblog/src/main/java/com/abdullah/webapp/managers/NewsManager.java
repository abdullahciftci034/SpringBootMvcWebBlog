package com.abdullah.webapp.managers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.webapp.IRepositoriesDal.INewsDal;
import com.abdullah.webapp.models.News;


@Service
public class NewsManager extends GenericManager<News> {

	@Autowired
	private INewsDal iNewsDal;
	
	@Autowired
    public NewsManager(INewsDal iNewsDal) {
        this.iGenericDal = iNewsDal;
        this.iNewsDal=iNewsDal;
    }
	public List<News> findSearch(String search){
		return this.iNewsDal.findByTitleLikeOrContentLike(search, search);
	}
	public List<News> findSearchContain(String search){
		return this.iNewsDal.findByTitleContainingOrContentContaining (search, search);
	}
}
