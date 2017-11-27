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

public class Welcome3Servelet  extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	        throws IOException, ServletException
	{
		
		PersonalInfo personalInfo = new PersonalInfo();
		personalInfo.setFirstname(request.getParameter("fname"));
		personalInfo.setLastname(request.getParameter("lname"));
		personalInfo.setMiddlename(request.getParameter("mname"));
		
		//PersonalInfoVOO personalInfov = new PersonalInfoVOO();  


		//PersonalInfoVOO personalInfov = new PersonalInfoVOO();
	
		
		String errorMsg = "";
		if(isFieldValueBlank(personalInfo.getFirstname()))
		{
			errorMsg += "first name can't be blank <br/>";
		}
		if(isFieldValueBlank(personalInfo.getLastname()))
		{
			errorMsg += "last name can't be blank <br/>";
		}
		if(isFieldValueBlank(personalInfo.getMiddlename()))
		{
			errorMsg += "middle name can't be blank <br/>";
		}
		if(isFieldValueBlank(errorMsg))
		{
			HttpSession ses = request.getSession();
			ses.setAttribute("pinfo", personalInfo);
			response.sendRedirect("html/contactinfo3.html");	

	    }
		else
		{
			request.setAttribute("error_messages", errorMsg);
			RequestDispatcher rs = request.getRequestDispatcher("jsp/welcome3.jsp");
            rs.forward(request, response);
		}
	}
	private boolean isFieldValueBlank(String fieldValue) 
	{
		return fieldValue == null || fieldValue.trim().length() == 0;
	}

}
