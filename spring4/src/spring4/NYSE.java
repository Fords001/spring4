package spring4;

import org.springframework.stereotype.Component;

@Component("NYSE")
public class NYSE implements Stocks{

	@Override
	public String luck() {
		// TODO Auto-generated method stub
		return "i'll be lucky";
	}

	@Override
	public String money() {
		// TODO Auto-generated method stub
		return "i will be rich";
	}
	

}
