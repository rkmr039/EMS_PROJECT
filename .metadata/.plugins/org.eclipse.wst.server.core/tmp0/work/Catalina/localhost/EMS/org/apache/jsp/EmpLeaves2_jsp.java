/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2019-08-29 12:28:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hcl.ems.Employ;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import com.hcl.ems.EmsBal;
import java.util.List;
import com.hcl.ems.EmsDao;
import com.hcl.ems.Leaves;

public final class EmpLeaves2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1566913421617L));
    _jspx_dependants.put("jar:file:/C:/hcljava/EMS/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/EMS/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098691290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.hcl.ems.EmsBal");
    _jspx_imports_classes.add("com.hcl.ems.Leaves");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.hcl.ems.Employ");
    _jspx_imports_classes.add("org.apache.jasper.tagplugins.jstl.core.ForEach");
    _jspx_imports_classes.add("com.hcl.ems.EmsDao");
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
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/myLeaves.css\" /> \r\n");
      out.write("<style>\r\n");
      out.write("/* \t#applyButton{\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\t\r\n");
      out.write("\tright:30px;/* \r\n");
      out.write("\tborder:1px solid black; */ */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function checkOnlyOne(b){\r\n");
      out.write("\r\n");
      out.write("\tvar x = document.getElementsByClassName('daychecks');\r\n");
      out.write("\tvar i;\r\n");
      out.write("\r\n");
      out.write("\tfor (i = 0; i < x.length; i++) {\r\n");
      out.write("\t  if(x[i].value != b) x[i].checked = false;\r\n");
      out.write("\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"table-wrapper-scroll-y my-custom-scrollbar\">\r\n");
      out.write("\t<form method=\"post\" action=\"ApprovDenyLeaves.jsp\">\r\n");
      out.write("\t<table class=\"table table-striped mb-0\" border=\"1\" bordercolor=white>\r\n");
      out.write("\t\t");

		int mgrId = Integer.parseInt((String)session.getAttribute("EMP_ID"));
	 	List<Leaves> leaves = EmsBal.getEmployLeavesBal(mgrId);
	 	int idCurrent;
	 	int idPrevious = 0;
	 	for(Leaves l : leaves) {
	 		idCurrent = l.getEmpId();
	 		Employ e = EmsBal.getAccountInfoBal(l.getEmpId());
	 		if(!(idCurrent == idPrevious)) {
	 			
      out.write("\r\n");
      out.write("\t \t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">Employ ID:</th>");
out.println("<td>"+ l.getEmpId() +"</td>"); 
      out.write("\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">Employ Name:</th>");
out.println("<td colspan='2'>"+e.getEmpName()+"</td>");
      out.write("\r\n");
      out.write("\t\t\t\t\t<th colspan=\"4\">Employ Leave Balance:</th>");
out.println("<td colspan='2'>"+e.getEmpLeaveBalance()+"</td>"); 
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr class=\"table-primary\">\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\"></th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\">Leave ID:</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\">No of Days:</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\">Start Date</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\">End Date:</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">Leave Type</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"1\">Status:</th>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"3\">reason:</th>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t \t\t\t");
}
	 			if(l.getStatus().equals("APPROVED")) {
	 				out.println("<tr class='table-success'>");
	 			} else if(l.getStatus().equals("DENIED")) {
	 				out.println("<tr class='table-danger'>");
	 			}
	 			else {
	 				out.println("<tr>");
	 			}
	 				out.println("<th colspan='1'></th>");
		 			out.println("<td colspan='1'>"+ l.getLeaId() +"</td>");
		 			out.println("<td colspan='1'>"+l.getNoDays()+"</td>");
		 			out.println("<td colspan='1'>"+l.getStartDate()+"</td>");
		 			out.println("<td colspan='1'>"+l.getEndDate()+"</td>");
		 			out.println("<td colspan='2'>"+l.getType()+"</td>");
		 			out.println("<td colspan='1'>"+l.getStatus()+"</td>");
		 			out.println("<td colspan='3'>"+l.getReason()+"</td>");
		 			out.println("<td><input  class='daychecks' onclick='checkOnlyOne(this.value);' type='checkbox' name='leaveId' value='"+ l.getLeaId() +"'/></td>");
	 			out.println("</tr>"); 
	 			idPrevious = l.getEmpId();
	 	}
	 	
      out.write("\r\n");
      out.write("\t \t</table>\r\n");
      out.write("\t ");

	 	if(leaves.size() == 0) {
	 
      out.write("\t\r\n");
      out.write("\t <div id=\"applyButton\">\t\r\n");
      out.write("\t <input  class='btn btn-primary' disabled  onClick='javascript:window.location.href=\\\"ApprovDenyLeaves.jsp\\\"' type='submit' value='Approv / Deny' />\r\n");
      out.write("\t </div>\t");

	 } else {
      out.write("\r\n");
      out.write("\t <div id=\"applyButton\">\t\r\n");
      out.write("\t <input  class='btn btn-primary' onClick='javascript:window.location.href=\\\"ApprovDenyLeaves.jsp\\\"' type='submit' value='Approv / Deny' />\r\n");
      out.write("\t </div>\t\r\n");
      out.write("\t ");
}
      out.write("\r\n");
      out.write("\t </form>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\r\n");
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
