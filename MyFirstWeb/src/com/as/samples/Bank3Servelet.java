package com.as.samples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.samples.conn.JDBCConnect;
import com.as.samples.conn.PersonalInfoVOO;
import com.as.samples.vo.BankInfo;
import com.as.samples.vo.ContactInfo;
import com.as.samples.vo.PersonalInfo;

public class Bank3Servelet  extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
	                      HttpServletResponse response)
	        throws IOException, ServletException
	    {
		
		BankInfo bankInfo = new BankInfo();
		bankInfo.setBankName(request.getParameter("bankname"));
		bankInfo.setAccNo(request.getParameter("accno"));
		bankInfo.setSsn(request.getParameter("ssn"));
		
		HttpSession ses = request.getSession();
		PersonalInfo pi = (PersonalInfo) ses.getAttribute("pinfo");
		ContactInfo ci = (ContactInfo) ses.getAttribute("cinfo");
		PersonalInfoVOO personalInfov = new PersonalInfoVOO();
		
		personalInfov.setFirstname(pi.getFirstname());
		personalInfov.setMiddlename(pi.getMiddlename());
		personalInfov.setLastname(pi.getLastname());
		personalInfov.setAddr(ci.getAddr());
		personalInfov.setCity(ci.getCity());
		personalInfov.setState(ci.getState());
		personalInfov.setBankName(request.getParameter("bankname"));
		personalInfov.setAccNo(request.getParameter("accno"));
		personalInfov.setSsn(request.getParameter("ssn"));
	
		String errorMsg = "";
		if(isFieldValueBlank(bankInfo.getBankName()))
		{
			errorMsg += "bank name can't be blank <br/>";
		}
		if(isFieldValueBlank(bankInfo.getAccNo()))
		{
			errorMsg += "Acc no can't be blank <br/>";
			
		}
		else if(!isNumber(bankInfo.getAccNo()))
			errorMsg += "Acc no can't be letter <br/>";
		
		if(isFieldValueBlank(bankInfo.getSsn()))
		{
			errorMsg += "ssn can't be blank <br/>";
			
		}
		else if(!isNumber(bankInfo.getSsn()))
			errorMsg += "ssn can't be letter <br/>";
		
		if(isFieldValueBlank(errorMsg))
		{
			try {
				JDBCConnect.addPersonalInfo(personalInfov);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ses.setAttribute("binfo", bankInfo);
			response.sendRedirect("jsp/welcome3out.jsp");	

	    }
		else
		{
			request.setAttribute("error_messages", errorMsg);
			RequestDispatcher rs = request.getRequestDispatcher("jsp/bankinfo3.jsp");
            rs.forward(request, response);
		}
	}
	private boolean isFieldValueBlank(String fieldValue) 
	{
		return fieldValue == null || fieldValue.trim().length() == 0;
	}
	private boolean isNumber(String s) 
	{
		return s != null && s.matches("[-+]?\\d*\\.?\\d+"); 
	}


}
