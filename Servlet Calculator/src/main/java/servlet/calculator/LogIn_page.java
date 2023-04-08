<<<<<<< HEAD
package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogIn_page")
public class LogIn_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// responding type set for web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// taking input from user
		String name =request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//applying condition if email match to demo@gmail.com and password 123 then go ahead for calculator html page
		if (email.equals("demo@gmail.com") && password.equals("123")) {
			//using request dispatcher method for send on calculator html page
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.html");
			rd.forward(request, response);
		}else {
			//if condition not match then print invalid message
			out.print("<h3 style ='color : red;'>Invalid Email or Password</h3>");
			//here we are using include method to show message on same page login.html page
			RequestDispatcher rd = request.getRequestDispatcher("LogIn-page.html");
			rd.include(request, response);
		}out.close();
	}
}
=======
package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LogIn_page")
public class LogIn_page extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// responding type set for web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// taking input from user
		String name =request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//applying condition if email match to demo@gmail.com and password 123 then go ahead for calculator html page
		if (email.equals("demo@gmail.com") && password.equals("123")) {
			//using request dispatcher method for send on calculator html page
			RequestDispatcher rd = request.getRequestDispatcher("Calculator.html");
			rd.forward(request, response);
		}else {
			//if condition not match then print invalid message
			out.print("<h3 style ='color : red;'>Invalid Email or Password</h3>");
			//here we are using include method to show message on same page login.html page
			RequestDispatcher rd = request.getRequestDispatcher("LogIn-page.html");
			rd.include(request, response);
		}out.close();
	}
}
>>>>>>> 51c660bf19abc2e2f62ced04efb93616adfecb1a
