package com.dembla.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1.fetch the K value to here.
//        int k = (int) req.getAttribute("key") ;

        // 2.in case of Redirect
//        int k = Integer.parseInt(req.getParameter("key"))  ;

        // 3.Fetch Attribute using Session
//        HttpSession session = req.getSession() ;
//        int k = (int) session.getAttribute("key");
//        session.removeAttribute("key");

        // 4.Use Cookies - send by the client/browser
        Cookie[] cookies = req.getCookies();
        int k = 0;

        for (Cookie c : cookies) {
            if (c.getName().equalsIgnoreCase("k")) {
                k = Integer.parseInt(c.getValue()) ;
            }
        }


        resp.getWriter().println("Calculating the Square .. " + k);
    }
}
