package org.example.servlet;

import org.example.repository.UserRepository;
import org.example.repository.UserRepositoryInMemoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UserRepository repository;

    @Override
    public void init() throws ServletException {
        this.repository = new UserRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("Hello");
    }
}
