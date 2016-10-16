package tests;

import javax.transaction.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import qq.App;
import qq.model.StatusUpdate;
import qq.model.StatusUpdateDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebAppConfiguration

//RUNNING TEST WITHOUT COMMITING TO THE DATABASES
@Transactional
public class StatusTest {

	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	@Test
	public void testSave(){
		
		StatusUpdate status = new StatusUpdate("this is a test status update");
		
		statusUpdateDao.save(status);
		
		assertNotNull("Non null ID",status.getId());
		assertNotNull("Non null Date",status.getAdded());
		
		StatusUpdate retrieved = statusUpdateDao.findOne(status.getId());
		
		assertEquals("Matching status update.", status, retrieved );
	}
	
	
	
}
