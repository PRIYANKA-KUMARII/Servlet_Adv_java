package Adv_java;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Attendance")
public class Attendance extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int availabeAttendance= Integer.parseInt(req.getParameter("attendence"));
		int totalAttendance= Integer.parseInt(req.getParameter("total"));
		double percentage= (double)(availabeAttendance*100/totalAttendance);
		if(percentage>=75)
		{				
		RequestDispatcher rd=req.getRequestDispatcher("congrates.jsp");
		rd.forward(req, res);
	}
	else {
		RequestDispatcher rd=req.getRequestDispatcher("regret.jsp");
		rd.forward(req, res);
	}
	}
}
