package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.RegisterModel;
import models.SendEmail;

@WebServlet("/register2")
public class RegisterConferenceController2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		int i=(Integer)session.getAttribute("c_id");
		String user = request.getParameter("t1");
		String fname = request.getParameter("t3");
		String lname = request.getParameter("t4");
		String email=request.getParameter("t5");
		String field=request.getParameter("s1");
		RegisterModel obj=new RegisterModel();
		obj.setC_id(i);
		obj.setUsername(user);
		obj.setFirstname(fname);
		obj.setLastname(lname);
		obj.setEmailid(email);
		obj.setField(field);
		String result = obj.register();
		
		if(result.equals("success"))
		{
			out.println("Enrolled Successfully...<a href='ConferenceList2.jsp'>Go Back</a>");
		}
		}
	}


