<<<<<<< HEAD
package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// first taking input from user
		String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		String result = request.getParameter("result");
		// converting string to double data type -> mainly aim to convert in numeric
		// value to perform operation
		double value1 = Double.parseDouble(input1);
		double value2 = Double.parseDouble(input2);
		// responding type set for web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// logic creation
		if (result.equals("/")) {
			double ans = value1 / value2;
			out.print("<h2>Divided Result is : " + ans + "</h2>");
		} else if (result.equals("*")) {
			double ans = value1 * value2;
			out.print("<h2>Multiplied Result is : " + ans + "</h2>");
		} else if (result.equals("+")) {
			double ans = value1 + value2;
			out.print("<h2>Added Result is : " + ans + "</h2>");
		} else if (result.equals("-")) {
			double ans = value1 - value2;
			out.print("<h2>Subtracted Result is : " + ans + "</h2>");
		}
		//using href tag to go back on calculator.html page
		out.print("<h2><a href='Calculator.html'>Go to Back</a></h2>");
		//closing to take user input
		out.close();
	}
}
=======
package servlet.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// first taking input from user
		String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		String result = request.getParameter("result");
		// converting string to double data type -> mainly aim to convert in numeric
		// value to perform operation
		double value1 = Double.parseDouble(input1);
		double value2 = Double.parseDouble(input2);
		// responding type set for web page
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// logic creation
		if (result.equals("/")) {
			double ans = value1 / value2;
			out.print("<h2>Divided Result is : " + ans + "</h2>");
		} else if (result.equals("*")) {
			double ans = value1 * value2;
			out.print("<h2>Multiplied Result is : " + ans + "</h2>");
		} else if (result.equals("+")) {
			double ans = value1 + value2;
			out.print("<h2>Added Result is : " + ans + "</h2>");
		} else if (result.equals("-")) {
			double ans = value1 - value2;
			out.print("<h2>Subtracted Result is : " + ans + "</h2>");
		}
		//using href tag to go back on calculator.html page
		out.print("<h2><a href='Calculator.html'>Go to Back</a></h2>");
		//closing to take user input
		out.close();
	}
}
>>>>>>> 51c660bf19abc2e2f62ced04efb93616adfecb1a
