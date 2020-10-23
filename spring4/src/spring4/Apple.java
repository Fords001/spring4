package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("Appl")
public class Apple implements Company{
	
	@Value("${A.quality}")
	private String quality;
	
	@Value("${A.country}")
	private String country; 

	@Autowired
	private NYSE NYSE2;
	
	
	@Override
	public String earn() {
		// TODO Auto-generated method stub
		return  "It is difficult to earn any money on Apple stocks but "+NYSE2.money();
	}

	@Override
	public String spend() {
		// TODO Auto-generated method stub
		return NYSE2.luck() + " as Tim Cook";
		
		
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
