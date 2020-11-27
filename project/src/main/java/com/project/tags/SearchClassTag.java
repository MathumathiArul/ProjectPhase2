package com.project.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.project.model.Report;



public class SearchClassTag extends SimpleTagSupport {
	
	private List<Report> repList;

	public void setRepList(List<Report> repList) {
		this.repList = repList;
	}



	@Override
	public void doTag() throws IOException {
		String headers[]= {"Student Name","Class Name","Subject Name","Teacher Name"};
		JspWriter out=getJspContext().getOut();
		
		out.print("<table border='1px'>");
		out.print("<tr>");
		for(String header:headers) {
			out.print("<th>"+header+"</th>");
		}
		out.print("</tr>");
		for(Report report:repList) {
			out.print("<tr>");
			out.print("<td>"+report.getName()+"</td>");
			out.print("<td>"+report.getClassname()+"</td>");
			out.print("<td>"+report.getSubjectname()+"</td>");
			out.print("<td>"+report.getTeachername()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
		
	}

	
}
