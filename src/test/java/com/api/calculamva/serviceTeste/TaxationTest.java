package com.api.calculamva.serviceTeste;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.api.calculamva.models.ProductModel;
import com.api.calculamva.models.StateModel;
import com.api.calculamva.models.TaxationModel;
import com.api.calculamva.services.TaxationService;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TaxationTest {
	
	
	@Autowired
	TaxationService ts;
	
	@Test
	public void save() {
	
		
	StateModel state = new StateModel();
	
	state.setName("Pernambuco");
	state.setAbbreviation("PE");
	state.setIcms(18);
	
	ProductModel p01 = new ProductModel();

	p01.setName("IPhone 11");
	p01.setDescription("128 Gb, Branco");
	p01.setRegistrationDate(LocalDateTime.of(2023, 05, 20, 8, 30, 00));
	p01.setUnitaryValue(2000.00);
	
	TaxationModel taxa1 = new TaxationModel();
	taxa1.setProduct(p01);
	taxa1.setMVA(71.71);
	taxa1.setState(state);
	taxa1.setAmount(10);
	
	
	System.out.println(taxa1);
	
	}

}
