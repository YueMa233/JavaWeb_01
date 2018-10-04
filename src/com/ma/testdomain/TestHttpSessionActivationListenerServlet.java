package com.ma.testdomain;

import com.ma.domain.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "TestHttpSessionActivationListenerServlet")
public class TestHttpSessionActivationListenerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Customer customer01 = new Customer();
        customer01.setId(1);
        customer01.setName("Jerry");
        //将对象放到session域中
        session.setAttribute("customer01",customer01);
        System.out.println("customer01被放到session域中了...");

    }
}
