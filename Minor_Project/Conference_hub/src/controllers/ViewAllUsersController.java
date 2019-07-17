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

import models.UserModel;

@WebServlet("/view")
public class ViewAllUsersController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		UserModel um=new UserModel();
		ArrayList<UserModel> list=um.viewAllUsers();
		
		System.out.println("List : "+list);
		
		HttpSession session=request.getSession();
		session.setAttribute("userList",list);
		
		response.sendRedirect("ViewAllUsers.jsp");	
	}
}