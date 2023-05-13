package com.nt.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class VaccineEligibilityServlet extends HttpServlet {
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	String name=req.getParameter("pname");
	int age=Integer.parseInt(req.getParameter("page"));
	String addrs=req.getParameter("paddress");
	if(age<18)
		pw.println("<h1 style='color:red;text-align:center'>Mr/Miss/Mirss."+name+"Sorry!you are not eligible for corona vaccination </h1>");
	else
		pw.println("<h1 style='color:green;text-align:center'>Mr/Miss/Mirs."+name+"Congrats! you are eligible for corona vaccination make it happen</h1>");
	pw.println("<a href='http://localhost:8089/CoronaVaccineApp/corona_vaccine.html'><img src='image/corona.png'></a>");
			pw.close();
}
}
			