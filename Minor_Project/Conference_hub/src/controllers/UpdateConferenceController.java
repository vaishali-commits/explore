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

@WebServlet("/update")
public class UpdateConferenceController extends HttpServlet {
	
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String i=request.getParameter("x");
		int id=Integer.parseInt(i);
		ConferenceModel ob=new ConferenceModel();
		ob.setId(id);
		String result=ob.update();
		if(result.equals("success"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("id",id);
					
					response.sendRedirect("UpdateConference.jsp");
		}
	}

}
