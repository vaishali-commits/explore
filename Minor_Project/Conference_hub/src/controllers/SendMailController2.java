package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.SendEmail;

@WebServlet("/SendMail2")
public class SendMailController2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		SendEmail ob = new SendEmail();
		
		String toEmailAddress=request.getParameter("t1");
		String subject=request.getParameter("t2");
		String textMessage=request.getParameter("t3");
		ob.setToEmailAddress(toEmailAddress);
		ob.setSubject(subject);
		ob.setTextMessage(textMessage);
		String result=ob.start();
		if(result.equals("success"))
		{
			out.println("Message delivered...<a href='ViewAllUsers.jsp'>Go Back</a>");
			
		}
	}

}
