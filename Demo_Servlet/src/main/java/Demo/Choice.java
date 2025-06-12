package Demo;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class Choice  extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String inp=req.getParameter("s");
		if(inp.equals("Addition")) {
			RequestDispatcher r=req.getRequestDispatcher("/ad");
			r.forward(req, res);
		}else {
			RequestDispatcher r=req.getRequestDispatcher("/avg");
			r.forward(req, res);	 
		}
		
	}

}
