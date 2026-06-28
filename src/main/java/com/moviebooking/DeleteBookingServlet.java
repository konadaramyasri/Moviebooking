package com.moviebooking;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import java.sql.PreparedStatement;
import java.sql.Connection;
@WebServlet("/Delete")
public class DeleteBookingServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException{
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from bookings where id=?");
		
		ps.setInt(1,id);
		int rows=ps.executeUpdate();
		if(rows>0) {
			System.out.println("user data deleted");
			
		}
		else {
			System.out.println("try again");

		}
		con.close();
		
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		response.sendRedirect("ViewBookings.html");

		}
				
				
	}
	

