package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RegisterJdbc;
import com.model.Login;
import com.model.Details;

public class LoginServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServLet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rid = Integer.parseInt(request.getParameter("rid"));
		String pass = request.getParameter("pass");
		com.model.Login l = new com.model.Login();
		l.setRID(rid);
		l.setPassword(pass);
		List<Login> ls = new ArrayList<Login>();
		ls.add(l);
		RegisterJdbc rj = new RegisterJdbc();
		boolean b = rj.validateData(ls);
		PrintWriter pw = response.getWriter();
		if(b==true) {
			HttpSession session = request.getSession();
			session.setAttribute("id", rid);
			response.sendRedirect("Success.jsp");
		}else {
			response.sendRedirect("Login.jsp");
		}
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
