package com.ma.testdomain;

import com.ma.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "TestHttpSessionBindingServlet")
public class TestHttpSessionBindingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //将对象绑定到session域中
        HttpSession session = request.getSession();

        User user01 = new User();
        user01.setId(1);
        user01.setName("Tom");
        //绑定User
        session.setAttribute("user01",user01);
        //解绑User
        session.removeAttribute("user01");
    }
}
