package spring4;

import org.springframework.stereotype.Component;

@Component("NASDAQ")
public class NASDAQ implements Stocks{
	

	@Override
	public String luck() {
		// TODO Auto-generated method stub
		return "i'll be lucky in nasdaq";
	}

	@Override
	public String money() {
		// TODO Auto-generated method stub
		return "i will be rich in nasdaq";
	}
	

}