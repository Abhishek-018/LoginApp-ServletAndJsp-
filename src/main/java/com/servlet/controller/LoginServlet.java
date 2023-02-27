package com.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.dto.User;
import com.servlet.service.LoginAuthentication;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "Login servlet", urlPatterns = { "/LoginServletPath" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uemail;
		String upassword;
		
		
		uemail = (String) request.getParameter("email");
		upassword = (String) request.getParameter("password");
		request.setAttribute("requestUserEmail",uemail);

		LoginAuthentication loginAuthentication = new LoginAuthentication();
		boolean result = loginAuthentication.authenticate(uemail,upassword);
		
		if(result) {
			User receivedUser = loginAuthentication.getUserDetails(uemail,upassword);
			//request.getSession().setAttribute("userDetails",receivedUser);
			
			//To set in request scope-
			request.setAttribute("userDetails",receivedUser);
			
			HttpSession sessionEmailId = request.getSession();
			ServletContext applicationEmailId =  request.getServletContext();
	
			sessionEmailId.setAttribute("savedSessionEmailId",uemail);
			applicationEmailId.setAttribute("savedApplicationEmailId",uemail);
			
			//response.sendRedirect("success.jsp");
			//Making use of request dispatcher instead of sendRedirect
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request,response);
			return;
		}
		else {
			response.sendRedirect("loginPage.jsp");
			return;
		}
		
	}

}
