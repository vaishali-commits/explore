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

@WebServlet("/SendMail")
public class SendMailController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		/*HttpSession session=request.getSession();
		String toEmailAddress=(String)session.getAttribute("x");*/
		
		out.println("<link rel='stylesheet' type='text/css' href='hp.css'/>");
		out.println("<center><h2>Send New E-mail</h2></center>");
		out.println("<form action='SendMail2'>");
		out.println("Enter Recipient:<input type='text' placeholder='Enter only 1 email-id' name='t1' required/><br/>");
		out.println("Enter Subject:<input type='text'  name='t2' required/><br/>");
		out.println("Enter message:<input type='text'  name='t3' required/><br/>");
		out.println("<input type='submit' value='send'>");
		out.println("</form>");
		
	}

}
