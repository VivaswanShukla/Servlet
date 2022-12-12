

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class calc
 */
public class calc extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter pw = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String op = req.getParameter("op");
		if(op.equals("+")) {
			pw.println("The sum of the two numbers is: " + (num1 + num2));
		}
		else if(op.equals("-")){
			pw.println("The difference is: " + (num1-num2));
		}
		else if(op.equals("*")) {
			pw.println("The product is: " + (num1*num2));
		}
		else if(op.equals("/")){
			pw.println("The division is: " + (num1/num2));
		}
	}
}