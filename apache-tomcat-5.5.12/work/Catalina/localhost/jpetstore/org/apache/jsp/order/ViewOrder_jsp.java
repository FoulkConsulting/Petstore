package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_property_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_format_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_link_paramProperty_paramName_paramId_page;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_present_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_notPresent_property_name;

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
    _jspx_tagPool_bean_define_property_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_bean_write_property_name_format_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_html_link_paramProperty_paramName_paramId_page = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_present_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_logic_notPresent_property_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
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
    _jspx_tagPool_bean_define_property_name_id_nobody.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_bean_write_property_name_format_nobody.release();
    _jspx_tagPool_html_link_paramProperty_paramName_paramId_page.release();
    _jspx_tagPool_logic_present_property_name.release();
    _jspx_tagPool_logic_notPresent_property_name.release();
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
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_0.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_0.setParent(null);
      _jspx_th_bean_define_0.setId("order");
      _jspx_th_bean_define_0.setName("orderBean");
      _jspx_th_bean_define_0.setProperty("order");
      int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
      if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
        return;
      }
      _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
      java.lang.Object order = null;
      order = (java.lang.Object) _jspx_page_context.findAttribute("order");
      out.write('\r');
      out.write('\n');
      //  bean:define
      org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_1 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
      _jspx_th_bean_define_1.setPageContext(_jspx_page_context);
      _jspx_th_bean_define_1.setParent(null);
      _jspx_th_bean_define_1.setId("itemList");
      _jspx_th_bean_define_1.setName("orderBean");
      _jspx_th_bean_define_1.setProperty("order.lineItems");
      int _jspx_eval_bean_define_1 = _jspx_th_bean_define_1.doStartTag();
      if (_jspx_th_bean_define_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
        return;
      }
      _jspx_tagPool_bean_define_property_name_id_nobody.reuse(_jspx_th_bean_define_1);
      java.lang.Object itemList = null;
      itemList = (java.lang.Object) _jspx_page_context.findAttribute("itemList");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table align=\"left\" bgcolor=\"#008800\" border=\"0\" cellspacing=\"2\" cellpadding=\"2\">\r\n");
      out.write("<tr><td bgcolor=\"#FFFF88\">\r\n");
      if (_jspx_meth_html_link_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<p>\r\n");
      out.write("\r\n");
      out.write("<table width=\"60%\" align=\"center\" border=\"0\" cellpadding=\"3\" cellspacing=\"1\" bgcolor=\"#FFFF88\">\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td align=\"center\" colspan=\"2\">\r\n");
      out.write("  <font size=\"4\"><b>Order #");
      if (_jspx_meth_bean_write_2(_jspx_page_context))
        return;
      out.write("</b></font>\r\n");
      out.write("  <br /><font size=\"3\"><b>");
      if (_jspx_meth_bean_write_3(_jspx_page_context))
        return;
      out.write("</b></font>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td colspan=\"2\">\r\n");
      out.write("<font color=\"GREEN\" size=\"4\"><b>Payment Details</b></font>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Card Type:</td><td>\r\n");
      if (_jspx_meth_bean_write_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Card Number:</td><td>");
      if (_jspx_meth_bean_write_5(_jspx_page_context))
        return;
      out.write(" <font color=\"red\" size=\"2\">* Fake number!</font>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Expiry Date (MM/YYYY):</td><td>");
      if (_jspx_meth_bean_write_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td colspan=\"2\">\r\n");
      out.write("<font color=\"GREEN\" size=\"4\"><b>Billing Address</b></font>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("First name:</td><td>");
      if (_jspx_meth_bean_write_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Last name:</td><td>");
      if (_jspx_meth_bean_write_8(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Address 1:</td><td>");
      if (_jspx_meth_bean_write_9(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Address 2:</td><td>");
      if (_jspx_meth_bean_write_10(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("City: </td><td>");
      if (_jspx_meth_bean_write_11(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("State:</td><td>");
      if (_jspx_meth_bean_write_12(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Zip:</td><td>");
      if (_jspx_meth_bean_write_13(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Country: </td><td>");
      if (_jspx_meth_bean_write_14(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td colspan=\"2\">\r\n");
      out.write("<font color=\"GREEN\" size=\"4\"><b>Shipping Address</b></font>\r\n");
      out.write("</td></tr><tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("First name:</td><td>");
      if (_jspx_meth_bean_write_15(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Last name:</td><td>");
      if (_jspx_meth_bean_write_16(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Address 1:</td><td>");
      if (_jspx_meth_bean_write_17(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Address 2:</td><td>");
      if (_jspx_meth_bean_write_18(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("City: </td><td>");
      if (_jspx_meth_bean_write_19(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("State:</td><td>");
      if (_jspx_meth_bean_write_20(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Zip:</td><td>");
      if (_jspx_meth_bean_write_21(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Country: </td><td>");
      if (_jspx_meth_bean_write_22(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td>\r\n");
      out.write("Courier: </td><td>");
      if (_jspx_meth_bean_write_23(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td colspan=\"2\">\r\n");
      out.write("  <b><font color=\"GREEN\" size=\"4\">Status:</font> ");
      if (_jspx_meth_bean_write_24(_jspx_page_context))
        return;
      out.write("</b>\r\n");
      out.write("</td></tr>\r\n");
      out.write("<tr bgcolor=\"#FFFF88\"><td colspan=\"2\">\r\n");
      out.write("<table width=\"100%\" align=\"center\" bgcolor=\"#008800\" border=\"0\" cellspacing=\"2\" cellpadding=\"3\">\r\n");
      out.write("  <tr bgcolor=\"#CCCCCC\">\r\n");
      out.write("  <td><b>Item ID</b></td>\r\n");
      out.write("  <td><b>Description</b></td>\r\n");
      out.write("  <td><b>Quantity</b></td>\r\n");
      out.write("  <td><b>Price</b></td>\r\n");
      out.write("  <td><b>Total Cost</b></td>\r\n");
      out.write("  </tr>\r\n");
      //  logic:iterate
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_1 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_1.setPageContext(_jspx_page_context);
      _jspx_th_logic_iterate_1.setParent(null);
      _jspx_th_logic_iterate_1.setId("item");
      _jspx_th_logic_iterate_1.setName("itemList");
      int _jspx_eval_logic_iterate_1 = _jspx_th_logic_iterate_1.doStartTag();
      if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object item = null;
        if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_logic_iterate_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_logic_iterate_1.doInitBody();
        }
        item = (java.lang.Object) _jspx_page_context.findAttribute("item");
        do {
          out.write("\r\n");
          out.write("  <tr bgcolor=\"#FFFF88\">\r\n");
          out.write("  <td><b>");
          if (_jspx_meth_html_link_12(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("</b></td>\r\n");
          out.write("  <td>\r\n");
          out.write("  ");
          if (_jspx_meth_logic_present_4(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  ");
          if (_jspx_meth_logic_notPresent_1(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("  </td>\r\n");
          out.write("\r\n");
          out.write("  <td>");
          if (_jspx_meth_bean_write_32(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("  <td align=\"right\">");
          if (_jspx_meth_bean_write_33(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("  <td align=\"right\">");
          if (_jspx_meth_bean_write_34(_jspx_th_logic_iterate_1, _jspx_page_context))
            return;
          out.write("</td>\r\n");
          out.write("  </tr>\r\n");
          int evalDoAfterBody = _jspx_th_logic_iterate_1.doAfterBody();
          item = (java.lang.Object) _jspx_page_context.findAttribute("item");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_logic_iterate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
        return;
      }
      _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_1);
      out.write("\r\n");
      out.write("  <tr bgcolor=\"#FFFF88\">\r\n");
      out.write("  <td colspan=\"5\" align=\"right\"><b>Total: ");
      if (_jspx_meth_bean_write_35(_jspx_page_context))
        return;
      out.write("</b></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</td></tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p align=\"center\">\r\n");
      out.write("<a href=\"http://www.ibatis.com\"><img border=\"0\" align=\"center\" src=\"../images/poweredby.gif\" /></a>\r\n");
      out.write("</p>\r\n");
      out.write("</p></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_html_link_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_11 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_11.setPageContext(_jspx_page_context);
    _jspx_th_html_link_11.setParent(null);
    _jspx_th_html_link_11.setPage("/shop/index.shtml");
    int _jspx_eval_html_link_11 = _jspx_th_html_link_11.doStartTag();
    if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_11.doInitBody();
      }
      do {
        out.write("<b><font color=\"BLACK\" size=\"2\">&lt;&lt; Main Menu</font></b>");
        int evalDoAfterBody = _jspx_th_html_link_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_11);
      return true;
    }
    _jspx_tagPool_html_link_page.reuse(_jspx_th_html_link_11);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_2.setParent(null);
    _jspx_th_bean_write_2.setName("order");
    _jspx_th_bean_write_2.setProperty("orderId");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_format_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_3.setParent(null);
    _jspx_th_bean_write_3.setName("order");
    _jspx_th_bean_write_3.setProperty("orderDate");
    _jspx_th_bean_write_3.setFormat("yyyy/MM/dd hh:mm:ss");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_3);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_4.setParent(null);
    _jspx_th_bean_write_4.setName("order");
    _jspx_th_bean_write_4.setProperty("cardType");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_5.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_5.setParent(null);
    _jspx_th_bean_write_5.setName("order");
    _jspx_th_bean_write_5.setProperty("creditCard");
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_6.setParent(null);
    _jspx_th_bean_write_6.setName("order");
    _jspx_th_bean_write_6.setProperty("expiryDate");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_7.setParent(null);
    _jspx_th_bean_write_7.setName("order");
    _jspx_th_bean_write_7.setProperty("billToFirstName");
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_bean_write_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_8.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_8.setParent(null);
    _jspx_th_bean_write_8.setName("order");
    _jspx_th_bean_write_8.setProperty("billToLastName");
    int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
    if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
    return false;
  }

  private boolean _jspx_meth_bean_write_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_9.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_9.setParent(null);
    _jspx_th_bean_write_9.setName("order");
    _jspx_th_bean_write_9.setProperty("billAddress1");
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }

  private boolean _jspx_meth_bean_write_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_10 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_10.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_10.setParent(null);
    _jspx_th_bean_write_10.setName("order");
    _jspx_th_bean_write_10.setProperty("billAddress2");
    int _jspx_eval_bean_write_10 = _jspx_th_bean_write_10.doStartTag();
    if (_jspx_th_bean_write_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_10);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_10);
    return false;
  }

  private boolean _jspx_meth_bean_write_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_11 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_11.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_11.setParent(null);
    _jspx_th_bean_write_11.setName("order");
    _jspx_th_bean_write_11.setProperty("billCity");
    int _jspx_eval_bean_write_11 = _jspx_th_bean_write_11.doStartTag();
    if (_jspx_th_bean_write_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_11);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_11);
    return false;
  }

  private boolean _jspx_meth_bean_write_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_12 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_12.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_12.setParent(null);
    _jspx_th_bean_write_12.setName("order");
    _jspx_th_bean_write_12.setProperty("billState");
    int _jspx_eval_bean_write_12 = _jspx_th_bean_write_12.doStartTag();
    if (_jspx_th_bean_write_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_12);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_12);
    return false;
  }

  private boolean _jspx_meth_bean_write_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_13 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_13.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_13.setParent(null);
    _jspx_th_bean_write_13.setName("order");
    _jspx_th_bean_write_13.setProperty("billZip");
    int _jspx_eval_bean_write_13 = _jspx_th_bean_write_13.doStartTag();
    if (_jspx_th_bean_write_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_13);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_13);
    return false;
  }

  private boolean _jspx_meth_bean_write_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_14 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_14.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_14.setParent(null);
    _jspx_th_bean_write_14.setName("order");
    _jspx_th_bean_write_14.setProperty("billCountry");
    int _jspx_eval_bean_write_14 = _jspx_th_bean_write_14.doStartTag();
    if (_jspx_th_bean_write_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_14);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_14);
    return false;
  }

  private boolean _jspx_meth_bean_write_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_15 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_15.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_15.setParent(null);
    _jspx_th_bean_write_15.setName("order");
    _jspx_th_bean_write_15.setProperty("shipToFirstName");
    int _jspx_eval_bean_write_15 = _jspx_th_bean_write_15.doStartTag();
    if (_jspx_th_bean_write_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_15);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_15);
    return false;
  }

  private boolean _jspx_meth_bean_write_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_16 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_16.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_16.setParent(null);
    _jspx_th_bean_write_16.setName("order");
    _jspx_th_bean_write_16.setProperty("shipToLastName");
    int _jspx_eval_bean_write_16 = _jspx_th_bean_write_16.doStartTag();
    if (_jspx_th_bean_write_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_16);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_16);
    return false;
  }

  private boolean _jspx_meth_bean_write_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_17 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_17.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_17.setParent(null);
    _jspx_th_bean_write_17.setName("order");
    _jspx_th_bean_write_17.setProperty("shipAddress1");
    int _jspx_eval_bean_write_17 = _jspx_th_bean_write_17.doStartTag();
    if (_jspx_th_bean_write_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_17);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_17);
    return false;
  }

  private boolean _jspx_meth_bean_write_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_18 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_18.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_18.setParent(null);
    _jspx_th_bean_write_18.setName("order");
    _jspx_th_bean_write_18.setProperty("shipAddress2");
    int _jspx_eval_bean_write_18 = _jspx_th_bean_write_18.doStartTag();
    if (_jspx_th_bean_write_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_18);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_18);
    return false;
  }

  private boolean _jspx_meth_bean_write_19(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_19 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_19.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_19.setParent(null);
    _jspx_th_bean_write_19.setName("order");
    _jspx_th_bean_write_19.setProperty("shipCity");
    int _jspx_eval_bean_write_19 = _jspx_th_bean_write_19.doStartTag();
    if (_jspx_th_bean_write_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_19);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_19);
    return false;
  }

  private boolean _jspx_meth_bean_write_20(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_20 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_20.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_20.setParent(null);
    _jspx_th_bean_write_20.setName("order");
    _jspx_th_bean_write_20.setProperty("shipState");
    int _jspx_eval_bean_write_20 = _jspx_th_bean_write_20.doStartTag();
    if (_jspx_th_bean_write_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_20);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_20);
    return false;
  }

  private boolean _jspx_meth_bean_write_21(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_21 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_21.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_21.setParent(null);
    _jspx_th_bean_write_21.setName("order");
    _jspx_th_bean_write_21.setProperty("shipZip");
    int _jspx_eval_bean_write_21 = _jspx_th_bean_write_21.doStartTag();
    if (_jspx_th_bean_write_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_21);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_21);
    return false;
  }

  private boolean _jspx_meth_bean_write_22(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_22 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_22.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_22.setParent(null);
    _jspx_th_bean_write_22.setName("order");
    _jspx_th_bean_write_22.setProperty("shipCountry");
    int _jspx_eval_bean_write_22 = _jspx_th_bean_write_22.doStartTag();
    if (_jspx_th_bean_write_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_22);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_22);
    return false;
  }

  private boolean _jspx_meth_bean_write_23(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_23 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_23.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_23.setParent(null);
    _jspx_th_bean_write_23.setName("order");
    _jspx_th_bean_write_23.setProperty("courier");
    int _jspx_eval_bean_write_23 = _jspx_th_bean_write_23.doStartTag();
    if (_jspx_th_bean_write_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_23);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_23);
    return false;
  }

  private boolean _jspx_meth_bean_write_24(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_24 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_24.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_24.setParent(null);
    _jspx_th_bean_write_24.setName("order");
    _jspx_th_bean_write_24.setProperty("status");
    int _jspx_eval_bean_write_24 = _jspx_th_bean_write_24.doStartTag();
    if (_jspx_th_bean_write_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_24);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_24);
    return false;
  }

  private boolean _jspx_meth_html_link_12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_html_link_12 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_html_link_paramProperty_paramName_paramId_page.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_html_link_12.setPageContext(_jspx_page_context);
    _jspx_th_html_link_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_html_link_12.setParamId("itemId");
    _jspx_th_html_link_12.setParamName("item");
    _jspx_th_html_link_12.setParamProperty("itemId");
    _jspx_th_html_link_12.setPage("/shop/viewItem.shtml");
    int _jspx_eval_html_link_12 = _jspx_th_html_link_12.doStartTag();
    if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_link_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_link_12.doInitBody();
      }
      do {
        out.write("<font color=\"BLACK\">");
        if (_jspx_meth_bean_write_25(_jspx_th_html_link_12, _jspx_page_context))
          return true;
        out.write("</font>");
        int evalDoAfterBody = _jspx_th_html_link_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_link_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_html_link_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_html_link_paramProperty_paramName_paramId_page.reuse(_jspx_th_html_link_12);
      return true;
    }
    _jspx_tagPool_html_link_paramProperty_paramName_paramId_page.reuse(_jspx_th_html_link_12);
    return false;
  }

  private boolean _jspx_meth_bean_write_25(javax.servlet.jsp.tagext.JspTag _jspx_th_html_link_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_25 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_25.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_link_12);
    _jspx_th_bean_write_25.setName("item");
    _jspx_th_bean_write_25.setProperty("itemId");
    int _jspx_eval_bean_write_25 = _jspx_th_bean_write_25.doStartTag();
    if (_jspx_th_bean_write_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_25);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_25);
    return false;
  }

  private boolean _jspx_meth_logic_present_4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_present_4 = (org.apache.struts.taglib.logic.PresentTag) _jspx_tagPool_logic_present_property_name.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_present_4.setPageContext(_jspx_page_context);
    _jspx_th_logic_present_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_logic_present_4.setName("item");
    _jspx_th_logic_present_4.setProperty("item");
    int _jspx_eval_logic_present_4 = _jspx_th_logic_present_4.doStartTag();
    if (_jspx_eval_logic_present_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_26(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_27(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_28(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_29(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_30(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("     ");
        if (_jspx_meth_bean_write_31(_jspx_th_logic_present_4, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_logic_present_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_present_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_present_property_name.reuse(_jspx_th_logic_present_4);
      return true;
    }
    _jspx_tagPool_logic_present_property_name.reuse(_jspx_th_logic_present_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_26 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_26.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_26.setName("item");
    _jspx_th_bean_write_26.setProperty("item.attribute1");
    int _jspx_eval_bean_write_26 = _jspx_th_bean_write_26.doStartTag();
    if (_jspx_th_bean_write_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_26);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_26);
    return false;
  }

  private boolean _jspx_meth_bean_write_27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_27 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_27.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_27.setName("item");
    _jspx_th_bean_write_27.setProperty("item.attribute2");
    int _jspx_eval_bean_write_27 = _jspx_th_bean_write_27.doStartTag();
    if (_jspx_th_bean_write_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_27);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_27);
    return false;
  }

  private boolean _jspx_meth_bean_write_28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_28 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_28.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_28.setName("item");
    _jspx_th_bean_write_28.setProperty("item.attribute3");
    int _jspx_eval_bean_write_28 = _jspx_th_bean_write_28.doStartTag();
    if (_jspx_th_bean_write_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_28);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_28);
    return false;
  }

  private boolean _jspx_meth_bean_write_29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_29 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_29.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_29.setName("item");
    _jspx_th_bean_write_29.setProperty("item.attribute4");
    int _jspx_eval_bean_write_29 = _jspx_th_bean_write_29.doStartTag();
    if (_jspx_th_bean_write_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_29);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_29);
    return false;
  }

  private boolean _jspx_meth_bean_write_30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_30 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_30.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_30.setName("item");
    _jspx_th_bean_write_30.setProperty("item.attribute5");
    int _jspx_eval_bean_write_30 = _jspx_th_bean_write_30.doStartTag();
    if (_jspx_th_bean_write_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_30);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_30);
    return false;
  }

  private boolean _jspx_meth_bean_write_31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_present_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_31 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_31.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_present_4);
    _jspx_th_bean_write_31.setName("item");
    _jspx_th_bean_write_31.setProperty("item.product.name");
    int _jspx_eval_bean_write_31 = _jspx_th_bean_write_31.doStartTag();
    if (_jspx_th_bean_write_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_31);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_31);
    return false;
  }

  private boolean _jspx_meth_logic_notPresent_1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_notPresent_1 = (org.apache.struts.taglib.logic.NotPresentTag) _jspx_tagPool_logic_notPresent_property_name.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_notPresent_1.setPageContext(_jspx_page_context);
    _jspx_th_logic_notPresent_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_logic_notPresent_1.setName("item");
    _jspx_th_logic_notPresent_1.setProperty("item");
    int _jspx_eval_logic_notPresent_1 = _jspx_th_logic_notPresent_1.doStartTag();
    if (_jspx_eval_logic_notPresent_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("  <i>{description unavailable}</i>\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_logic_notPresent_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_notPresent_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_logic_notPresent_property_name.reuse(_jspx_th_logic_notPresent_1);
      return true;
    }
    _jspx_tagPool_logic_notPresent_property_name.reuse(_jspx_th_logic_notPresent_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_32 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_32.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_32.setName("item");
    _jspx_th_bean_write_32.setProperty("quantity");
    int _jspx_eval_bean_write_32 = _jspx_th_bean_write_32.doStartTag();
    if (_jspx_th_bean_write_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_32);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_32);
    return false;
  }

  private boolean _jspx_meth_bean_write_33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_33 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_format_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_33.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_33.setName("item");
    _jspx_th_bean_write_33.setProperty("unitPrice");
    _jspx_th_bean_write_33.setFormat("$#,##0.00");
    int _jspx_eval_bean_write_33 = _jspx_th_bean_write_33.doStartTag();
    if (_jspx_th_bean_write_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_33);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_33);
    return false;
  }

  private boolean _jspx_meth_bean_write_34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_iterate_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_34 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_format_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_34.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_iterate_1);
    _jspx_th_bean_write_34.setName("item");
    _jspx_th_bean_write_34.setProperty("total");
    _jspx_th_bean_write_34.setFormat("$#,##0.00");
    int _jspx_eval_bean_write_34 = _jspx_th_bean_write_34.doStartTag();
    if (_jspx_th_bean_write_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_34);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_34);
    return false;
  }

  private boolean _jspx_meth_bean_write_35(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_35 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_format_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_35.setPageContext(_jspx_page_context);
    _jspx_th_bean_write_35.setParent(null);
    _jspx_th_bean_write_35.setName("order");
    _jspx_th_bean_write_35.setProperty("totalPrice");
    _jspx_th_bean_write_35.setFormat("$#,##0.00");
    int _jspx_eval_bean_write_35 = _jspx_th_bean_write_35.doStartTag();
    if (_jspx_th_bean_write_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_35);
      return true;
    }
    _jspx_tagPool_bean_write_property_name_format_nobody.reuse(_jspx_th_bean_write_35);
    return false;
  }
}
