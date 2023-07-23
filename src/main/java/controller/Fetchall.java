package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employeedao;
import dto.Employee;
@WebServlet("/fetchall")
public class Fetchall extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Employeedao employeedao=new Employeedao();
	List<Employee> list= employeedao.fetchAll();
	resp.getWriter().print("<table border='1'>"
			+ "<tr>"
			+ "<th>Id</th>"
			+ "<th>Name</th>"
			+ "<th>Mobile</th>"
			+ "</tr>");
	
	for(Employee employee:list){
		resp.getWriter().print("<tr>"
			+ "<th>"+employee.getId()+"</th>"
			+ "<th>"+employee.getName()+"</th>"
			+ "<th>"+employee.getPhone()+"</th>"
			+ "</tr>");}
	
	resp.getWriter().print("</table>");

	resp.getWriter().print("<h1>Data Fetched successfully</h1>");

}
}

