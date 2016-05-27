/*
 * LoginSuccess.java
 *
 * Created on 2007年10月17日, 下午7:57
 */

package com.servlet;

import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginSuccess extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
      
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        request.getSession().setAttribute("isLog", "true");
        String name=request.getParameter("userID");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>开心水果店</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"top\" bgcolor=\"FFFFFF\">");
        out.println("欢迎！"+name+"您已成功登录开心水果店...<a href=\"purchaseFruit.html\">开始购买</a>");
        /*out.println("<h1>开心水果店</h1>");
        out.println("</div>");
        out.println("<div class=\"contents\">");
        out.println("<li><img width=200px src=\"http://pic47.nipic.com/20140901/11926572_075259914196_2.jpg\"><a href=\"http://tieba.baidu.com/f?kw=%E8%8A%92%E6%9E%9C&fr=wwwt\">芒果</a>数量<input type=\"text\" name=\"numa\"></input>*0.5kg</li>");
        out.println("<li><img width=200px src=\"http://img.taopic.com/uploads/allimg/120505/154426-1205051H23216.jpg\"><a href=\"http://tieba.baidu.com/f?ie=utf-8&kw=%E6%A9%99%E5%AD%90&fr=search\">橙子</a>数量<input type=\"text\" name=\"numb\"></input>*0.5kg</li>");
        out.println("<li><img width=200px src=\"http://smt.114chn.com/Webpub/450800/091124000010/upload/201001111626152656.jpg\"><a href=\"http://tieba.baidu.com/f?ie=utf-8&kw=%E5%93%88%E5%AF%86%E7%93%9C&fr=search\">哈密瓜</a>数量<input type=\"text\" name=\"numc\"></input>*0.5kg</li>");
        out.println("</div>");
        out.println("<input type=\"submit\"name=\"jiesuan\"value=\"结算\"></input>");*/
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
