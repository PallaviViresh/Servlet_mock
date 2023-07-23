package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employeedao;
import dto.Employee;

@WebServlet("/fetchid")
public class fetchbyid extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	Employeedao employeedao=new Employeedao();
	Employee employee=employeedao.fetch(id);
	
	resp.getWriter().print("<table border='1'>"
			+ "<tr>"
			+ "<th>Id</th>"
			+ "<th>Name</th>"
			+ "<th>Mobile</th>"
			+ "</tr>"
			+ "<tr>"
			+ "<th>"+employee.getId()+"</th>"
			+ "<th>"+employee.getName()+"</th>"
			+ "<th>"+employee.getPhone()+"</th>"
			+ "</tr>"
			+ "<table>");

	resp.getWriter().print("<h1>Data Fetched successfully</h1>");
	
}
}