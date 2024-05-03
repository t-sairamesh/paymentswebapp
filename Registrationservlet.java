package paymentapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Registrationservlet")
public class Registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Email = request.getParameter("email");
		String firstname = request.getParameter("fname");
		String Lastname = request.getParameter("lname");
		String phonenumber = request.getParameter("phone");
		String Dateofbirth = request.getParameter("date");
		String Address = request.getParameter("text");
		String password = request.getParameter("password");
		
		
		try {
		     Class.forName("com.mysql.cj.jdbc.Driver");
		     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/paymentswebapp","root","Sairamesh@19");
		     PreparedStatement ps = con.prepareStatement("insert into registration value(?,?,?,?,?,?,?)");
		     ps.setString(1,Email);
		     ps.setString(2,firstname);
		     ps.setString(3,Lastname);
		     ps.setString(4,phonenumber);
		     ps.setString(5,Dateofbirth);
		     ps.setString(6,Address);
		     ps.setString(7,password);
		 
		   
		     
		     int i = ps.executeUpdate();
		     if(i>0) {
		    	 System.out.println("registration successfully");
		    	 RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		    	 
		    	 rd.forward(request, response);
		    	 
		     }
		     else {
		    	 System.out.println("registration failed");
		     }
		     
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
