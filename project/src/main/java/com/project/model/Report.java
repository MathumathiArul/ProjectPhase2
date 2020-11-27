package com.project.model;

public class Report {
	private String name;
	private String classname;
	private String subjectname;
	private String teachername;
	
	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getTeachername() {
		return teachername;
	}

	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	public Report() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}


	public Report(String name, String classname, String subjectname,String teachername) {
		super();
		this.name = name;
		this.classname = classname;
		this.subjectname = subjectname;
		this.teachername=teachername;
	}

	

}
