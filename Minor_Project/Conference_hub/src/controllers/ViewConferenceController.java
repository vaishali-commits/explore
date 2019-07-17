package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import models.ConferenceModel;

@WebServlet("/ViewConferenceController")
public class ViewConferenceController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String category = request.getParameter("s1");
		ConferenceModel obj=new ConferenceModel();
		obj.setCategory(category);
		ArrayList<ConferenceModel>list = obj.view_admin();
		HttpSession session=request.getSession();
		session.setAttribute("userListNew",list);
		
		response.sendRedirect("ConferenceList.jsp");
	}

}
