package es.upm.laboratory.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/api/register")
@MultipartConfig
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.sendError(HttpServletResponse.SC_NOT_FOUND);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Part profilePicPart = request.getPart("profilePic");
		    InputStream fileContent = profilePicPart.getInputStream();
		    
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			String completeName = request.getParameter("completeName");
		    String role = request.getParameter("role");
		    String email = request.getParameter("email");
		    
		    
	    }catch(IOException e){
	    	e.printStackTrace();
	    	response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	    }
	    
	    
	}

}
