package Application_Details;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/user")
public class Appliction  implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String UserId= req.getParameter("id");
		String UserFName=req.getParameter("FName");
		String UserLName=req.getParameter("LName");
		String UserMailId=req.getParameter("MailId");
		String UserPhNo=req.getParameter("PhNo");
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		pw.println("UserId:"+UserId);
		pw.println("<br>UserFName:"+UserFName);
		pw.println("<br>UserLName:"+UserLName);
		pw.println("<br>UserMailId:"+UserMailId);
		pw.println("<br> UserPhNo:"+UserPhNo);
;
		}
	

}
