
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nathan Ryan
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
//        String plus = request.getParameter("+");
//        String minus = request.getParameter("-");
//        String multiply = request.getParameter("*");
//        String divide = request.getParameter("%");
                
        int firstNum = 0;
        int secondNum = 0;
        
        request.setAttribute("firstNum", firstNumber);
        request.setAttribute("secondNum", secondNumber);
        
        if ( firstNumber == null || firstNumber.equals("") || !firstNumber.matches("[0-9]+")
                || secondNumber == null || secondNumber.equals("") || !secondNumber.matches("[0-9]+")) {
            
            request.setAttribute("result", " --- ");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            return;
        }
        
        firstNum = Integer.parseInt(firstNumber);
        secondNum = Integer.parseInt(secondNumber);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}
