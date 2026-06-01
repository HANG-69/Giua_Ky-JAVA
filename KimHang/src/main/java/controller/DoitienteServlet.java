package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/chuyendoi")
public class DoitienteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        double amount =
                Double.parseDouble(request.getParameter("amount"));

        double rate =
                Double.parseDouble(request.getParameter("rate"));

        double result = amount * rate;

        request.setAttribute("result", result);

        request.getRequestDispatcher("doitiente.jsp")
               .forward(request, response);
    }
}