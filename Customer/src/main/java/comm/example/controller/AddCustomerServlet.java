package comm.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Customer;

public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String cust_name;
	private String cust_id;
	private String cust_type;
	private List<String> errors;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		errors = new ArrayList<String>();
		String cust_name = request.getParameter("cust_name");
		if(cust_name.length()<=0)
		{
			errors.add("invalid name");
		}
	cust_id=request.getParameter("cust_id");
		if(cust_id.length()<=0)
		{
			errors.add("invalid id");
		}
		cust_type=request.getParameter("cust_type");
		if(cust_type.equals("Unknown"))
		{
			errors.add("select a type");
		}
		if(!errors.isEmpty())
		{
		request.setAttribute("ERROR", errors);
			RequestDispatcher view=request.getRequestDispatcher("error.view");
			view.forward(request, response);
		
		}
		else
		{

			request.setAttribute("SUCCESS", new Customer(cust_name,cust_id,cust_type));
			RequestDispatcher view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}

	}

}
