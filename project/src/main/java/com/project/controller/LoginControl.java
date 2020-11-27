package com.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.exception.BusinessException;
import com.project.model.Admin;
import com.project.service.LoginService;
import com.project.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginControl
 */
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Admin admin=new Admin();
		admin.setAdminID(request.getParameter("aid"));
		admin.setPassword(request.getParameter("password"));
		LoginService loginService=new LoginServiceImpl();
		RequestDispatcher rd=null;
		try {
			if(loginService.isValidLoginCredentials(admin)) {
				HttpSession session=request.getSession();
				session.setAttribute("aid", admin.getAdminID());
				response.sendRedirect("view.jsp");
				
			}
		} catch (BusinessException e) {

			rd=request.getRequestDispatcher("AdminLogin.jsp");
			request.setAttribute("error", e.getMessage());
			rd.forward(request, response);
		}
	}
		
		
	}


