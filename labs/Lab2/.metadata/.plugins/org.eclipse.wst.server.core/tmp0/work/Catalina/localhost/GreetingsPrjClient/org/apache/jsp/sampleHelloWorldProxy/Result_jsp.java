/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2016-02-15 10:41:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleHelloWorldProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      ie.lyit.webServices.HelloWorldProxy sampleHelloWorldProxyid = null;
      synchronized (session) {
        sampleHelloWorldProxyid = (ie.lyit.webServices.HelloWorldProxy) _jspx_page_context.getAttribute("sampleHelloWorldProxyid", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sampleHelloWorldProxyid == null){
          sampleHelloWorldProxyid = new ie.lyit.webServices.HelloWorldProxy();
          _jspx_page_context.setAttribute("sampleHelloWorldProxyid", sampleHelloWorldProxyid, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleHelloWorldProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleHelloWorldProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleHelloWorldProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        ie.lyit.webServices.HelloWorld getHelloWorld10mtemp = sampleHelloWorldProxyid.getHelloWorld();
if(getHelloWorld10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getHelloWorld10mtemp );
      out.write('\r');
      out.write('\n');

}else{
        if(getHelloWorld10mtemp!= null){
        String tempreturnp11 = getHelloWorld10mtemp.toString();
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp11);
      out.write("\r\n");
      out.write("        ");

        }}
break;
case 13:
        gotMethod = true;
        java.lang.String sayHelloWorld13mtemp = sampleHelloWorldProxyid.sayHelloWorld();
if(sayHelloWorld13mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(sayHelloWorld13mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHelloWorld13mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp14 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 16:
        gotMethod = true;
        String name_1id=  request.getParameter("name19");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String sayGoodbyePerson16mtemp = sampleHelloWorldProxyid.sayGoodbyePerson(name_1idTemp);
if(sayGoodbyePerson16mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(sayGoodbyePerson16mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayGoodbyePerson16mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp17 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 21:
        gotMethod = true;
        String name_2id=  request.getParameter("name24");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        java.lang.String sayHelloPerson21mtemp = sampleHelloWorldProxyid.sayHelloPerson(name_2idTemp);
if(sayHelloPerson21mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(sayHelloPerson21mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHelloPerson21mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp22 );
      out.write("\r\n");
      out.write("        ");

}
break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
