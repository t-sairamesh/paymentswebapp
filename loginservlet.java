package paymentapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String gmail = request.getParameter("gmail");
		String password = request.getParameter("password");
		try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentswebapp","root","Sairamesh@19");
		     PreparedStatement ps = con.prepareStatement("select Email,PassWord from registration  where Email = ? and PassWord = ?");
		     ps.setString(1, gmail);
		     ps.setString(2, password);
		     ResultSet rs  = ps.executeQuery();
		     if(rs.next()) {
		    	 System.out.println("login successfull");
		    	 RequestDispatcher rs1 = request.getRequestDispatcher("/Dashboard.jsp");
			      HttpSession hs = request.getSession();
		    	  hs.setAttribute("Email",gmail);
		          rs1.forward(request, response);
		    	   
		     }
		     else {
		    	 
		    	 System.out.println("login failed");
		    	  response.setContentType("text/html");
			      response.getWriter().write("Invalid details please register");
			      RequestDispatcher rd = request.getRequestDispatcher("/Registration.jsp");
			      rd.include(request, response);                                 
		         
		     }
		           con.close();
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
