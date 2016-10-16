package qq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import qq.model.StatusUpdate;
import qq.model.StatusUpdateDao;

@Service
public class StatusUpdateService {

	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	public void save(StatusUpdate statusUpdate){
		
		statusUpdateDao.save(statusUpdate);
	}
	
	public StatusUpdate getLatest(){
		
		
		return statusUpdateDao.findFirstByOrderByAddedDesc();
	}
	
}
