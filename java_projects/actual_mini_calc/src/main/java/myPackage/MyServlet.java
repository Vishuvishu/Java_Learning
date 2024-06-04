package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String[] jokes = {
    		"Why do programmers prefer dark mode? -> Because light attracts bugs!",
    		"Why was the JavaScript developer sad? -> Because he didn't know how to 'null' his feelings.",
    		"What’s the first step in understanding Recursion? -> To understand recursion, you have to first understand recursion.",
    		"Why do programmers prefer dark chocolate? Because it has fewer bugs.",
    		"Why did the programmer quit his job? -> He didn't get arrays.",
    };
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		int num1=Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = 0;
		switch(str3) {
		case "1":
			sum=num1+num2;
			break;

		case "2":
			sum=num1-num2;
			break;

		case "3":
			sum=num1*num2;
			break;

		case "4":
			sum=num1/num2;
			break;
			
		default:
			response.getWriter().append("Seems like you haven't selected any button for calculation.");
			

		}
		
		int randomindex = (int)(Math.random()*jokes.length);
		String randomjoke = jokes[randomindex];
		
//		response.getWriter().append("Answer is : "+sum);
		response.sendRedirect("NewFile.jsp?ans="+sum+"&joke="+randomjoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
