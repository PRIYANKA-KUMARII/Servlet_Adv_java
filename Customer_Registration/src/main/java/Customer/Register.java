package Customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/register")
public class Register extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String ename= req.getParameter("ename");
		String eid= req.getParameter("mail");
		String Password=req.getParameter("password");
		String MobilNumber=req.getParameter("mobile number");
		String  Gender= req.getParameter("gender");
		String Interests=req.getParameter("interests");
		String 	Country	=req.getParameter("country");
		String Address=req.getParameter("address");
		PrintWriter p= res.getWriter();
		res.setContentType("text/html");
		
		p.println("Name:"+ename+"<br>");
		p.println("Email:"+eid+"<br>");
		p.println("password:"+Password+"<br>");
		p.println("MobileNumber:"+MobilNumber+"<br>");
		p.println("Gender:"+ Gender+"<br>");
		p.println("Interests:"+ Interests+"<br>" );
		p.println("Country:"+Country+"<br>");
		p.println("Address : "+Address +"<br>");
	}
	


}



