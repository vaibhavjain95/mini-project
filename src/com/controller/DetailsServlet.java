package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.dao.RegisterJdbc;
import com.model.Details;

/**
 * Servlet implementation class RegisterServlet
 */
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rid = Integer.parseInt(request.getParameter("rid"));
		String pass = request.getParameter("pass");
		String location = request.getParameter("location");
		String account = request.getParameter("account");
		Double no = Double.parseDouble(request.getParameter("no"));
		
		com.model.Details r = new Details();
		r.setRID(rid);
		r.setPassword(pass);
		r.setLocation(location);
		r.setAccount(account);
		r.setNo(no);
		
		List<Details> lst = new ArrayList<Details>();
		lst.add(r);
		
		RegisterJdbc rj = new RegisterJdbc();
		rj.saveData(lst);
		rj.getAllData();
		PrintWriter pw = response.getWriter();
		response.sendRedirect("Login.jsp");
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
