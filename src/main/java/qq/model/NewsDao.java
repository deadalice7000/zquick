package qq.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsDao extends CrudRepository<News, Long> {

}
