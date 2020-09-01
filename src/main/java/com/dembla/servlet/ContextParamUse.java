package com.dembla.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ctx")
public class ContextParamUse extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter() ;
        out.println("Hello <br> ");

        ServletContext ctx = getServletContext() ; // or  req.getServletContext() ;
        String firstname = ctx.getInitParameter("firstname");

//        ServletConfig perServlet = getServletConfig() ;
//        String perSerName = perServlet.getInitParameter("name") ;

        // For All using Servlet Context..
        out.println(firstname);

        // for per Servlet using Servlet Config..
//        out.println(perSerName);
    }
}
