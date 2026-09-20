package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String username=request.getParameter("username");
         String password=request.getParameter("password");
         response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<body");
        out.println("<h1>LOGIN SUCESSFUL</h1>");
        out.println("<h2>WELCOME</h2>");
        out.println("username : "+username);
        out.println("<br>");
        out.println("password :"+password);
    }
}
