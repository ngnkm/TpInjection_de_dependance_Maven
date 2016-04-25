package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.Imetier;
import metier.MetierImpl;

public class Presentation {
	
	 public static void main(String[] args){
//		 DaoImpl dao = new DaoImpl();
//		 MetierImpl metier = new MetierImpl();	
//		 metier.setDao(dao);
//		 System.out.println(metier.calcul());
		 try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoclassName = scanner.nextLine();
			String metierclassame =  scanner.next();
			System.out.println(daoclassName);
			System.out.println(metierclassame);
			Class cDao = Class.forName(daoclassName);
			IDao dao = (IDao) cDao.newInstance();
			System.out.println(dao.getValue());
			
			Class cMetier = Class.forName(metierclassame);
			Imetier metier = (Imetier) cMetier.newInstance();
			
			Method m1 = cMetier.getMethod("setDao", new Class[]{IDao.class});
			m1.invoke(metier,new Object[]{dao});
			System.out.println(metier.calcul());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
