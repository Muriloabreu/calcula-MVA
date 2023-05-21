package com.api.calculamva.serviceTeste;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.junit.Ignore;
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
	
	//@Test
	@Ignore
	public void save() {
	
		
	StateModel state = new StateModel();
	
	state.setName("Pernambuco");
	state.setAbbreviation("PE");
	state.setIcms(18.0);
	
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
	
	taxa1.setCalculoMva(taxa1.getCalculoMva());
	taxa1.setValueMva(taxa1.getValueMva());
	taxa1.setIcmsXvalueMva(taxa1.getIcmsXvalueMva());
	taxa1.setIcmsXicms(taxa1.getIcmsXicms());
	taxa1.setUND(taxa1.getUND());
	taxa1.setValueXicms(taxa1.getValueXicms());
	taxa1.setTotalNFE(taxa1.getTotalNFE());
	
	
	System.out.println();
	System.out.println(taxa1);
	System.out.println();
	System.out.println();
	System.out.println("Valor R$: " + taxa1.getProduct().getUnitaryValue() );
	System.out.println("ICMS State " + taxa1.getState().getIcms() + "%: " + taxa1.getIcmsXProduct());
	System.out.println("MVA :" + taxa1.getMVA() + "%" );
	System.out.println("Calculo MVA: " + taxa1.getCalculoMva());
	System.out.println("Valor + MVA: " + taxa1.getValueMva());
	System.out.println("ICMS: "+ taxa1.getState().getIcms() + "% : " + taxa1.getIcmsXvalueMva());
	System.out.println("ICMS " + taxa1.getState().getIcms() + "% - " + taxa1.getState().getIcms() + "%: " + taxa1.getIcmsXicms());
	System.out.println("UND: " + taxa1.getUND());
	System.out.println("Valor + ICMS: " + taxa1.getValueXicms());
	System.out.println("Total da NFE: " + taxa1.getTotalNFE());
	System.out.println("=================");
	System.out.println();
	System.out.println();
	}

}
