/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2016-11-06 05:41:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imghub_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Image Hub</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"hp.css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("  font-family: Verdana, sans-serif;\r\n");
      out.write("  margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("* {\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row > .column {\r\n");
      out.write("  padding: 0 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".row:after {\r\n");
      out.write("  content: \"\";\r\n");
      out.write("  display: table;\r\n");
      out.write("  clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".column {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width: 25%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Modal (background) */\r\n");
      out.write(".modal {\r\n");
      out.write("  display: none;\r\n");
      out.write("  position: fixed;\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("  padding-top: 100px;\r\n");
      out.write("  left: 0;\r\n");
      out.write("  top: 0;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  overflow: auto;\r\n");
      out.write("  background-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Modal Content */\r\n");
      out.write(".modal-content {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  background-color: #fefefe;\r\n");
      out.write("  margin: auto;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  width: 90%;\r\n");
      out.write("  max-width: 1200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The Close Button */\r\n");
      out.write(".close {\r\n");
      out.write("  color: white;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 10px;\r\n");
      out.write("  right: 25px;\r\n");
      out.write("  font-size: 35px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".close:hover,\r\n");
      out.write(".close:focus {\r\n");
      out.write("  color: #999;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".mySlides {\r\n");
      out.write("  display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cursor {\r\n");
      out.write("  cursor: pointer\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Next & previous buttons */\r\n");
      out.write(".prev,\r\n");
      out.write(".next {\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  width: auto;\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("  margin-top: -10px;\r\n");
      out.write("  color: white;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  font-size: 20px;\r\n");
      out.write("  transition: 0.6s ease;\r\n");
      out.write("  border-radius: 0 3px 3px 0;\r\n");
      out.write("  user-select: none;\r\n");
      out.write("  -webkit-user-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Position the \"next button\" to the right */\r\n");
      out.write(".next {\r\n");
      out.write("  right: 0;\r\n");
      out.write("  border-radius: 3px 0 0 3px;\r\n");
      out.write("}\r\n");
      out.write(".prev {\r\n");
      out.write("  left: 0;\r\n");
      out.write("  border-radius: 3px 0 0 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On hover, add a black background color with a little bit see-through */\r\n");
      out.write(".prev:hover,\r\n");
      out.write(".next:hover {\r\n");
      out.write("  background-color: rgba(0, 0, 0, 0.8);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Number text (1/3 etc) */\r\n");
      out.write(".numbertext {\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  font-size: 12px;\r\n");
      out.write("  padding: 8px 12px;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img {\r\n");
      out.write("  margin-bottom: -4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".caption-container {\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  background-color: black;\r\n");
      out.write("  padding: 2px 16px;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".demo {\r\n");
      out.write("  opacity: 0.6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active,\r\n");
      out.write(".demo:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img.hover-shadow {\r\n");
      out.write("  transition: 0.3s\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hover-shadow:hover {\r\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center>\r\n");
      out.write("<div style=\"font-size:140%;font-family:Comic Sans MS;\">\r\n");
      out.write("<header>\r\n");
      out.write("<section><a href=\"homepage.jsp\"><img src=\"h.png\"></a></section><h1>Image Hub</h1>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g1.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(1)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g2.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(2)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g3.gif\" style=\"width:100%\" onclick=\"openModal();currentSlide(3)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g4.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(4)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g5.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(5)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g6.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(6)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g7.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(7)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g8.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(8)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g9.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(9)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"column\">\r\n");
      out.write("    <img src=\"g10.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(10)\" class=\"hover-shadow cursor\">\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"myModal\" class=\"modal\">\r\n");
      out.write("  <span class=\"close cursor\" onclick=\"closeModal()\">&times;</span>\r\n");
      out.write("  <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">1 / 10</div>\r\n");
      out.write("      <img src=\"g1.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">2 / 10</div>\r\n");
      out.write("      <img src=\"g2.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">3 / 10</div>\r\n");
      out.write("      <img src=\"g3.gif\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">4 / 10</div>\r\n");
      out.write("      <img src=\"g4.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">5 / 10</div>\r\n");
      out.write("      <img src=\"g5.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">6 / 10</div>\r\n");
      out.write("      <img src=\"g6.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">7 / 10</div>\r\n");
      out.write("      <img src=\"g7.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">8 / 10</div>\r\n");
      out.write("      <img src=\"g8.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">9 / 10</div>\r\n");
      out.write("      <img src=\"g9.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mySlides\">\r\n");
      out.write("      <div class=\"numbertext\">10 / 10</div>\r\n");
      out.write("      <img src=\"g10.jpg\" style=\"width:100%\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("    <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\r\n");
      out.write("    <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"caption-container\">\r\n");
      out.write("      <p id=\"caption\"></p>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g1.jpg\" style=\"width:100%\" onclick=\"currentSlide(1)\" alt=\"Smarter Cities\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g2.jpg\" style=\"width:100%\" onclick=\"currentSlide(2)\" alt=\"Wine Tourism\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g3.gif\" style=\"width:100%\" onclick=\"currentSlide(3)\" alt=\"Indian Culture\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g4.jpg\" style=\"width:100%\" onclick=\"currentSlide(4)\" alt=\"Playback Theatre\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g5.jpg\" style=\"width:100%\" onclick=\"currentSlide(5)\" alt=\"ICT 2015\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g6.jpg\" style=\"width:100%\" onclick=\"currentSlide(6)\" alt=\"CCAI\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g7.jpg\" style=\"width:100%\" onclick=\"currentSlide(7)\" alt=\"TOURISM FOR PEACE & DEVELOPMENT \">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g8.jpg\" style=\"width:100%\" onclick=\"currentSlide(8)\" alt=\"HALAL TOURISM \">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g9.jpg\" style=\"width:100%\" onclick=\"currentSlide(9)\" alt=\"HAWAI TOURISM\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"column\">\r\n");
      out.write("      <img class=\"demo cursor\" src=\"g10.jpg\" style=\"width:100%\" onclick=\"currentSlide(10)\" alt=\"UNESCO-APIED\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function openModal() {\r\n");
      out.write("  document.getElementById('myModal').style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function closeModal() {\r\n");
      out.write("  document.getElementById('myModal').style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var slideIndex = 1;\r\n");
      out.write("showSlides(slideIndex);\r\n");
      out.write("\r\n");
      out.write("function plusSlides(n) {\r\n");
      out.write("  showSlides(slideIndex += n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function currentSlide(n) {\r\n");
      out.write("  showSlides(slideIndex = n);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function showSlides(n) {\r\n");
      out.write("  var i;\r\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\r\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\r\n");
      out.write("  var captionText = document.getElementById(\"caption\");\r\n");
      out.write("  if (n > slides.length) {slideIndex = 1}\r\n");
      out.write("  if (n < 1) {slideIndex = slides.length}\r\n");
      out.write("  for (i = 0; i < slides.length; i++) {\r\n");
      out.write("      slides[i].style.display = \"none\";\r\n");
      out.write("  }\r\n");
      out.write("  for (i = 0; i < dots.length; i++) {\r\n");
      out.write("      dots[i].className = dots[i].className.replace(\" active\", \"\");\r\n");
      out.write("  }\r\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";\r\n");
      out.write("  dots[slideIndex-1].className += \" active\";\r\n");
      out.write("  captionText.innerHTML = dots[slideIndex-1].alt;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</div>\r\n");
      out.write("</center>\r\n");
      out.write("<br/>\r\n");
      out.write("<footer>\r\n");
      out.write("Conference Hub\r\n");
      out.write("</footer>\r\n");
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