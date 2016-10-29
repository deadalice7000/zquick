package qq.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDao extends PagingAndSortingRepository<News, Long> {

	News findFirstByOrderByAddedDesc();
	
	
	
	News findById(Long id);
	
	News findByTitle(String title);
}
