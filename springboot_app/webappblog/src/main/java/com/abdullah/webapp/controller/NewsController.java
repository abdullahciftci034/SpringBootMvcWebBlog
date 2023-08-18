package com.abdullah.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.abdullah.webapp.managers.NewsManager;
import com.abdullah.webapp.models.News;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	private final NewsManager newsManager;
	
	@Autowired
	public NewsController(NewsManager newsManager) {
		super();
		this.newsManager = newsManager;
	}
	
	@GetMapping(value = "/",produces="text/html")
	public String newsList(Model model,HttpServletRequest httpRequest) {
		List<News> list=newsManager.getAll();
		model.addAttribute("newsLists",list);
		return "newsList";
	}
	@GetMapping(value = "/{id}",produces="text/html")
	public String news(Model model,@PathVariable("id") int id) {
        model.addAttribute("newsler", newsManager.getById(id));
		return "newsById";
	}
	@GetMapping(value = "/save",produces="text/html")
	public String SaveNews(Model model,News news ) {
        this.newsManager.save(news);
        model.addAttribute("newsler", news);
		return "newsById";
	}
	@GetMapping(value = "/SaveNewsForm",produces="text/html")
	public String SaveNewsForm(Model model) {
		return "SaveNewsForm";
	}
	
	
}
