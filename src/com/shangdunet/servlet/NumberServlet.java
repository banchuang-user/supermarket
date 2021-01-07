package com.shangdunet.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/show")
public class NumberServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = getServletContext();
        Integer count = (Integer) servletContext.getAttribute("count");
        if (count == null){
            servletContext.setAttribute("count",1);
        }else {
            servletContext.setAttribute("count",count+1);
        }
//        req.getSession().setAttribute("count",count);
//        servletContext.setAttribute("count",count);
//        PrintWriter writer = resp.getWriter();
        resp.sendRedirect(req.getContextPath()+"/show.jsp");
//        writer.println("你是第"+servletContext.getAttribute("count")+"个访问的");
    }
}
