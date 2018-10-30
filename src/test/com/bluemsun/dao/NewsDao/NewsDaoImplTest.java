package com.bluemsun.dao.NewsDao;

import com.bluemsun.entity.News;
import com.bluemsun.entity.Page;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NewsDaoImplTest {
	
	@Test
	public void getNewsDao() {
		NewsDao newsDao=new NewsDaoImpl();
		List<News> pages=new ArrayList<>();
		pages=newsDao.getNewsDao(1,5);
		for (News x:pages){
			System.out.println(x.getTitle());
		}
	}
	
	@Test
	public void getCount() {
		NewsDao newsDao=new NewsDaoImpl();
		Long count=newsDao.getCount();
		System.out.println(count);
		
	}
}