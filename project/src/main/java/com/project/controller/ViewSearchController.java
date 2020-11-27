package com.project.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.exception.BusinessException;
import com.project.model.Report;
import com.project.service.ViewSearchService;
import com.project.service.impl.ViewSearchServiceImpl;

/**
 * Servlet implementation class EmployeeSearchController
 */
public class ViewSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewSearchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String value = request.getParameter("cname");
		ViewSearchService service=new ViewSearchServiceImpl();
			try {
				String name=value;
				List<Report> repList=service.getReportByName(name);
				HttpSession session=request.getSession();
				session.setAttribute("repList", repList);
				response.sendRedirect("results.jsp");
			}catch(NumberFormatException | BusinessException e) {
				if(e instanceof NumberFormatException) {
					request.setAttribute("error", "ClassName Cannot have any Characters or Empty");
				}else {
					request.setAttribute("error", e.getMessage());
				}
				request.getRequestDispatcher("view.jsp").forward(request, response);
			}
		
		}
	}


