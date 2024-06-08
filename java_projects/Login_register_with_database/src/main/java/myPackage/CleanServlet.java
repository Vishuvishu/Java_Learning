package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CleanServlet
 */
public class CleanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();

    
    public CleanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 if (userDao.clean()) {
	            response.sendRedirect("login.jsp?clean=yes");
	        } else {
	            response.sendRedirect("login.jsp?error=2");
	        }
		System.out.println("cleanservlet called");
	}

	
}
