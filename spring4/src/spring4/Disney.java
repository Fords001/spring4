package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Disney implements Company {

	@Autowired
	@Qualifier("NYSE")
	private NYSE nyse7;
	
	
	@Autowired
	@Qualifier("NASDAQ")
	private NASDAQ nasd;
	
	
	@Override
	public String earn() {
		// TODO Auto-generated method stub
		return nasd.luck();
	}

	@Override
	public String spend() {
		// TODO Auto-generated method stub
		return nyse7.money();
	}
	  
	
	
	
	

}
