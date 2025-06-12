package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/avg")
public class Average extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a= Integer.parseInt(req.getParameter("v1"));
		int b= Integer.parseInt(req.getParameter("v2"));
		int avg=a+b/2;
		PrintWriter p= res.getWriter();
		res.setContentType("text/html");
		p.println("Avg:"+avg);
		
	}

}
