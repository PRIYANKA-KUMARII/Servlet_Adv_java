package Adv_javaEmployee;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/form")
public class FormServlet  extends HttpServlet
{
	
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
		{
		
		  RequestDispatcher r= req.getRequestDispatcher("display.jsp");
		  r.forward(req, resp);
		
		}
			
		
}


