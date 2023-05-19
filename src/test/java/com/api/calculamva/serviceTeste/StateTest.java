package com.api.calculamva.serviceTeste;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.api.calculamva.services.StateService;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class StateTest {
	
	@Autowired
	StateService stateService;
	
	public void save() {
		
		
		
	}

}
