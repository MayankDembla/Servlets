package com.dembla.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int i =Integer.parseInt( req.getParameter("num1")) ;
        int j =Integer.parseInt( req.getParameter("num2")) ;

        int k = i + j ;

        System.out.println("result is : " + k );
        PrintWriter writer = res.getWriter() ;
        writer.println("Result is : " + k );

    }
}
