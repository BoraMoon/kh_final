/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-03-15 14:51:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.club;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clubMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Club Main</title>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/club/clubinclude.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/club/clubmain.css\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/5e1e16b3f4.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Fredoka+One&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("    $(\".comment-sliderbutton\").click(function(){\r\n");
      out.write("        $(this).parent().nextAll(\".comment-hiddenbox\").slideToggle(300);\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/clubInclude.jsp", out, false);
      out.write("\r\n");
      out.write("  <section class=\"flotclass\">\r\n");
      out.write("      <div class=\"section-block\">\r\n");
      out.write("          <div class=\"section-wrapper\">\r\n");
      out.write("              <p class=\"section-boradall\">전체보기</p>\r\n");
      out.write("              <div class=\"section-block-right\">\r\n");
      out.write("                  <p>글쓰기</p>\r\n");
      out.write("                  <i class=\"fas fa-pencil-alt\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("      </div>\r\n");
      out.write("      <article class=\"article1 flotclass\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 게시물카드시작 -->\r\n");
      out.write("          <div class=\"article-board-notice\">\r\n");
      out.write("              <div class=\"article-board-wrapper\">\r\n");
      out.write("                  <div class=\"article1-board-frofile\">\r\n");
      out.write("                      <div class=\"article1-frofile-img\">\r\n");
      out.write("                      \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("                          <div class=\"article1-frofile-name\">\r\n");
      out.write("                              <p >@wingStudy_02</p>\r\n");
      out.write("                              <p class=\"article1-leader-name\">스테파니</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"article1-curcle-box\">\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <p class=\"article1-boardmenu\">공지사항</p>\r\n");
      out.write("                      <div class=\"article1-bard-content\">\r\n");
      out.write("\t\t\t                          이번주 금요일 정모합니다! <br>\r\n");
      out.write("\t\t\t                          주소는 강남역 윙스터디 앞입니다\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-hashtag-container\">\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지</div>\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지사항</div>\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지어기면강퇴</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-line\"></div>\r\n");
      out.write("                      <div class=\"article1-comment-box\">\r\n");
      out.write("                          <input type=\"text\" name=\"comment\" id=\"commnet\" placeholder=\"댓글입력\">\r\n");
      out.write("                          <div class=\"comment-input\">입력</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-comment-count\">\r\n");
      out.write("                          <div class=\"comment-sliderbutton\">\r\n");
      out.write("                              \t댓글 2개&nbsp;&nbsp;<i class=\"fas fa-sort-down\" style=\"font-size: 18px;\"></i>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"comment-hiddenbox\">\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"article1-commnet-container\">\r\n");
      out.write("                              <div class=\"comment-frofile-img\">\r\n");
      out.write("                              \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">신형철</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-commnet-container\">\r\n");
      out.write("                          <div class=\"comment-frofile-img\">\r\n");
      out.write("                          \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">백동준</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-commnet-container\">\r\n");
      out.write("                          <div class=\"comment-frofile-img\">\r\n");
      out.write("                          \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">문보라</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          <!-- 게시물카드끝-->\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"article-board-notice\">\r\n");
      out.write("              <div class=\"article-board-wrapper\">\r\n");
      out.write("                  <div class=\"article1-board-frofile\">\r\n");
      out.write("                      <div class=\"article1-frofile-img\">\r\n");
      out.write("                      \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("                          <div class=\"article1-frofile-name\">\r\n");
      out.write("                              <p >@wingStudy_02</p>\r\n");
      out.write("                              <p class=\"article1-leader-name\">스테파니</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"article1-curcle-box\">\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                              <div class=\"article1-curcle\"></div>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <p class=\"article1-boardmenu\">공지사항</p>\r\n");
      out.write("                      <div class=\"article1-bard-content\">\r\n");
      out.write("\t\t\t                          이번주 금요일 정모합니다! <br>\r\n");
      out.write("\t\t\t                          주소는 강남역 윙스터디 앞입니다\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-hashtag-container\">\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지</div>\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지사항</div>\r\n");
      out.write("                          <div class=\"article1-hashtag-box\">#공지어기면강퇴</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-line\"></div>\r\n");
      out.write("                      <div class=\"article1-comment-box\">\r\n");
      out.write("                          <input type=\"text\" name=\"comment\" id=\"commnet\" placeholder=\"댓글입력\">\r\n");
      out.write("                          <div class=\"comment-input\">입력</div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-comment-count\">\r\n");
      out.write("                          <div class=\"comment-sliderbutton\">\r\n");
      out.write("                              \t댓글 2개&nbsp;&nbsp;<i class=\"fas fa-sort-down\" style=\"font-size: 18px;\"></i>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"comment-hiddenbox\">\r\n");
      out.write("\r\n");
      out.write("                          <div class=\"article1-commnet-container\">\r\n");
      out.write("                              <div class=\"comment-frofile-img\">\r\n");
      out.write("                              \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                              </div>\r\n");
      out.write("                              <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">신형철</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-commnet-container\">\r\n");
      out.write("                          <div class=\"comment-frofile-img\">\r\n");
      out.write("                          \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">백동준</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"article1-commnet-container\">\r\n");
      out.write("                          <div class=\"comment-frofile-img\">\r\n");
      out.write("                          \t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/upload/member/frofileimg/ex2.jpg\" alt=\"\" />\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"comment-block\"></div>\r\n");
      out.write("                          <div class=\"comment-frofile-name\">문보라</div>\r\n");
      out.write("                          <p>확인했습니다!</p>\r\n");
      out.write("                          <div class=\"comment-right-box\">\r\n");
      out.write("                              <p>신고</p>\r\n");
      out.write("                              <p>|</p>\r\n");
      out.write("                              <p>답글</p>\r\n");
      out.write("                          </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("      </article>\r\n");
      out.write("      <article class=\"article2 flotclass\">\r\n");
      out.write("              <div class=\"article2-title\">\r\n");
      out.write("                  <p>이런건 어때요?</p>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"article2-container\">\r\n");
      out.write("                  <div class=\"article2-box\">\r\n");
      out.write("                      <p>망고스터디</p>\r\n");
      out.write("                      <p>스터디 카페 추천해드려요</p>\r\n");
      out.write("                      <div class=\"article2-line\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"article2-container\">\r\n");
      out.write("                  <div class=\"article2-box\">\r\n");
      out.write("                      <p>망고스터디</p>\r\n");
      out.write("                      <p>스터디 카페 추천해드려요</p>\r\n");
      out.write("                      <div class=\"article2-line\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"article2-container\">\r\n");
      out.write("                  <div class=\"article2-box\">\r\n");
      out.write("                      <p>망고스터디</p>\r\n");
      out.write("                      <p>스터디 카페 추천해드려요</p>\r\n");
      out.write("                      <div class=\"article2-line\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"article2-container\">\r\n");
      out.write("                  <div class=\"article2-box\">\r\n");
      out.write("                      <p>망고스터디</p>\r\n");
      out.write("                      <p>스터디 카페 추천해드려요</p>\r\n");
      out.write("                      <div class=\"article2-line\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"article2-container\">\r\n");
      out.write("                  <div class=\"article2-box\">\r\n");
      out.write("                      <p>망고스터디</p>\r\n");
      out.write("                      <p>스터디 카페 추천해드려요</p>\r\n");
      out.write("                      <div class=\"article2-line\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("      </article>\r\n");
      out.write("      \r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
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
