package com.dembla.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // fetch the K value to here.
//        int k = (int) req.getAttribute("key") ;

        // in case of Redirect
//        int k = Integer.parseInt(req.getParameter("key"))  ;

        // Fetch Attribute using Session
        HttpSession session = req.getSession() ;

        int k = (int) session.getAttribute("key");

        session.removeAttribute("key");


        resp.getWriter().println("Calculating the Square .. " + k ) ;
    }
}
