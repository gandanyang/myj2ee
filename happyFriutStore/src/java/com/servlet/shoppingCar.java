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
public class shoppingCar extends HttpServlet {
//public String number1="num1";
//public String number2="num2";
//public String number3="num3";失败的session传递方法
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
        int  num1,num2,num3;//水果总数量
 int numone,numtwo,numthree;//继续购买的水果数量
//        int anumone=0,anumtwo=0,anumthree=0;//此次购买水果数量
// HttpSession session = request.getSession(true);
        //Integer a1=(Integer)session.getAttribute(number1);
        //Integer a2=(Integer)session.getAttribute(number2);
        //Integer a3=(Integer)session.getAttribute(number3);
        String snuma=request.getParameter("numa");
        String snumb=request.getParameter("numb");
        String snumc=request.getParameter("numc");
        String numq=request.getParameter("numx");
        String numw=request.getParameter("numy");
        String nume=request.getParameter("numz");
        snuma = snuma==null?"0":snuma;
        snumb = snumb==null?"0":snumb;
        snumc = snumc==null?"0":snumc;
        numq = numq==null?"0":numq;
        numw = numw==null?"0":numw;
        nume = nume==null?"0":nume;
        numone=Integer.valueOf(numq);
        numtwo=Integer.valueOf(numw);
        numthree=Integer.valueOf(nume);
        num1=Integer.valueOf(snuma)+numone;
        num2=Integer.valueOf(snumb)+numtwo;
        num3=Integer.valueOf(snumc)+numthree;
         String contextPath1 = request.getContextPath( );
        String encodedUrl1 =  response.encodeURL(contextPath1 +
                "/account.jsp?numa="+num1+"&numb="+num2+"&numc="+num3);
//        session.setAttribute(number1, num1);
//        session.setAttribute(number2, num2);
//        session.setAttribute(number3, num3);
//        response.sendRedirect("PurchaseSuccess");
        String contextPath = request.getContextPath( );
//        String encodedUrl1 =  response.encodeURL(contextPath +
//                "//PurchaseSuccess?numa="+num1+"&numb="+num2+"&numc="+num3);
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>购物车</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"top\" bgcolor=\"FFFFFF\">欢迎！您已来到开心水果店..还要再买点吗？.<a href=\"login.html\">回到首页</a><h1>开心水果店</h1></div>");
            out.println("<form action=\"PurchaseSuccess\" methord=\"post\" onsubmit=\"return check.regCheck();\">");
            out.println("<table><tr><a>芒果</a>已购买数量<input readonly=\"ture\" name=\"numa\" type=\"text\"value=\""+num1+"\"></input>*0.5kg继续购买数量<input type=\"text\" id=\"mangguo\" name=\"numx\"></input>*0.5kg</tr><br>"
              + "<tr><a>橙子</a>已购买数量<input readonly=\"ture\" name=\"numb\" type=\"text\"value=\""+num2+"\"></input>*0.5kg继续购买数量<input type=\"text\" id=\"chengzi\" name=\"numy\"></input>*0.5kg</tr><br>"
              + "<tr><a>哈密瓜</a>已购买数量<input readonly=\"ture\" name=\"numc\" type=\"text\"value=\""+num3+"\"></input>*0.5kg继续购买数量<input type=\"text\" id=\"hamigua\" name=\"numz\"></input>*0.5kg</tr><br></table>"
                    +"<a href=\""+encodedUrl1+"\">结算</a>&nbsp&nbsp"
                    + "<input type=\"submit\" name=\"tijiao1\" value=\"确认购买\"></input></form>");
             out.println("<script>\n" +
"            var check={};\n" +
"            check.$=function(id){\n" +
"                return document.getElementById(id);\n" +
"            }\n" +
"            check.regCheck=function(){\n" +
"                var mid=check.$('mangguo');\n" +
"                var cid=check.$('chengzi');\n" +
"                var hid=check.$('hamigua');\n" +
"                if(mid.value==''){\n" +
"                    alert('您还没有填写芒果购买数量！（不需要请填0）');\n" +
"                    return false;\n" +
"                }\n" +
"                if(cid.value==''){\n" +
"                    alert('您还没有填写橙子购买数量！（不需要请填0）');\n" +
"                    return false;\n" +
"                }\n" +
"                if(hid.value==''){\n" +
"                    alert('您还没有填写哈密瓜购买数量！（不需要请填0）');\n" +
"                    return false;\n" +
"                }\n" +
"                return true;\n" +
"            }\n" +
"        </script>");
            
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
