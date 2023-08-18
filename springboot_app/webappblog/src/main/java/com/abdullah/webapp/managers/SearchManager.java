package com.abdullah.webapp.managers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah.webapp.models.News;
import com.abdullah.webapp.models.Person;

@Service
public class SearchManager {
	private PersonManager personManager;
	private NewsManager newsManager;
	
	@Autowired
	public SearchManager(PersonManager personManager, NewsManager newsManager) {
		super();
		this.personManager = personManager;
		this.newsManager = newsManager;
	}
	
	public List<Object> Search(String search) {
		 List<Object> birlesmisListe = new ArrayList<Object>();
		 List<Person> personList = this.personManager.findSearchContain(search);
	     List<News> newsList = this.newsManager.findSearchContain(search);
         birlesmisListe.addAll(personList);
         birlesmisListe.addAll(newsList);
		 return birlesmisListe;
	}
	
}
