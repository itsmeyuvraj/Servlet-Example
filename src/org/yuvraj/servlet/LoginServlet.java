package org.yuvraj.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(name="myLogin", urlPatterns= {"/login.jlc"})
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	
	{
		
		// Collect User Data
		
		String uname= req.getParameter("username");
		String pword= req.getParameter("password");
		String msg=" ";
		
		//process the data
		
		if(uname.equals(pword))
				{
			        msg="<h1> Login sucessfull </h1>";
			        
			       
				}
		
		else
		{
			msg="<h1> Login denied";
			
		}
	
		//send output
		
		Writer out= res.getWriter();
		out.write(msg);
		System.out.println("Server working fine");
		
		
	}

}
