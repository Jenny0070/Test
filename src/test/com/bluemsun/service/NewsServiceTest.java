package com.bluemsun.service;

import com.bluemsun.entity.News;
import com.bluemsun.entity.Page;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NewsServiceTest {
	
	@Test
	public void getPageService() {
		NewsService newsService=new NewsService();
		Page page=newsService.getPageService(1,5);
		List<News> list=page.getPageList();
		for (News x:list){
			System.out.println(x.getTitle());
		}
	}
	
	@Test
	public void add() {
		NewsService newsService=new NewsService();
		News news=new News("1","1","1","1","1","1");
		int flag=newsService.add(news);
		System.out.println(flag);
	}
	
	@Test
	public void findIdByTitle() {
	}
	
	@Test
	public void delete() {
	}
	
	@Test
	public void update() {
	}
	
	@Test
	public void queryAll() {
	}
}