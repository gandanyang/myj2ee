/*
 * LoginFail.java
 *
 * Created on 2007年10月17日, 下午8:47
 */

package com.servlet;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class LoginFail extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html lang=\"zh\">");
        out.println("<head>");
//        out.println("<meta http-equiv=\"Content-Type\" content=\"txt/html charset=UTF-8\">");
        out.println("<title> 登录失败</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>登录失败，请重新登录.....</h1>");
        RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
       dispatcher.include(request, response);
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
