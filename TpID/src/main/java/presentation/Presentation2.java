package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Imetier;

public class Presentation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Imetier metier = (Imetier) context.getBean("metier");
		System.out.println(metier.calcul());
	}

}
