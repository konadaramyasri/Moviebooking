package com.moviebooking;
import java.util.*;
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
@WebServlet("/viewusers")
public class ViewBookingsServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>View users</h2>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>id</th>");
		out.println("<th>Customer  </th>");
		out.println("<th>movie</th>");
		out.println("<th>Seat</th>");
		out.println("<th>price</th>");
		out.println("<th>delete</th>");
		out.println("<th>edit</th>");
		out.println("</tr>");
		try {
			Connection con=DBConnect.getConnection();
			PreparedStatement ps=con.prepareStatement("select*from Bookings;");
			ResultSet rs=ps.executeQuery();
			out.println("<tr>");
			out.println("<td> "+rs.getString("Customer ")+"</td>");	
			out.println("<td> "+rs.getString("movie")+"</td>");
			out.println("<td> "+rs.getString("Seat")+"</td>");
			out.println("<td> "+rs.getString("price")+"</td>");
			out.println("<td>");
			out.println("<a href='edit?id="+rs.getString("id")+"'>edit</a>");
					out.println("</td>");
					out.println("<td>");
					out.println("<a href='delete?id=" +rs.getString("id")+"'>edit</a>");
		out.println("</td>");
			out.println("</tr>");
			
			
		}
		catch(Exception e) {
		System.out.println(e);
			
			
		}
		
		

		
	}
	
	
	

}
