package gate.net;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FirstServlet() {
        super();
       
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		
		HttpSession hs=request.getSession();
		
		hs.setAttribute("name", name);
		hs.setAttribute("password", pwd);
		RequestDispatcher rd=request.getRequestDispatcher("form2.html");
		rd.forward(request, response);
	}

}
