package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	//it is servlet but forgot to name like that
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session2 = request.getSession(false);

	 		if(session2 != null)
	 		{
	 			session2.invalidate();//close the session vlaues are lost
	 			//previusly set value in login servlet
	 		}
	        // Check if the session is not null and the username attribute is set
	       
	    	response.sendRedirect("login.jsp");
	}

	

}
