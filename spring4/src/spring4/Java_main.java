package spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Java_main {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Apple appl1=cont.getBean("Appl",Apple.class);
		Microsoft micros1 =cont.getBean("Micros",Microsoft.class);
		Tesla tes1=cont.getBean("ss",Tesla.class);
		Disney disnnn=cont.getBean("disney", Disney.class);
		

		
		System.out.println(appl1.earn());
		System.out.println(appl1.spend());
		System.out.println(micros1.earn());
		System.out.println(micros1.spend());
		System.out.println(tes1.earn());
		System.out.println(tes1.spend());
		System.out.println(disnnn.earn());
		System.out.println(disnnn.spend());
		System.out.println("Apple based in "+appl1.getCountry()+ " and has "+appl1.getQuality()+" quality");
		
	}

}
