package com.as.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample  extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
	                      HttpServletResponse response)
	        throws IOException, ServletException
	    {
		//Get registration details and set to the EMailAddress
	    	String firstName = request.getParameter("fname");
	    	String middleName = request.getParameter("mname");
	    	String lastName = request.getParameter("lname");
	    	String homePhone = request.getParameter("hphone");
	    	String workPhone = request.getParameter("wphone");
	    	System.out.println("First Name is " + firstName);
	    	System.out.println("Last Name is " + lastName);
	    	request.getSession().setAttribute("ofname", firstName);
	    	request.getSession().setAttribute("omname", middleName);
	    	request.getSession().setAttribute("olname", lastName);
	    	request.getSession().setAttribute("ohphone", homePhone);
	    	request.getSession().setAttribute("owphone", workPhone);
	        response.setContentType("text/html");
			//response.sendRedirect("html/contactinfo.html");
			
			String name = request.getParameter("submit");
	        String name2 = request.getParameter("submit_contact"); 
	        String name3 = request.getParameter("submit_bank");
	        if("submit".equals(name))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("html/contactinfo.html");
	            rs.forward(request, response);
	        	//response.sendRedirect("html/contactinfo.html");
	        }
	        else if("submit_contact".equals(name2))
	        { 
	            RequestDispatcher rs = request.getRequestDispatcher("html/bankinfo.html"); 
	            rs.forward(request, response);
	        	//response.sendRedirect("html/bankinfo.html");
	        }
	        else if("submit_bank".equals(name3))
	        { 
	            RequestDispatcher rs = request.getRequestDispatcher("html/success.html"); 
	            rs.forward(request, response);
	        	//response.sendRedirect("html/success.html");
	        }

	    }

}
