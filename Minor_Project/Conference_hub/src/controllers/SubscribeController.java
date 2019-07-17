
package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.SendEmail;
import models.UserModel;
@WebServlet("/subscribe")
public class SubscribeController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String user = request.getParameter("t1");
		String pass = request.getParameter("t2");
		String fname = request.getParameter("t3");
		String lname = request.getParameter("t4");
		String email=request.getParameter("t5");
		UserModel obj = new UserModel();
		obj.setUname(user);
		obj.setUpass(pass);
		obj.setFname(fname);
		obj.setLname(lname);
		obj.setEmail(email);
		String result = obj.register();
		
		SendEmail ob = new SendEmail();
		String toEmailAddress=email;
		String subject="Conference Hub";
		String textMessage="Hi! "+fname+ "\nWelcome to conference hub. We are glad to have you.\n\n Your username: "+user+" and email: "+email+" Have a nice exploration!!\n\n\nRegards,\nConference Hub";
		ob.setToEmailAddress(toEmailAddress);
		ob.setSubject(subject);
		ob.setTextMessage(textMessage);
		String result2=ob.start();
		
		if(result.equals("success")&& result2.equals("success"))
		{
			out.println("Registered Successfully .... <a href='sign.jsp'>click here for Login</a>");
			
		}
		else{
			out.println("Registration Failed please Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.include(request, response);
		}
		}
	}

	
