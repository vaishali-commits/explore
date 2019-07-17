package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ConferenceModel;

@WebServlet("/delete")
public class DeleteConferenceController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String i=request.getParameter("x");
		int id=Integer.parseInt(i);
		ConferenceModel ob=new ConferenceModel();
		ob.setId(id);
		String result=ob.delete();
		System.out.println("Result : "+result);
		if(result.equals("success"))
		{
			out.println("Deleted successfully...<a href='conference.jsp'>Go Back</a>");
			
		}

	}
	}
	
