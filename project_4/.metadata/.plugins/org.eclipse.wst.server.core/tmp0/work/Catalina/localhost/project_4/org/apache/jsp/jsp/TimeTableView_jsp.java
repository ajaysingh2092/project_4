/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2020-10-22 02:30:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_4.ctl.TimeTableCtl;
import in.co.rays.project_4.ctl.SubjectCtl;
import java.util.HashMap;
import in.co.rays.project_4.util.HTMLUtility;
import java.util.List;
import in.co.rays.project_4.util.DataUtility;
import in.co.rays.project_4.util.ServletUtility;
import in.co.rays.project_4.bean.RoleBean;
import in.co.rays.project_4.ctl.LoginCtl;
import in.co.rays.project_4.bean.UserBean;
import in.co.rays.project_4.ctl.ORSView;

public final class TimeTableView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1601878666451L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.ORSView");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.TimeTableCtl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_4.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.SubjectCtl");
    _jspx_imports_classes.add("in.co.rays.project_4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.project_4.bean.RoleBean");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.rays.project_4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.project_4.bean.UserBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Time Table View</title>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".p1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p2 {\r\n");
      out.write("\tpadding: 5px;\r\n");
      out.write("\tmargin: 3px;\r\n");
      out.write("}\r\n");
      out.write(".footer{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tleft:  0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("var d = new Date();\r\n");
      out.write("function disableSunday(d){\r\n");
      out.write("\t  var day = d.getDay();\r\n");
      out.write("\t  if(day==0)\r\n");
      out.write("\t  {\r\n");
      out.write("\t   return [false];\r\n");
      out.write("\t  }else\r\n");
      out.write("\t  {\r\n");
      out.write("\t\t  return [true];\r\n");
      out.write("\t  }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("$( function() {\r\n");
      out.write("\t  $( \"#datepicker\" ).datepicker({\r\n");
      out.write("\t\t  changeMonth :true,\r\n");
      out.write("\t\t  changeYear :true,\r\n");
      out.write("\t\t  yearRange :'1980:2030',\r\n");
      out.write("\t\t  dateFormat:'dd/mm/yy',\r\n");
      out.write("\t\t  minDate:0,\r\n");
      out.write("\t\t  beforeShowDay : disableSunday\r\n");
      out.write("\t\t  \r\n");
      out.write("\t  });\r\n");
      out.write("} );\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\" method=\"POST\">\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <title>jQuery UI Datepicker - Display month &amp; year menus</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#datepicker\" ).datepicker({\r\n");
      out.write("      changeMonth: true,\r\n");
      out.write("      changeYear: true,\r\n");
      out.write("      yearRange : '1970:2030'\r\n");
      out.write("    });\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#datepicker\" ).datepicker();\r\n");
      out.write("  } );\r\n");
      out.write("  </script> -->\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

    UserBean userBean = (UserBean) session.getAttribute("user");

    boolean userLoggedIn = userBean != null;

    String welcomeMsg = "Hi, ";

    if (userLoggedIn) {
        String role = (String) session.getAttribute("role");
        welcomeMsg += userBean.getFirstName() + " (" + role + ")";
    } else {
        welcomeMsg += "Guest";
    }

      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" border=\"0\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td width=\"90%\" ><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a> |\r\n");
      out.write("            ");

            if (userLoggedIn) {
        
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("            ");

                } else {
            
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> ");

     }
 
      out.write("</td>\r\n");
      out.write("        <td rowspan=\"2\">\r\n");
      out.write("            \r\n");
      out.write("   \t\t<center>         \r\n");
      out.write("            <!-- <img alt=\"Ajay\" src=\"rays.png\"> -->\r\n");
      out.write("             <h1 align=\"right\">   <img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/image/rays.png\" width=\"318\"\r\n");
      out.write("                    height=\"90\"></h1>\r\n");
      out.write("            </center>\r\n");
      out.write("        </td> \r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr>\r\n");
      out.write("        <td >\r\n");
      out.write("            <h3>\r\n");
      out.write("                ");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("        </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    ");

        if (userLoggedIn) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td colspan=\"2\" >\r\n");
      out.write("        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> |\r\n");
      out.write("            <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet Merit\r\n");
      out.write("                List</b>\r\n");
      out.write("        </a> | <a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a>    ");

            if (userBean.getRoleId() == RoleBean.ADMIN) {
        
      out.write("| <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("            <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |<a\r\n");
      out.write("\t\t\t\thref=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</b></a> | <a\r\n");
      out.write("            href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</b></a>| <a\r\n");
      out.write("\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</b></a>| <a\r\n");
      out.write("\t\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</b></a> | <a\r\n");
      out.write("\t\t\t\thref=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\">Java Doc</b></a> |  ");

     }
 
      out.write("</td>\r\n");
      out.write("    \r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

        }
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t\t");
      in.co.rays.project_4.bean.TimeTableBean bean = null;
      bean = (in.co.rays.project_4.bean.TimeTableBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.project_4.bean.TimeTableBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\"> \r\n");
      out.write("\t\t<input type=\"hidden\" name=\"createdBy\" value=\"");
      out.print(bean.getCreatedBy());
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"modifiedBy\" value=\"");
      out.print(bean.getModifiedBy());
      out.write("\">\r\n");
      out.write("\t    <input type=\"hidden\" name=\"createdDatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDateTime()));
      out.write("\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"modifiedDatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDateTime()));
      out.write("\">\r\n");
      out.write("\t\t\t");

				List l = (List) request.getAttribute("courseList");
				List li = (List) request.getAttribute("subjectList");
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				if (bean.getId() > 0) {
			
      out.write("\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 40px;\">Update TimeTable</h1>\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write("\r\n");
      out.write("\t\t\t<h1 style=\"font-size: 40px;\">Add TimeTable</h1>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<h2>\r\n");
      out.write("\t\t\t\t<font color=\"green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t\t</h2>\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Course<span style=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(HTMLUtility.getList("courseId", String.valueOf(bean.getCourseId()), l));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("courseId", request));
      out.write("</font></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Subject<span style=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(HTMLUtility.getList("subjectId", String.valueOf(bean.getSubId()), li));
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("subjectId", request));
      out.write("</font></td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Semester<span style=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");

							HashMap map = new HashMap();
							map.put("1", "1");
							map.put("2", "2");
							map.put("3", "3");
							map.put("4", "4");
							map.put("5", "5");
							map.put("6", "6");
							map.put("7", "7");
							map.put("8", "8");
							map.put("9", "9");
							map.put("10", "10");
							String htmlList = HTMLUtility.getList("semesterId", bean.getSemester(), map);
						
      out.print(htmlList);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("semesterId", request));
      out.write("</font></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Exam Date<span style=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"examDate\" id=\"datepicker\" size=\"40\" class=\"p2\"\r\n");
      out.write("\t\t\t\t\t\t readonly=\"readonly\" placeholder=\"Enter Exam Date\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(DataUtility.getDateString(bean.getExamDate()));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("examDate", request));
      out.write("</font></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Exam Time<span style=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t");

							HashMap map1 = new HashMap();
							map1.put("08:00 AM to 11:00 AM", "08:00 AM to 11:00 AM");
							map1.put("12:00PM to 3:00PM", "12:00PM to 3:00PM");
							map1.put("3:00PM to 6:00PM", "3:00PM to 6:00PM");
							String examList = HTMLUtility.getList("examId", bean.getExamTime(), map1);
						
      out.print(examList);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("examId", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\" class=\"p1\">Description<span\r\n");
      out.write("\t\t\t\t\t\tstyle=\"color: red;\">*</span></th>\r\n");
      out.write("\t\t\t\t\t<td><textarea name=\"description\" placeholder=\"enter Description\" style=\"width: 320px;height:50px; resize: none;\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(DataUtility.getStringData(bean.getDescription()));
      out.write("</textarea></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("description", request));
      out.write("</font>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					if (bean.getId() > 0) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tname=\"operation\" style=\"padding: 5px;\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(TimeTableCtl.OP_UPDATE);
      out.write("\">&emsp; <input\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: 5px;\" type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(TimeTableCtl.OP_CANCEL);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\" align=\"center\"><input type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\tname=\"operation\" style=\"padding: 5px;\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(TimeTableCtl.OP_SAVE);
      out.write("\">&emsp; <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"submit\" name=\"operation\" value=\"");
      out.print(TimeTableCtl.OP_RESET);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"padding: 5px;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("<hr>\r\n");
      out.write("<center> \r\n");
      out.write("  <h4>\r\n");
      out.write("  \t<i><b>&#169;RAYS Technologies</b></i></div></h4>\r\n");
      out.write("  </center>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
