package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.League;

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String season, title;
	private int year;
private List<String> errors=null;
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Hey I am in controller.do");
		errors=new LinkedList<String>();
		season=request.getParameter("season");
		
		title=request.getParameter("title");
		if((title==null) || (title.length()<5))
		{
			errors.add("title can't be null or less than 5 chars");
		}
		try {
			year=Integer.parseInt(request.getParameter("year").toString());
		} catch (Exception e) {
			errors.add("year field must be numeric");
		}
		
		
		if(!errors.isEmpty())
		{
			request.setAttribute("errors", errors);
			RequestDispatcher view=request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
		}
		else
		{
			request.setAttribute("success", new League(season, year, title ));
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.include(request, response);
			
		}
	}

}
