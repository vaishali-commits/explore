package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.ConferenceModel;
import models.RegisterModel;
import models.UserModel;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String i=request.getParameter("x");
		
		//HttpSession session = request.getSession();
		
		//String uname = (String)session.getAttribute("username");
		
		System.out.println("Conference Id : "+i);
		
		int c_id=Integer.parseInt(i);
		RegisterModel ob=new RegisterModel();
		ob.setC_id(c_id);
		//ob.setUsername(uname);
		//String result=ob.register();
		//if(result.equals("success"))
		//{
			//out.println("Enrolled Successfully...<a href='ConferenceList2.jsp'>Go Back</a>");
		//}
		HttpSession session=request.getSession();
		session.setAttribute("c_id",c_id);
				
				response.sendRedirect("RegisterConference.jsp");
	}

}
