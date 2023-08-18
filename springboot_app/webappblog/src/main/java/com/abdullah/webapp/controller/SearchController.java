package com.abdullah.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.MergedAnnotations.Search;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah.webapp.managers.SearchManager;

@RestController
@RequestMapping("/search")
public class SearchController  {
	@Autowired
	private SearchManager  searchManager;  
	@PostMapping("/")
	public List<Object> GetSearch(@RequestParam String search) {
	    return searchManager.Search(search); 
	}
}
