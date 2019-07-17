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

import models.ConferenceModel;

@WebServlet("/update2")
public class UpdateConferenceController2 extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		int i=(Integer)session.getAttribute("id");

		String category = request.getParameter("s1");
		int day=Integer.parseInt(request.getParameter("s2"));
		String month = request.getParameter("s3");
		int year=Integer.parseInt(request.getParameter("s4"));
		String title = request.getParameter("t1");
		String venue = request.getParameter("t2");
		String flag=request.getParameter("s5");
		String type=request.getParameter("s6");
		ConferenceModel obj=new ConferenceModel();
		obj.setId(i);
		obj.setCategory(category);
		obj.setDay(day);
		obj.setMonth(month);
		obj.setYear(year);
		obj.setTitle(title);
		obj.setVenue(venue);
		obj.setFlag(flag);
		obj.setType(type);
		String result = obj.update2();
		if(result.equals("success"))
		{
			out.println("Updated successfully...<a href='UpdateConference.jsp'>Go Back</a>");
			
		}
		else{
			out.println("Please Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("UpdateConference.jsp");
			rd.include(request, response);
		}
	}

}
