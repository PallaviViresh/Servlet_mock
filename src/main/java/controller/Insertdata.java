package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employeedao;
import dto.Employee;
@WebServlet("/insert")
public class Insertdata extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	long phone=Long.parseLong(req.getParameter("phone"));
	
	Employee employee=new Employee();
	employee.setId(id);
	employee.setName(name);
	employee.setPhone(phone);
	
	Employeedao employeedao=new Employeedao();
	employeedao.save(employee);
	resp.getWriter().print("<h1> Data saved Successfully</h1>");
	req.getRequestDispatcher("Home.html").include(req, resp);
	
	
}
}
