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

/**
 * Servlet implementation class userdetail
 */
@WebServlet("/userdetail")
public class userdetail extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession();
		String uname=(String)session.getAttribute("usname");
		UserModel obj = new UserModel();
		obj.setUname(uname);
		ArrayList<UserModel> list=obj.show();
		HttpSession session2=request.getSession();
		session.setAttribute("userList",list);
		
		response.sendRedirect("ViewDetails.jsp");	
	}
	}
