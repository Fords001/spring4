package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ss")
public class Tesla implements Company {
	
	@Autowired
	private NYSE NYSE3;
	
	

	@Override
	public String earn() {
		// TODO Auto-generated method stub
		return "hero of the day "+NYSE3.money();
	}

	@Override
	public String spend() {
		// TODO Auto-generated method stub
		return "good day "+NYSE3.luck();
	}
	



}
