package org.customer.app;

import java.util.List;
import java.util.Scanner;

import org.customer.app.factory.CustomerFactory;
import org.customer.app.factory.CustomerFactoryImpl;
import org.customer.app.model.Customer;
public class App 
{
    private static Scanner scanner=new Scanner(System.in);
	public static void main( String[] args )
    {
        try {
        	  CustomerFactory impl=new CustomerFactoryImpl(); 
        	
        	
        	System.out.println("1 .create customer");
        	System.out.println("2.display all customer");
        	System.out.println("3.find customer by id");
        	System.out.println("4.update customer");
        	System.out.println("5 remove customer");
        	System.out.println("6.exit");
        	System.out.println("Enter the choice");
        	int choice = scanner.nextInt();
        	
        
			
//			  System.out.print("ID: "); int id=scanner.nextInt();
//			  System.out.print("NAME: "); String name=scanner.next();
//			  System.out.print("EMAIL: "); String email=scanner.next();
//			  impl.createCustomer(id, name, email);
			  
			  do {
				  switch(choice) {
				  case 1:
					System.out.print("ID: "); int id=scanner.nextInt();
					  System.out.print("NAME: "); String name=scanner.next();
					  System.out.print("EMAIL: "); String email=scanner.next();
					  Customer customer=impl.createCustomer(id, name, email);		
					  System.out.println(customer.toString());
					  break;
					  
				  case 2:
					  
					 
						List<Customer> list=impl.getAllCustomer(); for(Customer c:list) {
						  System.out.println(c); }
						 break;
				  case 3:
					  System.out.print("enter id to search: ");
			        	 id=scanner.nextInt();
			        	impl.findById(id);
			        	
				  case 4:
					  System.out.print("Enter id to update");
					  id=scanner.nextInt();
					  impl.updateCustomer(id);
				  case 5:
					  System.out.print("Enter id to delete "); 
					  id=scanner.nextInt();
					  impl.deleteCustomer(id);		
					  
				  }
				  
			  }while(choice !=0);
			 

		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}