package qq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qq.model.News;
import qq.model.NewsDao;

@Service
public class NewsService {

	@Autowired
	private NewsDao newsDao;

	public void add(News news) {

		newsDao.save(news);

	}

	public News getLatest() {

		return newsDao.findFirstByOrderByAddedDesc();
	}

	public List<News> listAll() {

		return (List<News>) newsDao.findAll();

	}

	public void delete(Long id) {

		newsDao.delete(id);
	}

	public News getById(Long id) {

		return newsDao.findById(id);

	}

	public News getByTitle(String title){
		
		return newsDao.findByTitle(title);
	}
}
