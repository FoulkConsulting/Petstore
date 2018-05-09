package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NewOrderForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/order/../common/IncludeTop.jsp");
    _jspx_dependants.add("/WEB-INF/tld/struts-logic.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts-bean.tld");
    _jspx_dependants.add("/WEB-INF/tld/struts-html.tld");
    _jspx_dependants.add("/order/../common/../common/IncludeQuickHeader.jsp");
    _jspx_dependants.add("/order/../common/IncludeBottom.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_page;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_scope_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notEqual_value_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_equal_value_scope_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_styleId_method_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_checkbox_property_name_nobody;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_html_link_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_scope_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notEqual_value_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_equal_value_scope_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_iterate_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_form_styleId_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_select_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_options_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_text_size_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_checkbox_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_link_page.release();
    _jspx_tagPool_logic_notPresent_scope_name.release();
    _jspx_tagPool_logic_present_scope_name.release();
    _jspx_tagPool_logic_notEqual_value_scope_property_name.release();
    _jspx_tagPool_logic_equal_value_scope_property_name.release();
    _jspx_tagPool_html_form_method_action.release();
    _jspx_tagPool_logic_present_name.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_html_form_styleId_method_action.release();
    _jspx_tagPool_html_select_property_name.release();
    _jspx_tagPool_html_options_property_name_nobody.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_text_size_property_name_nobody.release();
    _jspx_tagPool_html_checkbox_property_name_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
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
      out.write("<html><head><title>JPetStore Demo</title>\r\n");
      out.write("<meta content=\"text/html; charset=windows-1252\" http-equiv=\"Content-Type\" />\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"max-age=0\">\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("<META HTTP-EQUIV=\"Expires\" CONTENT=\"Tue, 01 Jan 1980 1:00:00 GMT\">\r\n");
      out.write("<META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"white\">\r\n");
      out.write("\r\n");
      out.write("<table background=\"../images/bkg-topbar.gif\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\" width=\"100%\">\r\n");
      out.write("  <tbody>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>");
      if (_jspx_meth_html_link_0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("    <td align=\"right\">");
      if (_jspx_meth_html_link_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <img border=\"0\" src=\"../images/separator.gif\" />\r\n");
      out.write("\r\n");
      if (_jspx_meth_logic_notPresent_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_logic_present_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_logic_present_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <img border=\"0\" src=\"../images/separator.gif\" /><a href=\"../help.html\"><img border=\"0\" name=\"img_help\" src=\"../images/help.gif\" /></a>\r\n");
      out.write("    </td>\r\n");
      out.write("    <td align=\"left\" valign=\"bottom\">\r\n");
      out.write("      ");
      if (_jspx_meth_html_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      if (_jspx_meth_html_link_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<img border=\"0\" src=\"../images/separator.gif\" />\r\n");
      if (_jspx_meth_html_link_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<img border=\"0\" src=\"../images/separator.gif\" />\r\n");
      if (_jspx_meth_html_link_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<img border=\"0\" src=\"../images/separator.gif\" />\r\n");
      if (_jspx_meth_html_link_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<img border=\"0\" src=\"../images/separator.gif\" />\r\n");
      if (_jspx_meth_html_link_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Support for non-traditional but simple message -->\r\n");
      if (_jspx_meth_logic_present_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Support for non-traditional but simpler use of errors... -->\r\n");
      //  logic:present
      org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_3 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
      _jspx_th_logic_present_3.setPageContext(_jspx_page_context);
      _jspx_th_logic_present_3.setParent(null);
      _jspx_th_logic_present_3.setName("errors");
      int _jspx_eval_logic_present_3 = _jspx_th_logic_present_3.doStartTag();
      if (_jspx_eval_logic_present_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("  ");
          //  logic:iterate
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(_jspx_page_context);
          _jspx_th_logic_iterate_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_3);
          _jspx_th_logic_iterate_0.setId("error");
          _jspx_th_logic_iterate_0.setName("errors");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object error = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_logic_iterate_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            error = (java.lang.Object) _jspx_page_context.findAttribute("error");
            do {
              out.write("\r\n");
              out.write("    <B><FONT color=RED>\r\n");
              out.write("      <BR>");
              if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("    </FONT></B>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              error = (java.lang.Object) _jspx_page_context.findAttribute("error");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
            return;
          }
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_logic_present_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_present_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_3);
        return;
      }
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_3);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_html_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p align=\"center\">\r\n");
      out.write("<a href=\"http://www.ibatis.com\"><img border=\"0\" align=\"center\" src=\"../images/poweredby.gif\" /></a>\r\n");
      out.write("</p>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_0.setPageContext(_jspx_page_context);
    _jspx_th_html_link_0.setParent(null);
    _jspx_th_html_link_0.setPage("/shop/index.shtml");
    int _jspx_eval_html_link_0 = _jspx_th_html_link_0.doStartTag();
    if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_0.doInitBody();
      }
      do {
        out.write("<img border=\"0\" src=\"../images/logo-topbar.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_0);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_0);
    return false;
  }

  private boolean _jspx_meth_html_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_1.setPageContext(_jspx_page_context);
    _jspx_th_html_link_1.setParent(null);
    _jspx_th_html_link_1.setPage("/shop/viewCart.shtml");
    int _jspx_eval_html_link_1 = _jspx_th_html_link_1.doStartTag();
    if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_1.doInitBody();
      }
      do {
        out.write("<img border=\"0\" name=\"img_cart\" src=\"../images/cart.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_1);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_1);
    return false;
  }

  private boolean _jspx_meth_logic_notPresent_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_0 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_scope_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_notPresent_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notPresent_0.setParent(null);
    _jspx_th_logic_notPresent_0.setName("accountBean");
    _jspx_th_logic_notPresent_0.setScope("session");
    int _jspx_eval_logic_notPresent_0 = _jspx_th_logic_notPresent_0.doStartTag();
    if (_jspx_eval_logic_notPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_html_link_2(_jspx_th_logic_notPresent_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_logic_notPresent_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
      return true;
    }
    _jspx_tagPool_logic_notPresent_scope_name.reuse(_jspx_th_logic_notPresent_0);
    return false;
  }

  private boolean _jspx_meth_html_link_2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notPresent_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_2.setPageContext(_jspx_page_context);
    _jspx_th_html_link_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notPresent_0);
    _jspx_th_html_link_2.setPage("/shop/signonForm.shtml");
    int _jspx_eval_html_link_2 = _jspx_th_html_link_2.doStartTag();
    if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_2.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  <img border=\"0\" name=\"img_signin\" src=\"../images/sign-in.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_2);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_2);
    return false;
  }

  private boolean _jspx_meth_logic_present_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_0 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_scope_name.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_present_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_present_0.setParent(null);
    _jspx_th_logic_present_0.setName("accountBean");
    _jspx_th_logic_present_0.setScope("session");
    int _jspx_eval_logic_present_0 = _jspx_th_logic_present_0.doStartTag();
    if (_jspx_eval_logic_present_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_logic_notEqual_0(_jspx_th_logic_present_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_logic_present_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_present_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_0);
      return true;
    }
    _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_0);
    return false;
  }

  private boolean _jspx_meth_logic_notEqual_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_notEqual_0 = (org.apache.struts.taglib.logic.NotEqualTag) _jspx_tagPool_logic_notEqual_value_scope_property_name.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_notEqual_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_notEqual_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_0);
    _jspx_th_logic_notEqual_0.setName("accountBean");
    _jspx_th_logic_notEqual_0.setProperty("authenticated");
    _jspx_th_logic_notEqual_0.setValue("true");
    _jspx_th_logic_notEqual_0.setScope("session");
    int _jspx_eval_logic_notEqual_0 = _jspx_th_logic_notEqual_0.doStartTag();
    if (_jspx_eval_logic_notEqual_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        ");
        if (_jspx_meth_html_link_3(_jspx_th_logic_notEqual_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_logic_notEqual_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notEqual_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notEqual_value_scope_property_name.reuse(_jspx_th_logic_notEqual_0);
      return true;
    }
    _jspx_tagPool_logic_notEqual_value_scope_property_name.reuse(_jspx_th_logic_notEqual_0);
    return false;
  }

  private boolean _jspx_meth_html_link_3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_notEqual_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_3.setPageContext(_jspx_page_context);
    _jspx_th_html_link_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_notEqual_0);
    _jspx_th_html_link_3.setPage("/shop/signonForm.shtml");
    int _jspx_eval_html_link_3 = _jspx_th_html_link_3.doStartTag();
    if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_3.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("        <img border=\"0\" name=\"img_signin\" src=\"../images/sign-in.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_3);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_3);
    return false;
  }

  private boolean _jspx_meth_logic_present_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_1 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_scope_name.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_present_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_present_1.setParent(null);
    _jspx_th_logic_present_1.setName("accountBean");
    _jspx_th_logic_present_1.setScope("session");
    int _jspx_eval_logic_present_1 = _jspx_th_logic_present_1.doStartTag();
    if (_jspx_eval_logic_present_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_logic_equal_0(_jspx_th_logic_present_1, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_logic_present_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_present_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_1);
      return true;
    }
    _jspx_tagPool_logic_present_scope_name.reuse(_jspx_th_logic_present_1);
    return false;
  }

  private boolean _jspx_meth_logic_equal_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_equal_0 = (org.apache.struts.taglib.logic.EqualTag) _jspx_tagPool_logic_equal_value_scope_property_name.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_equal_0.setPageContext(_jspx_page_context);
    _jspx_th_logic_equal_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_1);
    _jspx_th_logic_equal_0.setName("accountBean");
    _jspx_th_logic_equal_0.setProperty("authenticated");
    _jspx_th_logic_equal_0.setValue("true");
    _jspx_th_logic_equal_0.setScope("session");
    int _jspx_eval_logic_equal_0 = _jspx_th_logic_equal_0.doStartTag();
    if (_jspx_eval_logic_equal_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      ");
        if (_jspx_meth_html_link_4(_jspx_th_logic_equal_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("      <img border=\"0\" src=\"../images/separator.gif\" />\r\n");
        out.write("      ");
        if (_jspx_meth_html_link_5(_jspx_th_logic_equal_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_logic_equal_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_equal_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_equal_value_scope_property_name.reuse(_jspx_th_logic_equal_0);
      return true;
    }
    _jspx_tagPool_logic_equal_value_scope_property_name.reuse(_jspx_th_logic_equal_0);
    return false;
  }

  private boolean _jspx_meth_html_link_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_4.setPageContext(_jspx_page_context);
    _jspx_th_html_link_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_link_4.setPage("/shop/signoff.shtml");
    int _jspx_eval_html_link_4 = _jspx_th_html_link_4.doStartTag();
    if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_4.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      <img border=\"0\" name=\"img_signout\" src=\"../images/sign-out.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_4);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_4);
    return false;
  }

  private boolean _jspx_meth_html_link_5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_equal_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_5.setPageContext(_jspx_page_context);
    _jspx_th_html_link_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_equal_0);
    _jspx_th_html_link_5.setPage("/shop/editAccountForm.shtml");
    int _jspx_eval_html_link_5 = _jspx_th_html_link_5.doStartTag();
    if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_5.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      <img border=\"0\" name=\"img_myaccount\" src=\"../images/my_account.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_5);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_5);
    return false;
  }

  private boolean _jspx_meth_html_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(_jspx_page_context);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setMethod("post");
    _jspx_th_html_form_0.setAction("/shop/searchProducts.shtml");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        <input name=\"keyword\" size=\"14\" />&nbsp;<input border=\"0\" src=\"../images/search.gif\" type=\"image\" />\r\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
      return true;
    }
    _jspx_tagPool_html_form_method_action.reuse(_jspx_th_html_form_0);
    return false;
  }

  private boolean _jspx_meth_html_link_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_6.setPageContext(_jspx_page_context);
    _jspx_th_html_link_6.setParent(null);
    _jspx_th_html_link_6.setPage("/shop/viewCategory.shtml?categoryId=FISH");
    int _jspx_eval_html_link_6 = _jspx_th_html_link_6.doStartTag();
    if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_6.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<img border=\"0\" src=\"../images/sm_fish.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_6);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_6);
    return false;
  }

  private boolean _jspx_meth_html_link_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_7.setPageContext(_jspx_page_context);
    _jspx_th_html_link_7.setParent(null);
    _jspx_th_html_link_7.setPage("/shop/viewCategory.shtml?categoryId=DOGS");
    int _jspx_eval_html_link_7 = _jspx_th_html_link_7.doStartTag();
    if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_7.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<img border=\"0\" src=\"../images/sm_dogs.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_7);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_7);
    return false;
  }

  private boolean _jspx_meth_html_link_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_8 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_8.setPageContext(_jspx_page_context);
    _jspx_th_html_link_8.setParent(null);
    _jspx_th_html_link_8.setPage("/shop/viewCategory.shtml?categoryId=REPTILES");
    int _jspx_eval_html_link_8 = _jspx_th_html_link_8.doStartTag();
    if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_8.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<img border=\"0\" src=\"../images/sm_reptiles.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_8);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_8);
    return false;
  }

  private boolean _jspx_meth_html_link_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_9 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_9.setPageContext(_jspx_page_context);
    _jspx_th_html_link_9.setParent(null);
    _jspx_th_html_link_9.setPage("/shop/viewCategory.shtml?categoryId=CATS");
    int _jspx_eval_html_link_9 = _jspx_th_html_link_9.doStartTag();
    if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_9.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<img border=\"0\" src=\"../images/sm_cats.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_9);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_9);
    return false;
  }

  private boolean _jspx_meth_html_link_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_10 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_10.setPageContext(_jspx_page_context);
    _jspx_th_html_link_10.setParent(null);
    _jspx_th_html_link_10.setPage("/shop/viewCategory.shtml?categoryId=BIRDS");
    int _jspx_eval_html_link_10 = _jspx_th_html_link_10.doStartTag();
    if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_10.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<img border=\"0\" src=\"../images/sm_birds.gif\" />");
        int evalDoAfterBody = _jspx_th_html_link_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_10);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_10);
    return false;
  }

  private boolean _jspx_meth_logic_present_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_2 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_name.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_present_2.setPageContext(_jspx_page_context);
    _jspx_th_logic_present_2.setParent(null);
    _jspx_th_logic_present_2.setName("message");
    int _jspx_eval_logic_present_2 = _jspx_th_logic_present_2.doStartTag();
    if (_jspx_eval_logic_present_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  <b><font color=\"BLUE\">");
        if (_jspx_meth_bean_write_0(_jspx_th_logic_present_2, _jspx_page_context))
          return true;
        out.write("</font></b>\r\n");
        int evalDoAfterBody = _jspx_th_logic_present_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_present_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_2);
      return true;
    }
    _jspx_tagPool_logic_present_name.reuse(_jspx_th_logic_present_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_2);
    _jspx_th_bean_write_0.setName("message");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_0);
    _jspx_th_bean_write_1.setName("error");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_1);
      return true;
    }
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_html_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_styleId_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_1.setPageContext(_jspx_page_context);
    _jspx_th_html_form_1.setParent(null);
    _jspx_th_html_form_1.setAction("/shop/newOrder.shtml");
    _jspx_th_html_form_1.setStyleId("orderBean");
    _jspx_th_html_form_1.setMethod("post");
    int _jspx_eval_html_form_1 = _jspx_th_html_form_1.doStartTag();
    if (_jspx_eval_html_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\r\n");
        out.write("<TABLE bgcolor=\"#008800\" border=0 cellpadding=3 cellspacing=1 bgcolor=#FFFF88>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD colspan=2>\r\n");
        out.write("<FONT color=GREEN size=4><B>Payment Details</B></FONT>\r\n");
        out.write("</TD></TR><TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Card Type:</TD><TD>\r\n");
        if (_jspx_meth_html_select_0(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Card Number:</TD><TD>");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write(" <font color=red size=2>* Use a fake number!</font>\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Expiry Date (MM/YYYY):</TD><TD>");
        if (_jspx_meth_html_text_1(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD colspan=2>\r\n");
        out.write("<FONT color=GREEN size=4><B>Billing Address</B></FONT>\r\n");
        out.write("</TD></TR>\r\n");
        out.write("\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("First name:</TD><TD>");
        if (_jspx_meth_html_text_2(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Last name:</TD><TD>");
        if (_jspx_meth_html_text_3(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Address 1:</TD><TD>");
        if (_jspx_meth_html_text_4(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Address 2:</TD><TD>");
        if (_jspx_meth_html_text_5(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("City: </TD><TD>");
        if (_jspx_meth_html_text_6(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("State:</TD><TD>");
        if (_jspx_meth_html_text_7(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Zip:</TD><TD>");
        if (_jspx_meth_html_text_8(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("<TR bgcolor=#FFFF88><TD>\r\n");
        out.write("Country: </TD><TD>");
        if (_jspx_meth_html_text_9(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</TD></TR>\r\n");
        out.write("\r\n");
        out.write("<TR bgcolor=#FFFF88><TD colspan=2>\r\n");
        if (_jspx_meth_html_checkbox_0(_jspx_th_html_form_1, _jspx_page_context))
          return true;
        out.write(" Ship to different address...\r\n");
        out.write("</TD></TR>\r\n");
        out.write("\r\n");
        out.write("</TABLE>\r\n");
        out.write("<P>\r\n");
        out.write("<input type=\"image\" src=\"../images/button_submit.gif\">\r\n");
        out.write("\r\n");
        int evalDoAfterBody = _jspx_th_html_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_1);
      return true;
    }
    _jspx_tagPool_html_form_styleId_method_action.reuse(_jspx_th_html_form_1);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(_jspx_page_context);
    _jspx_th_html_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_select_0.setName("orderBean");
    _jspx_th_html_select_0.setProperty("order.cardType");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("  ");
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_0);
      return true;
    }
    _jspx_tagPool_html_select_property_name.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:options
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_name_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(_jspx_page_context);
    _jspx_th_html_options_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_select_0);
    _jspx_th_html_options_0.setName("orderBean");
    _jspx_th_html_options_0.setProperty("creditCardTypes");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_options_property_name_nobody.reuse(_jspx_th_html_options_0);
      return true;
    }
    _jspx_tagPool_html_options_property_name_nobody.reuse(_jspx_th_html_options_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(_jspx_page_context);
    _jspx_th_html_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_0.setName("orderBean");
    _jspx_th_html_text_0.setProperty("order.creditCard");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(_jspx_page_context);
    _jspx_th_html_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_1.setName("orderBean");
    _jspx_th_html_text_1.setProperty("order.expiryDate");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_1);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(_jspx_page_context);
    _jspx_th_html_text_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_2.setName("orderBean");
    _jspx_th_html_text_2.setProperty("order.billToFirstName");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_2);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(_jspx_page_context);
    _jspx_th_html_text_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_3.setName("orderBean");
    _jspx_th_html_text_3.setProperty("order.billToLastName");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_3);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(_jspx_page_context);
    _jspx_th_html_text_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_4.setSize("40");
    _jspx_th_html_text_4.setName("orderBean");
    _jspx_th_html_text_4.setProperty("order.billAddress1");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_4);
      return true;
    }
    _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_4);
    return false;
  }

  private boolean _jspx_meth_html_text_5(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_5 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_5.setPageContext(_jspx_page_context);
    _jspx_th_html_text_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_5.setSize("40");
    _jspx_th_html_text_5.setName("orderBean");
    _jspx_th_html_text_5.setProperty("order.billAddress2");
    int _jspx_eval_html_text_5 = _jspx_th_html_text_5.doStartTag();
    if (_jspx_th_html_text_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_5);
      return true;
    }
    _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_5);
    return false;
  }

  private boolean _jspx_meth_html_text_6(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_6 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_6.setPageContext(_jspx_page_context);
    _jspx_th_html_text_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_6.setName("orderBean");
    _jspx_th_html_text_6.setProperty("order.billCity");
    int _jspx_eval_html_text_6 = _jspx_th_html_text_6.doStartTag();
    if (_jspx_th_html_text_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_6);
      return true;
    }
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_6);
    return false;
  }

  private boolean _jspx_meth_html_text_7(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_7 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_7.setPageContext(_jspx_page_context);
    _jspx_th_html_text_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_7.setSize("4");
    _jspx_th_html_text_7.setName("orderBean");
    _jspx_th_html_text_7.setProperty("order.billState");
    int _jspx_eval_html_text_7 = _jspx_th_html_text_7.doStartTag();
    if (_jspx_th_html_text_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_7);
      return true;
    }
    _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_7);
    return false;
  }

  private boolean _jspx_meth_html_text_8(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_8 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_8.setPageContext(_jspx_page_context);
    _jspx_th_html_text_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_8.setSize("10");
    _jspx_th_html_text_8.setName("orderBean");
    _jspx_th_html_text_8.setProperty("order.billZip");
    int _jspx_eval_html_text_8 = _jspx_th_html_text_8.doStartTag();
    if (_jspx_th_html_text_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_8);
      return true;
    }
    _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_8);
    return false;
  }

  private boolean _jspx_meth_html_text_9(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_9 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_9.setPageContext(_jspx_page_context);
    _jspx_th_html_text_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_text_9.setSize("15");
    _jspx_th_html_text_9.setName("orderBean");
    _jspx_th_html_text_9.setProperty("order.billCountry");
    int _jspx_eval_html_text_9 = _jspx_th_html_text_9.doStartTag();
    if (_jspx_th_html_text_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_9);
      return true;
    }
    _jspx_tagPool_html_text_size_property_name_nobody.reuse(_jspx_th_html_text_9);
    return false;
  }

  private boolean _jspx_meth_html_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:checkbox
    org.apache.struts.taglib.html.CheckboxTag _jspx_th_html_checkbox_0 = (org.apache.struts.taglib.html.CheckboxTag) _jspx_tagPool_html_checkbox_property_name_nobody.get(org.apache.struts.taglib.html.CheckboxTag.class);
    _jspx_th_html_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_html_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_form_1);
    _jspx_th_html_checkbox_0.setName("orderBean");
    _jspx_th_html_checkbox_0.setProperty("shippingAddressRequired");
    int _jspx_eval_html_checkbox_0 = _jspx_th_html_checkbox_0.doStartTag();
    if (_jspx_th_html_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_checkbox_property_name_nobody.reuse(_jspx_th_html_checkbox_0);
      return true;
    }
    _jspx_tagPool_html_checkbox_property_name_nobody.reuse(_jspx_th_html_checkbox_0);
    return false;
  }
}
