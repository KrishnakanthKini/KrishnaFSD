package comm.example.model.bank;



import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class banktest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
					.addAnnotatedClass(bankcurrent.class)
					.addAnnotatedClass(banksavings.class).buildSessionFactory();
			Session session = factory.openSession();
			Bank bank = new Bank("Canara", "Mangalore", "000MANG",5000);
			bankcurrent current = new bankcurrent ("Canara", "Mangalore", "000MANG",5000,10000.00);
			banksavings savings = new banksavings("Canara", "Mangalore", "000MANG",5000,4.50f);
		session.getTransaction().begin();
			session.save(bank);
			session.save(current);
			session.save(savings);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}