package org.apache.hadoop.hbase.generated.master;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import static org.apache.commons.lang.StringEscapeUtils.escapeXml;
import java.util.*;
import org.apache.hadoop.util.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.master.HMaster;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.HTableDescriptor;

public final class tablesDetailed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

  HMaster master = (HMaster)getServletContext().getAttribute(HMaster.MASTER);
  Configuration conf = master.getConfiguration();

      out.write("\n<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<html lang=\"en\">\n  <head>\n    <meta charset=\"utf-8\">\n    <title>HBase Master: ");
      out.print( master.getServerName() );
      out.write("</title>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <meta name=\"description\" content=\"\">\n    <meta name=\"author\" content=\"\">\n\n\n    <link href=\"/static/css/bootstrap.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/hbase.css\" rel=\"stylesheet\">\n    <link href=\"/static/css/bootstrap-responsive.css\" rel=\"stylesheet\">\n    <!--[if lt IE 9]>\n      <script src=\"/static/js/html5shiv.js\"></script>\n    <![endif]-->\n  </head>\n\n  <body>\n\n    <div class=\"navbar navbar-fixed-top\">\n      <div class=\"navbar-inner\">\n        <div class=\"container\">\n          <a class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n            <span class=\"icon-bar\"></span>\n          </a>\n          <a class=\"brand\" href=\"/master-status\"><img src=\"/static/hbase_logo_small.png\" alt=\"HBase Logo\"/></a>\n          <div class=\"nav-collapse\">\n            <ul class=\"nav\">\n                <li><a href=\"/master-status\">Home</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"/tablesDetailed.jsp\">Table Details</a></li>\n                <li><a href=\"/logs/\">Local logs</a></li>\n                <li><a href=\"/logLevel\">Log Level</a></li>\n                <li><a href=\"/dump\">Debug dump</a></li>\n                <li><a href=\"/jmx\">Metrics Dump</a></li>\n            </ul>\n          </div><!--/.nav-collapse -->\n        </div>\n      </div>\n    </div>\n\n    <div class=\"container\">\n    <div class=\"row inner_header\">\n        <div class=\"page-header\">\n            <h1>User Tables</h1>\n        </div>\n    </div>\n\n");
 HTableDescriptor[] tables = new HBaseAdmin(conf).listTables();
   if(tables != null && tables.length > 0) { 
      out.write("\n<table class=\"table table-striped\">\n<tr>\n    <th>Table</th>\n    <th>Description</th>\n</tr>\n");
   for(HTableDescriptor htDesc : tables ) { 
      out.write("\n<tr>\n    <td><a href=\"/table.jsp?name=");
      out.print( escapeXml(htDesc.getNameAsString()) );
      out.write('"');
      out.write('>');
      out.print( escapeXml(htDesc.getNameAsString()) );
      out.write("</a></td>\n    <td>");
      out.print( escapeXml(htDesc.toString()) );
      out.write("</td>\n</tr>\n");
   }  
      out.write("\n\n<p> ");
      out.print( tables.length );
      out.write(" table(s) in set.</p>\n</table>\n");
 } 
      out.write("\n</div>\n<script src=\"/static/js/jquery.min.js\" type=\"text/javascript\"></script>\n<script src=\"/static/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n\n</body>\n</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
