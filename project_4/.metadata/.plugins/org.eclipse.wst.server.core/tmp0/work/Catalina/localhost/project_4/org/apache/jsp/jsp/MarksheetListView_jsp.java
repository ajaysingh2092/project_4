/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2020-11-07 07:23:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.project_4.ctl.MarksheetListCtl;
import in.co.rays.project_4.ctl.BaseCtl;
import in.co.rays.project_4.util.ServletUtility;
import in.co.rays.project_4.util.HTMLUtility;
import in.co.rays.project_4.util.DataUtility;
import in.co.rays.project_4.bean.MarksheetBean;
import java.util.List;
import java.util.Iterator;
import in.co.rays.project_4.bean.RoleBean;
import in.co.rays.project_4.ctl.LoginCtl;
import in.co.rays.project_4.bean.UserBean;
import in.co.rays.project_4.ctl.ORSView;

public final class MarksheetListView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.project_4.util.DataUtility");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.project_4.bean.MarksheetBean");
    _jspx_imports_classes.add("in.co.rays.project_4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.project_4.bean.RoleBean");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.BaseCtl");
    _jspx_imports_classes.add("in.co.rays.project_4.ctl.MarksheetListCtl");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Marksheet List View</title>\r\n");
      out.write("<script src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/js/CheckBox11.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".p1 {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".p2 {\r\n");
      out.write("\tpadding: 4px;\r\n");
      out.write("\tmargin: 2px;\r\n");
      out.write("}\r\n");
      out.write(".footer{\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tleft:  0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
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
      out.write("\t<center>\r\n");
      out.write("\t<h1 style=\"font-size: 40px;\">Marksheet List</h1>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<font color=\"red\" size=\"5px\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t<font color=\"green\" size=\"5px\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t\t");
      in.co.rays.project_4.bean.MarksheetBean bean = null;
      bean = (in.co.rays.project_4.bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.project_4.bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");

		List list1=(List)request.getAttribute("RollNo");	
		
      out.write("\r\n");
      out.write("\t<form action=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL );
      out.write("\"method=\"post\">\r\n");
      out.write("\t");

	     int pageNo=ServletUtility.getPageNo(request);
	     int pageSize=ServletUtility.getPageSize(request);
	     int index=((pageNo-1)*pageSize)+1;
	     int nextPageSize = DataUtility.getInt(request.getAttribute("nextListSize").toString());
	     
	     List list=ServletUtility.getList(request);
	     Iterator<MarksheetBean> it=list.iterator();
	     if (list.size() != 0) {
     
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<table width=\"100%\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td align=\"center\"><label class=\"p1\">RollNo : </label> ");
      out.print(HTMLUtility.getList("rollId", String.valueOf(bean.getId()), list1));
      out.write("&emsp;\r\n");
      out.write("\t\t  <label class=\"p1\"> Student Name :</label> <input type=\"text\" class=\"p2\" name=\"name\" value=\"");
      out.print(ServletUtility.getParameter("name", request));
      out.write("\">&emsp;\r\n");
      out.write("\t\t  <input type=\"submit\" name=\"operation\" style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_SEARCH);
      out.write("\">\r\n");
      out.write("\t\t  <input type=\"submit\" name=\"operation\"\tstyle=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_RESET);
      out.write("\" ></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t</table><br>\r\n");
      out.write("\t<table border=\"1\" width=\"100%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t   <th width=\"10%\"><input type=\"checkbox\" id=\"select_all\" name=\"Select\"> Select All</th>\r\n");
      out.write("\t   <th>S.NO</th>\r\n");
      out.write("\t   <th>RollNo</th>\r\n");
      out.write("\t   <th>Name</th>\r\n");
      out.write("\t   <th>Physics</th>\r\n");
      out.write("\t   <th>Chemistry</th>\r\n");
      out.write("\t   <th>Maths</th>\r\n");
      out.write("\t   <th>Edit</th>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("\t   ");
      out.write("\r\n");
      out.write("\t     \r\n");
      out.write("\t    ");
 
	     while(it.hasNext()){
	    	 
	     bean=it.next();
	     
	     
      out.write("\r\n");
      out.write("\t     <tr>\r\n");
      out.write("\t       <td align=\"center\"><input type=\"checkbox\" name=\"ids\" class=\"checkbox\" value=\"");
      out.print(bean.getId());
      out.write("\"></td>\r\n");
      out.write("\t       <td align=\"center\">");
      out.print(index++);
      out.write("</td>\r\n");
      out.write("\t       <td align=\"center\">");
      out.print(bean.getRollNo() );
      out.write("</td>\r\n");
      out.write("\t   \t\t<td align=\"center\">");
      out.print(bean.getName() );
      out.write("</td>\r\n");
      out.write("\t   \t\t<td align=\"center\">");
      out.print(bean.getPhysics() );
      out.write("</td>\r\n");
      out.write("\t   \t\t<td align=\"center\">");
      out.print(bean.getChemistry() );
      out.write("</td>\r\n");
      out.write("\t   \t\t<td align=\"center\">");
      out.print(bean.getMaths() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"center\"><a href=\"MarksheetCtl?id=");
      out.print(bean.getId());
      out.write("\">Edit</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

	    	 }
			
      out.write("\t   \r\n");
      out.write("\t</table>\r\n");
      out.write("\t<table width=\"100%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t  <td><input type=\"submit\" name=\"operation\"  style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_PREVIOUS);
      out.write('"');
      out.print(pageNo > 1 ? "" : "disabled");
      out.write("></td>\r\n");
      out.write("\t  <td><input type=\"submit\" name=\"operation\"  style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_NEW);
      out.write("\">  </td>\r\n");
      out.write("\t <td><input type=\"submit\" name=\"operation\"  style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_DELETE);
      out.write("\"> </td>\r\n");
      out.write("\t <td><input type=\"submit\" name=\"operation\" style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_BACK );
      out.write("\"></td>\r\n");
      out.write("\t <td align=\"right\"><input type=\"submit\" name=\"operation\"  style=\"padding: 5px;\" value=\"");
      out.print(MarksheetListCtl.OP_NEXT);
      out.write('"');
      out.print((nextPageSize != 0) ? "" : "disabled");
      out.write("> </td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\t");

	     	}
				if (list.size() == 0) {
			
      out.write("\r\n");
      out.write("\t\t\t<br><br>\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_BACK);
      out.write("\">\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("<hr>\r\n");
      out.write("<center> \r\n");
      out.write("  <h4>\r\n");
      out.write("  \t<i><b>&#169;RAYS Technologies</b></i></div></h4>\r\n");
      out.write("  </center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
