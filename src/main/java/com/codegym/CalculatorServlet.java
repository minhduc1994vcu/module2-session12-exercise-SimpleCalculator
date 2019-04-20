package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(req.getParameter("firstOperand"));
        float secondOperand = Float.parseFloat(req.getParameter("secondOperand"));
        String operator = req.getParameter("operator");
        float result = 0;
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");

        switch (operator) {
            case "+": result = firstOperand + secondOperand;
            break;
            case  "-": result = firstOperand - secondOperand;
            break;
            case  "*": result = firstOperand * secondOperand;
            break;
            case "/" :
                if (secondOperand == 0) {
                    writer.println("can't dive by zero");
                }
                else result = firstOperand / secondOperand;
        }
        writer.println("<h3> Result: " + result + "</h3>");

writer.println("</html>");
    }
}
