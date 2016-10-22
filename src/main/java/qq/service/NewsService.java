package qq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qq.model.News;
import qq.model.NewsDao;

@Service
public class NewsService {

	@Autowired
	private NewsDao newsDao;
	
	
	public void add(News news){
		
		newsDao.save(news);
		
	}
	
}
