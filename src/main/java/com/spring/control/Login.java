package com.spring.control;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class Login extends HttpServlet {
    public Login() {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.sendRedirect("");
    }
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
        super.destroy();
    }
    @Override
    public void init() throws ServletException {
        super.init();
    }
    static {
    System.out.println("sdsdsd");
}
}
