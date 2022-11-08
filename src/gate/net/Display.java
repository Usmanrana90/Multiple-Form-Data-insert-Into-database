package gate.net;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Display() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qualification =request.getParameter("qual");
		String address=request.getParameter("address");
		
		HttpSession hs=request.getSession();
		hs.setAttribute("qual", qualification);
		hs.setAttribute("address", address);
		
		PrintWriter out=response.getWriter();
		out.println("Name :"+hs.getAttribute("name"));
		out.println("password :"+hs.getAttribute("password"));
		out.println("email :"+hs.getAttribute("email"));
		out.println("mobile :"+hs.getAttribute("mobile"));
		out.println("Qualification :"+hs.getAttribute("qual"));
		out.println("Address :"+hs.getAttribute("address"));
	}

}
