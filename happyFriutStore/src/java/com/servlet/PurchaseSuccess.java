/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gandanyang
 */
public class PurchaseSuccess extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
      /*   HttpSession session = request.getSession(true);
       String a1=session.getAttribute(number1);
       String a2=session.getAttribute(number2);
       String a3=session.getAttribute(number3);       numone=Integer.parseInt(a1);
       numtwo=Integer.parseInt(a2);
       numthree=Integer.parseInt(a3);
        失败的session传递方法*/
        int numone,numtwo,numthree;
        //String snuma=request.getParameter("numa");
        //String snumb=request.getParameter("numb");
        //String snumc=request.getParameter("numc");
        //session.setAttribute(number1, snuma);
        //session.setAttribute(number2, snuma);
        //session.setAttribute(number3, snuma);

 int numa,numb,numc;
/* TODO output your page here. You may use following sample code. */
        String snumq=request.getParameter("numx");
        String snumw=request.getParameter("numy");
        String snume=request.getParameter("numz");
        String snuma=request.getParameter("numa");
        String snumb=request.getParameter("numb");
        String snumc=request.getParameter("numc");
        snuma = snuma==null?"0":snuma;
        snumb = snumb==null?"0":snumb;
        snumc = snumc==null?"0":snumc;
        snumq = snumq==null?"0":snumq;
        snumw = snumw==null?"0":snumw;
        snume = snume==null?"0":snume;
        numa=Integer.valueOf(snuma);
        numb=Integer.valueOf(snumb);
        numc=Integer.valueOf(snumc);
        numone=Integer.valueOf(snumq);
        numtwo=Integer.valueOf(snumw);
        numthree=Integer.valueOf(snume);
        numa+=numone;
        numb+=numtwo;
        numc+=numthree;
        String contextPath = request.getContextPath( );
        String encodedUrl =  response.encodeURL(contextPath +
                "/shoppingCar?numa="+numa+"&numb="+numb+"&numc="+numc);
       String contextPath1 = request.getContextPath( );
        String encodedUrl1 =  response.encodeURL(contextPath1 +
                "/account.jsp?numa="+numa+"&numb="+numb+"&numc="+numc);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>我的购物车</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align=\"center\">购物车</h1>");
            out.println("<table align=\"center\">");
            out.println("<tr><a href=\"\">芒果数量</a>"+numa+"</tr><br>");
            out.println("<tr><a href=\"\">橙子数量</a>"+numb+" </tr><br>");
            out.println("<tr><a href=\"\">哈密瓜数量</a>"+numc+" </tr><br>");
            out.println("<a href=\"" + encodedUrl +
                "\">继续购买</a>&nbsp&nbsp<a href=\""+encodedUrl1+"\">结算</a>&nbsp&nbsp<a  align=\"center\" href=\"purchaseFruit.html\">清空购物车</a></table>");
//            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}