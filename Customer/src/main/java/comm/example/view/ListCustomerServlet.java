package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Customer;

public class ListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private List<Customer> list=null;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		list=new ArrayList<Customer>();
		list.add(new Customer("Nadal","1234","full-time"));
		list.add(new Customer("Paes","1345","part-time"));
		
		out.println("<html><title>List All Available Customer</title><body><table border='1'><tr><td>Season</td><td>Title</td><td>Year</td></tr>");
		
		for(Customer l:list)
		{
			out.println("<tr><td>"+l.getCust_name()+"</td><td>"+l.getCust_id()+"</td><td>"+l.getCust_type()+"</td></tr>");
		}
		out.println("</table><a href='index.html'>Go To Home Page</a></body></html>");
		
	}

	
}
