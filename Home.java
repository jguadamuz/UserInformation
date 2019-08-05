package com.jonatan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet(
		urlPatterns = { "/Home" }, 
		initParams = { 
				@WebInitParam(name = "firstName", value = "Unknown"), 
				@WebInitParam(name = "lastName", value = "Unknown"), 
				@WebInitParam(name = "favoriteLanguage", value = "Unkown"), 
				@WebInitParam(name = "homeTown", value = "Unkown")
		})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String favoriteLanguage = request.getParameter("favoriteLanguage");
        String homeTown = request.getParameter("homeTown");
        
        if (firstName == null) firstName = "Unkown";
        if (lastName == null) lastName = "Unkown";
        if (favoriteLanguage == null) favoriteLanguage = "Unkown";
        if (homeTown == null) homeTown = "Unkown"; 

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE HTML>");
        out.write("<html>");
        out.write("<head><title>A web page</title></head>");
        out.write("<body>");
        out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
        out.write("<p>Your favorite language is: " + favoriteLanguage);
        out.write("<p>Your hometown is: " + homeTown);
        out.write("</body>");
        out.write("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
