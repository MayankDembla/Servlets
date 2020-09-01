package com.dembla.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class AddServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        int i =Integer.parseInt( req.getParameter("num1")) ;
        int j =Integer.parseInt( req.getParameter("num2")) ;

        int k = i*j;

        // Now we also want to pass some data to the another Servlet
        req.setAttribute("key",k);


        // Here is the one thing using the Request Dispatcher we are just passing the control
        // to the another servlet
        RequestDispatcher rd = req.getRequestDispatcher("sq") ;
        rd.forward(req,res);
    }
}
