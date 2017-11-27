package com.as.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.samples.conn.PersonalInfoVOO;
import com.as.samples.vo.ContactInfo;
import com.as.samples.vo.PersonalInfo;

public class Contact3Servelet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
	                      HttpServletResponse response)
	        throws IOException, ServletException
	    {
		
		ContactInfo contactInfo = new ContactInfo();
		contactInfo.setAddr(request.getParameter("addr"));
		contactInfo.setCity(request.getParameter("city"));
		contactInfo.setState(request.getParameter("state"));
		
		//PersonalInfoVOO personalInfov = new PersonalInfoVOO();
		
		
		String errorMsg = "";
		if(isFieldValueBlank(contactInfo.getAddr()))
		{
			errorMsg += "address can't be blank <br/>";
		}
		if(isFieldValueBlank(contactInfo.getCity()))
		{
			errorMsg += "city can't be blank <br/>";
		}
		if(isFieldValueBlank(contactInfo.getState()))
		{
			errorMsg += "state can't be blank <br/>";
		}
		if(isFieldValueBlank(errorMsg))
		{
			HttpSession ses = request.getSession();
			ses.setAttribute("cinfo", contactInfo);
			response.sendRedirect("html/bankinfo3.html");	

	    }
		else
		{
			request.setAttribute("error_messages", errorMsg);
			RequestDispatcher rs = request.getRequestDispatcher("jsp/contactinfo3.jsp");
            rs.forward(request, response);
		}
	}
	private boolean isFieldValueBlank(String fieldValue) 
	{
		return fieldValue == null || fieldValue.trim().length() == 0;
	}


}


