package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Micros")
public class Microsoft implements Company{
	
	
	@Autowired
	private NYSE NYSE1;

	@Override
	public String earn() {
		// TODO Auto-generated method stub
		return "It is difficult to earn any money on Microsoft stocks but "+NYSE1.money();
	}

	@Override
	public String spend() {
		// TODO Auto-generated method stub
		return NYSE1.luck() + " as Bill Gates";
	}

}
