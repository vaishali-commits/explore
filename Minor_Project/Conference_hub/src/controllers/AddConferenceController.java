package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ConferenceModel;
import models.SendEmail;
import models.UserModel;

@WebServlet("/AddConferenceController")
public class AddConferenceController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String category = request.getParameter("s1");
		int day=Integer.parseInt(request.getParameter("s2"));
		String month = request.getParameter("s3");
		int year=Integer.parseInt(request.getParameter("s4"));
		String title = request.getParameter("t1");
		String venue = request.getParameter("t2");
		String type=request.getParameter("s5");
		String flag="pending";
		ConferenceModel obj=new ConferenceModel();
		obj.setCategory(category);
		obj.setDay(day);
		obj.setMonth(month);
		obj.setYear(year);
		obj.setTitle(title);
		obj.setVenue(venue);
		obj.setType(type);
		obj.setFlag(flag);
		String result = obj.add_user();
		if(result.equals("success"))
		{
			
			out.println("Inserted successfully...<a href='Conference2.jsp'>Go Back</a>");
			
		}
		else{
			out.println("Please Try Again");
			RequestDispatcher rd = request.getRequestDispatcher("addconference.jsp");
			rd.include(request, response);
		}
		}
	}

