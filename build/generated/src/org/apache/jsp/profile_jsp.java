package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:contains", org.apache.taglibs.standard.functions.Functions.class, "contains", new Class[] {java.lang.String.class, java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/jspf/header.jspf");
    _jspx_dependants.add("/WEB-INF/jspf/footer.jspf");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");

    String isLogin = (String) session.getAttribute("isLogin") ; 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- CSS Files -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"img/icon/apple.ico\" />\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/footer.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/header.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/component.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/web/assets/mobirise-icons/mobirise-icons.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/dropdown/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/theme/css/style.css\">\r\n");
      out.write("    <link rel=\"preload\" as=\"style\" href=\"assets/mobirise/css/mbr-additional.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/mobirise/css/mbr-additional.css\" type=\"text/css\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- JS Files -->\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <script src=\"js/09c5070f41.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\"></script>-->\r\n");
      out.write("  \r\n");
      out.write("        <title>Apple</title>\r\n");
      out.write("        <style>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("          .sticky {\r\n");
      out.write("            width: 100%\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          .fixed {\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top:0;\r\n");
      out.write("          }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <div id=\"sticky\" class=\"sticky\">\r\n");
      out.write("                <br><br>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"menu-container\">\r\n");
      out.write("                <!-- Menu -->\r\n");
      out.write("                <ul class=\"menu\">\r\n");
      out.write("                    <li class=\"menu-apple\">\r\n");
      out.write("                    <a href=\"index.jsp\">\r\n");
      out.write("                        <i class=\"fab fa-apple\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-mac\">\r\n");
      out.write("                    <a href=\"category?1\">\r\n");
      out.write("                        <span>Mac</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-iPad\">\r\n");
      out.write("                    <a href=\"category?2\">\r\n");
      out.write("                        <span>iPad</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-iPhone\">\r\n");
      out.write("                    <a href=\"category?3\">\r\n");
      out.write("                        <span>iPhone</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-watch\">\r\n");
      out.write("                    <a href=\"category?4\">\r\n");
      out.write("                        <span>Watch</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-tv\">\r\n");
      out.write("                    <a href=\"category?5\">\r\n");
      out.write("                        <span>TV</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    <li class=\"menu-search\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"menu-store\">\r\n");
      out.write("                    <a href=\"viewCart\">\r\n");
      out.write("                        <i class=\"fas fa-cart-plus\"></i> \r\n");
      out.write("                        <span> \r\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("                        <!-- check out --> \r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                   \r\n");
      out.write("                    </li> \r\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Search -->\r\n");
      out.write("                <div class=\"menu-search-container\">\r\n");
      out.write("                    <div class=\"menu-search-input\">\r\n");
      out.write("                    <form action=\"search\" method=\"get\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <input name=\"search\" class=\"menu-search-input\" type=\"text\" aria-label=\"Search apple.com\" placeholder=\"Search apple.com\" autocorrect=\"off\" autocapitalize=\"off\" autocomplete=\"off\" spellcheck=\"false\">\r\n");
      out.write("                    </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a class=\"menu-search-close\" href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-close\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </a> \r\n");
      out.write("                    <div class=\"search-sub-menu\">\r\n");
      out.write("                    <h3>Quick Links</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                    <li><a href=\"category?1\">Mac</a></li>\r\n");
      out.write("                    <li><a href=\"category?2\">iPad</a></li>\r\n");
      out.write("                    <li><a href=\"category?3\">iPhone</a></li>\r\n");
      out.write("                    <li><a href=\"category?4\">Watch</a></li>\r\n");
      out.write("                    <li><a href=\"category?5\">TV</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div class=\"fade-screen\"></div>\r\n");
      out.write("            <script src=\"https://static.codepen.io/assets/common/stopExecutionOnTimeout-de7e2ef6bfefd24b79a3f68b414b87b8db5b08439cac3f1012092b2290c719cd.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("            <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>\r\n");
      out.write("            <script id=\"rendered-js\" >\r\n");
      out.write("                (function () {\r\n");
      out.write("        \r\n");
      out.write("            'use strict';\r\n");
      out.write("        \r\n");
      out.write("            var $searchView = $('.menu-search-container');\r\n");
      out.write("            var $menu = $('.menu-mac, .menu-iPad, .menu-iPhone, .menu-watch, .menu-tv, .menu-support, .menu-search, .menu-store');\r\n");
      out.write("            var $fadeScreen = $('.fade-screen');\r\n");
      out.write("        \r\n");
      out.write("            $('li.menu-search a, .fade-screen, .menu-search-close').on('click', function (e) {\r\n");
      out.write("        \r\n");
      out.write("            $searchView.toggleClass('active');\r\n");
      out.write("        \r\n");
      out.write("            setTimeout(function () {\r\n");
      out.write("                $searchView.children().find('input').focus();\r\n");
      out.write("            }, 1100);\r\n");
      out.write("        \r\n");
      out.write("            $fadeScreen.toggleClass('visible');\r\n");
      out.write("            $menu.removeClass('is-closed');\r\n");
      out.write("            $menu.toggleClass('hidden');\r\n");
      out.write("        \r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            });\r\n");
      out.write("        \r\n");
      out.write("            $('.fade-screen,.menu-search-close').on('click', function (e) {\r\n");
      out.write("            $menu.toggleClass('is-closed');\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("            });\r\n");
      out.write("        \r\n");
      out.write("        })();\r\n");
      out.write("                //# sourceURL=pen.js\r\n");
      out.write("        </script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function findOffset(element) {\r\n");
      out.write("        var top = 0, left = 0;\r\n");
      out.write("\r\n");
      out.write("        do {\r\n");
      out.write("          top += element.offsetTop  || 0;\r\n");
      out.write("          left += element.offsetLeft || 0;\r\n");
      out.write("          element = element.offsetParent;\r\n");
      out.write("        } while(element);\r\n");
      out.write("\r\n");
      out.write("        return {\r\n");
      out.write("          top: top,\r\n");
      out.write("          left: left\r\n");
      out.write("        };\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      window.onload = function () {\r\n");
      out.write("        var stickyHeader = document.getElementById('sticky');\r\n");
      out.write("        var headerOffset = findOffset(stickyHeader);\r\n");
      out.write("\r\n");
      out.write("        window.onscroll = function() {\r\n");
      out.write("          // body.scrollTop is deprecated and no longer available on Firefox\r\n");
      out.write("          var bodyScrollTop = document.documentElement.scrollTop || document.body.scrollTop;\r\n");
      out.write("\r\n");
      out.write("          if (bodyScrollTop > headerOffset.top) {\r\n");
      out.write("            stickyHeader.classList.add('fixed');\r\n");
      out.write("          } else {\r\n");
      out.write("            stickyHeader.classList.remove('fixed');\r\n");
      out.write("          }\r\n");
      out.write("        };\r\n");
      out.write("      };\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<link class=\"jsbin\" href=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/base/jquery-ui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<script class=\"jsbin\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"></script>\r\n");
      out.write("<script class=\"jsbin\" src=\"http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("  article, aside, figure, footer, header, hgroup, \r\n");
      out.write("  menu, nav, section { display: block; }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding-left: 80px\"> \r\n");
      out.write("    <img src=\"img/store.jpg\" width=\"20%\">\r\n");
      out.write("    <div style=\"padding-bottom: 20px\"></div>\r\n");
      out.write("    <div class=\"one\">\r\n");
      out.write("        <div class=\"heading_bg\">\r\n");
      out.write("            <h2>Profiler</h2><hr>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div><br><br><br><br>\r\n");
      out.write("    <div class=\"one-half\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("<br>\r\n");
      out.write("        <form action=\"index.jsp\">\r\n");
      out.write("            <input type=\"file\" onchange=\"preview_image(event)\" name=\"image1\" id=\"Myname1\" value=\"change\" class=\"text requiredField\">\r\n");
      out.write("            <input type=\"submit\" hidden=\"true\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"one-half last\">\r\n");
      out.write("        <strong>Name : </strong><br>\r\n");
      out.write("        <span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><br>\r\n");
      out.write("        <strong> Information : </strong><br>\r\n");
      out.write("        <span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getInfo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span><button>change</button><br><br>\r\n");
      out.write("        \r\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div style=\"padding-bottom: 500px\"></div>\r\n");
      out.write("    <script>\r\n");
      out.write("        function readURL(input) {\r\n");
      out.write("            if (input.files && input.files[0]) {\r\n");
      out.write("                var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("                reader.onload = function (e) {\r\n");
      out.write("                    $('#blah')\r\n");
      out.write("                        .attr('src', e.target.result)\r\n");
      out.write("                        .width(150)\r\n");
      out.write("                        .height(200);\r\n");
      out.write("                };\r\n");
      out.write("\r\n");
      out.write("                reader.readAsDataURL(input.files[0]);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"social-media-links\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("          <!-- twitter -->\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <svg class=\"glow\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M9.5 27.1c11.2 0 17.4-9.3 17.4-17.4 0-0.3 0-0.5 0-0.8 1.2-0.9 2.2-1.9 3-3.2 -1.1 0.5-2.3 0.8-3.5 1 1.3-0.8 2.2-2 2.7-3.4 -1.2 0.7-2.5 1.2-3.9 1.5 -1.1-1.2-2.7-1.9-4.5-1.9 -3.4 0-6.1 2.7-6.1 6.1 0 0.5 0.1 0.9 0.2 1.4C9.7 10.1 5.2 7.7 2.2 4 1.7 4.9 1.4 6 1.4 7.1c0 2.1 1.1 4 2.7 5.1 -1 0-1.9-0.3-2.8-0.8 0 0 0 0.1 0 0.1 0 3 2.1 5.4 4.9 6 -0.5 0.1-1.1 0.2-1.6 0.2 -0.4 0-0.8 0-1.1-0.1 0.8 2.4 3 4.2 5.7 4.2 -2.1 1.6-4.7 2.6-7.6 2.6 -0.5 0-1 0-1.5-0.1C2.8 26.1 6 27.1 9.5 27.1\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M9.5 27.1c11.2 0 17.4-9.3 17.4-17.4 0-0.3 0-0.5 0-0.8 1.2-0.9 2.2-1.9 3-3.2 -1.1 0.5-2.3 0.8-3.5 1 1.3-0.8 2.2-2 2.7-3.4 -1.2 0.7-2.5 1.2-3.9 1.5 -1.1-1.2-2.7-1.9-4.5-1.9 -3.4 0-6.1 2.7-6.1 6.1 0 0.5 0.1 0.9 0.2 1.4C9.7 10.1 5.2 7.7 2.2 4 1.7 4.9 1.4 6 1.4 7.1c0 2.1 1.1 4 2.7 5.1 -1 0-1.9-0.3-2.8-0.8 0 0 0 0.1 0 0.1 0 3 2.1 5.4 4.9 6 -0.5 0.1-1.1 0.2-1.6 0.2 -0.4 0-0.8 0-1.1-0.1 0.8 2.4 3 4.2 5.7 4.2 -2.1 1.6-4.7 2.6-7.6 2.6 -0.5 0-1 0-1.5-0.1C2.8 26.1 6 27.1 9.5 27.1\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <!-- facebook -->\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <svg class=\"glow\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M28.3 0.1H1.7c-0.9 0-1.6 0.7-1.6 1.6v26.5c0 0.9 0.7 1.6 1.6 1.6H16V18.4h-3.9v-4.5H16v-3.3c0-3.9 2.4-5.9 5.8-5.9 1.6 0 3.1 0.1 3.5 0.2v4l-2.4 0c-1.9 0-2.2 0.9-2.2 2.2v2.9h4.5l-0.6 4.5h-3.9v11.5h7.6c0.9 0 1.6-0.7 1.6-1.6V1.7C29.9 0.8 29.2 0.1 28.3 0.1z\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M28.3 0.1H1.7c-0.9 0-1.6 0.7-1.6 1.6v26.5c0 0.9 0.7 1.6 1.6 1.6H16V18.4h-3.9v-4.5H16v-3.3c0-3.9 2.4-5.9 5.8-5.9 1.6 0 3.1 0.1 3.5 0.2v4l-2.4 0c-1.9 0-2.2 0.9-2.2 2.2v2.9h4.5l-0.6 4.5h-3.9v11.5h7.6c0.9 0 1.6-0.7 1.6-1.6V1.7C29.9 0.8 29.2 0.1 28.3 0.1z\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <!-- youtube -->\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <svg class=\"glow\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M29.7 9c0 0-0.3-2.1-1.2-3 -1.1-1.2-2.4-1.2-3-1.3C21.3 4.5 15 4.5 15 4.5h0c0 0-6.3 0-10.5 0.3C3.9 4.8 2.6 4.8 1.5 6 0.6 6.9 0.3 9 0.3 9S0 11.4 0 13.9v2.3C0 18.6 0.3 21 0.3 21s0.3 2.1 1.2 3c1.1 1.2 2.6 1.2 3.3 1.3C7.2 25.5 15 25.6 15 25.6s6.3 0 10.5-0.3c0.6-0.1 1.9-0.1 3-1.3 0.9-0.9 1.2-3 1.2-3s0.3-2.4 0.3-4.9v-2.3C30 11.4 29.7 9 29.7 9zM11.9 18.9l0-8.4 8.1 4.2L11.9 18.9z\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M29.7 9c0 0-0.3-2.1-1.2-3 -1.1-1.2-2.4-1.2-3-1.3C21.3 4.5 15 4.5 15 4.5h0c0 0-6.3 0-10.5 0.3C3.9 4.8 2.6 4.8 1.5 6 0.6 6.9 0.3 9 0.3 9S0 11.4 0 13.9v2.3C0 18.6 0.3 21 0.3 21s0.3 2.1 1.2 3c1.1 1.2 2.6 1.2 3.3 1.3C7.2 25.5 15 25.6 15 25.6s6.3 0 10.5-0.3c0.6-0.1 1.9-0.1 3-1.3 0.9-0.9 1.2-3 1.2-3s0.3-2.4 0.3-4.9v-2.3C30 11.4 29.7 9 29.7 9zM11.9 18.9l0-8.4 8.1 4.2L11.9 18.9z\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("          <!-- instagram -->\r\n");
      out.write("          <a href=\"#\">\r\n");
      out.write("            <svg class=\"glow\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M15 2.8c4 0 4.4 0 6 0.1 1.4 0.1 2.2 0.3 2.8 0.5 0.7 0.3 1.2 0.6 1.7 1.1 0.5 0.5 0.8 1 1.1 1.7C26.8 6.8 27 7.6 27.1 9c0.1 1.6 0.1 2 0.1 6s0 4.4-0.1 6c-0.1 1.4-0.3 2.2-0.5 2.8 -0.3 0.7-0.6 1.2-1.1 1.7 -0.5 0.5-1 0.8-1.7 1.1 -0.5 0.2-1.3 0.4-2.8 0.5 -1.6 0.1-2 0.1-6 0.1s-4.4 0-6-0.1c-1.4-0.1-2.2-0.3-2.8-0.5 -0.7-0.3-1.2-0.6-1.7-1.1 -0.5-0.5-0.8-1-1.1-1.7C3.2 23.2 3 22.4 2.9 21c-0.1-1.6-0.1-2-0.1-6s0-4.4 0.1-6C3 7.6 3.2 6.8 3.4 6.2 3.7 5.5 4 5.1 4.5 4.5c0.5-0.5 1-0.8 1.7-1.1C6.8 3.2 7.6 3 9 2.9 10.6 2.8 11 2.8 15 2.8M15 0.2c-4 0-4.5 0-6.1 0.1C7.3 0.3 6.2 0.6 5.3 0.9c-1 0.4-1.8 0.9-2.6 1.7C1.8 3.5 1.3 4.3 0.9 5.3c-0.4 0.9-0.6 2-0.7 3.6C0.2 10.5 0.1 11 0.1 15c0 4 0 4.5 0.1 6.1 0.1 1.6 0.3 2.7 0.7 3.6 0.4 1 0.9 1.8 1.7 2.6 0.8 0.8 1.7 1.3 2.6 1.7 0.9 0.4 2 0.6 3.6 0.7 1.6 0.1 2.1 0.1 6.1 0.1s4.5 0 6.1-0.1c1.6-0.1 2.7-0.3 3.6-0.7 1-0.4 1.8-0.9 2.6-1.7 0.8-0.8 1.3-1.7 1.7-2.6 0.4-0.9 0.6-2 0.7-3.6 0.1-1.6 0.1-2.1 0.1-6.1s0-4.5-0.1-6.1c-0.1-1.6-0.3-2.7-0.7-3.6 -0.4-1-0.9-1.8-1.7-2.6 -0.8-0.8-1.7-1.3-2.6-1.7 -0.9-0.4-2-0.6-3.6-0.7C19.5 0.2 19 0.2 15 0.2L15 0.2z\"/>\r\n");
      out.write("              <path class=\"st0\" d=\"M15 7.4c-4.2 0-7.6 3.4-7.6 7.6s3.4 7.6 7.6 7.6 7.6-3.4 7.6-7.6S19.2 7.4 15 7.4zM15 20c-2.7 0-5-2.2-5-5s2.2-5 5-5c2.7 0 5 2.2 5 5S17.7 20 15 20z\"/>\r\n");
      out.write("              <circle class=\"st0\" cx=\"22.9\" cy=\"7.1\" r=\"1.8\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("            <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 30 30\">\r\n");
      out.write("              <path class=\"st0\" d=\"M15 2.8c4 0 4.4 0 6 0.1 1.4 0.1 2.2 0.3 2.8 0.5 0.7 0.3 1.2 0.6 1.7 1.1 0.5 0.5 0.8 1 1.1 1.7C26.8 6.8 27 7.6 27.1 9c0.1 1.6 0.1 2 0.1 6s0 4.4-0.1 6c-0.1 1.4-0.3 2.2-0.5 2.8 -0.3 0.7-0.6 1.2-1.1 1.7 -0.5 0.5-1 0.8-1.7 1.1 -0.5 0.2-1.3 0.4-2.8 0.5 -1.6 0.1-2 0.1-6 0.1s-4.4 0-6-0.1c-1.4-0.1-2.2-0.3-2.8-0.5 -0.7-0.3-1.2-0.6-1.7-1.1 -0.5-0.5-0.8-1-1.1-1.7C3.2 23.2 3 22.4 2.9 21c-0.1-1.6-0.1-2-0.1-6s0-4.4 0.1-6C3 7.6 3.2 6.8 3.4 6.2 3.7 5.5 4 5.1 4.5 4.5c0.5-0.5 1-0.8 1.7-1.1C6.8 3.2 7.6 3 9 2.9 10.6 2.8 11 2.8 15 2.8M15 0.2c-4 0-4.5 0-6.1 0.1C7.3 0.3 6.2 0.6 5.3 0.9c-1 0.4-1.8 0.9-2.6 1.7C1.8 3.5 1.3 4.3 0.9 5.3c-0.4 0.9-0.6 2-0.7 3.6C0.2 10.5 0.1 11 0.1 15c0 4 0 4.5 0.1 6.1 0.1 1.6 0.3 2.7 0.7 3.6 0.4 1 0.9 1.8 1.7 2.6 0.8 0.8 1.7 1.3 2.6 1.7 0.9 0.4 2 0.6 3.6 0.7 1.6 0.1 2.1 0.1 6.1 0.1s4.5 0 6.1-0.1c1.6-0.1 2.7-0.3 3.6-0.7 1-0.4 1.8-0.9 2.6-1.7 0.8-0.8 1.3-1.7 1.7-2.6 0.4-0.9 0.6-2 0.7-3.6 0.1-1.6 0.1-2.1 0.1-6.1s0-4.5-0.1-6.1c-0.1-1.6-0.3-2.7-0.7-3.6 -0.4-1-0.9-1.8-1.7-2.6 -0.8-0.8-1.7-1.3-2.6-1.7 -0.9-0.4-2-0.6-3.6-0.7C19.5 0.2 19 0.2 15 0.2L15 0.2z\"/>\r\n");
      out.write("              <path class=\"st0\" d=\"M15 7.4c-4.2 0-7.6 3.4-7.6 7.6s3.4 7.6 7.6 7.6 7.6-3.4 7.6-7.6S19.2 7.4 15 7.4zM15 20c-2.7 0-5-2.2-5-5s2.2-5 5-5c2.7 0 5 2.2 5 5S17.7 20 15 20z\"/>\r\n");
      out.write("              <circle class=\"st0\" cx=\"22.9\" cy=\"7.1\" r=\"1.8\"/>\r\n");
      out.write("            </svg>\r\n");
      out.write("          </a>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.numberOfItems == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    0\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.numberOfItems}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.numberOfItems == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    item\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    items\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty cart && cart.numberOfItems != 0 &&\r\n                            !fn:contains(pageContext.request.servletPath,'/checkout') &&\r\n                            requestScope['javax.servlet.forward.servlet_path']ne '/checkout' && \r\n                            !fn:contains(pageContext.request.servletPath,'/viewCart') &&\r\n                            requestScope['javax.servlet.forward.servlet_path'] ne '/viewCart' &&\r\n                            validationErrorFlag ne true &&\r\n                            orderFailureFlag ne true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                         \r\n");
        out.write("                            &nbsp;&nbsp;<a href=\"checkout.jsp\"><i class=\"fas fa-address-book\"></i></a>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n");
        out.write("                            ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(isLogin == null) or (isLogin=='0')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"menu-store\">\r\n");
        out.write("                                    <a href=\"login/login.html\">\r\n");
        out.write("                                        <i class=\"fas fa-address-card\"></i>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                <li class=\"menu-store\">\r\n");
        out.write("                                    <a href=\"profile.jsp\">\r\n");
        out.write("                                        <i class=\"fas fa-address-card\"></i>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                    <a href=\"logout.jsp\"> \r\n");
        out.write("                                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <i class=\"fas fa-sign-out-alt\"></i>\r\n");
        out.write("                                    </a>\r\n");
        out.write("                                </li>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("view");
    _jspx_th_c_set_0.setValue(new String("/profile"));
    _jspx_th_c_set_0.setScope("session");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user== null or user.getImg() != ''}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <img id=\"blah\" src=\"img/none.jpg\">\r\n");
        out.write("                <input type='file' onchange=\"readURL(this);\" />\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <img src=\"img/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getImg()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isLogin=='1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <strong>Admin functions : </strong><br>\r\n");
        out.write("            <a href=\"addProduct.jsp\"><button> Add product</button></a>\r\n");
        out.write("            <a href=\"#\"><button> Delete Product</button></a>\r\n");
        out.write("            <a href=\"checkOrder\"><button> Check Order</button></a> \r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
