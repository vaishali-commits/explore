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

@WebServlet("/changepass")
public class ChangePasswordController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String newpass = request.getParameter("new");
		String confirm = request.getParameter("confirm");
		
		if(newpass.equals(confirm)){
			
	HttpSession session = request.getSession();
	String uname=(String)session.getAttribute("usname");
	
	UserModel obj = new UserModel();
	obj.setUpass(newpass);
	obj.setUname(uname);
			
	String result = obj.changepass();
			if(result.equals("success")){
		out.println("Password Changed Successfully<br><br>");
RequestDispatcher rd = request.getRequestDispatcher("sign.jsp");
				rd.include(request, response);
			}
			else{
				out.println("Failed to change password");
				RequestDispatcher rd = request.getRequestDispatcher("changepass.jsp");
				rd.include(request, response);
			}
		}else{
		out.println("New Password & Confirm New Password must be same..");
		RequestDispatcher rd=request.getRequestDispatcher("changepass.jsp");
		rd.include(request,response);
		}			
	}
}
