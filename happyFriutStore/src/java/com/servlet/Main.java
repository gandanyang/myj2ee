/*
 * Main.java
 *
 * Created on 2007年10月17日, 下午7:56
 */

package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Main extends HttpServlet {
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
         System.out.println("我在Servlet Main中");
        try{
        Thread.sleep(2000);
        }catch (InterruptedException ie){
            System.out.println(ie.toString());
        }
        String userID=request.getParameter("userID");
        if(userID==null)userID="";        
        String password=request.getParameter("password");
        if(password==null)password="";
        if((userID.equals("gdy")&&password.equals("123456"))){
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("LoginSuccess");
            dispatcher.forward(request, response);
        } else{
            RequestDispatcher dispatcher =
                    request.getRequestDispatcher("LoginFail");
            dispatcher.forward(request, response);
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        processRequest(request, response);
    }
    public String getServletInfo() {
        return "Short description";
    }
    
   }
