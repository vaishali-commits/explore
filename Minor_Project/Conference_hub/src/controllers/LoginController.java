package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.UserModel;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		UserModel obj=new UserModel();
		obj.setUname(s1);
		obj.setUpass(s2);
		String result=obj.validate();
		HttpSession session = request.getSession();
		session.setAttribute("username",s1);
		
		
		if(result.equals("success")){
			HttpSession session1=request.getSession();
			session1.setAttribute("usname", s1);
			response.sendRedirect("welcome.jsp");
			
		}else if(result.equals("success with admin")){
			HttpSession session1=request.getSession();
			session1.setAttribute("usname", s1);
			response.sendRedirect("welcomeAdmin.jsp");
		}
		
		else{
			out.println("User name or password is incorrect");
			RequestDispatcher rd=request.getRequestDispatcher("sign.jsp");
			rd.include(request, response);	
		}
	}	
}
