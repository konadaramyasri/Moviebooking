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
public class UpdateBookingServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String Customername=request.getParameter("customername");
		String moviename=request.getParameter("movieName");
		String Seatno=request.getParameter("SeatNumber");
		String TicketPrice=request.getParameter("TicketPrice");		
		
		try {
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into Bookings(Customername,moviename,seatnumber,TicketPrice)values(?,?,?,?)");
		ps.setString(1, Customername);
		ps.setString(2, moviename);
		ps.setString(3,Seatno);
		ps.setString(4, TicketPrice);
		int rows=ps.executeUpdate();
		if(rows>0) {
			System.out.println("Data inserted Successfully");
		}
		else {
			System.out.println("data not inserted");
			
		}
		con.close();
		
		
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		response.sendRedirect("ViewBookings.html");
	}
}
	



