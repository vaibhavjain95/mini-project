package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Details;

import com.dao.RegisterJdbc;

public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			RegisterJdbc db = new RegisterJdbc();
			Details u = new Details();
			u.setRID(Integer.parseInt(request.getParameter("rid")));
			List<Details> ls = db.search(u);
			Iterator<Details> itr = ls.iterator();
			u = itr.next();
			PrintWriter pw = response.getWriter();
			//pw.println("user name" + "\t" + "email" + "\t" + "mobile number" + "\t" + "gender" + "\t" + "city" + "\t" + "password" + "\t" + "balance");
			pw.println("<html><head><title>");
			pw.println("User details");
			pw.println("</title></head><body><table border=\"2\" cellpadding=\"3\"><tr>");
			pw.println("<th>Registration Id</th><th>Password</th><th>Location</th><th>Account_type</th><th>Account_no</th>");
			pw.println("</tr><tr>");
			pw.println("<td>"+u.getRID()+"</td><td>"+u.getPassword()+"</td><td>"+u.getLocation()+"</td><td>"+u.getAccount()+"</td><td>"+u.getNo()+"</td></tr>");
			pw.print("</table></body>"); }
			catch (Exception e) {
				System.out.println("yo");
			response.sendRedirect("Search.jsp");
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
