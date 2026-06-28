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
@WebServlet("/Edit")
public class  EditBookingServlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	@Override
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException ,IOException
	{
int id=Integer.parseInt(request.getParameter("id"));
response.setContentType("text/html");
PrintWriter out=response.getWriter();
try {
	Connection con=DBConnect.getConnection();
	PreparedStatement ps=con.prepareStatement("insert into bookings where id=?;");
	ps.setInt(1,id);
	ResultSet rs=ps.executeQuery();
	if(rs.next()) {
		out.println("<html>");
		out.println("</body>");
out.println("<h2> EDIT HERE</td>");
out.println("<form action='edit' method='post'>");
		out.println("<input type='hidden' name='id' value='"+rs.getInt("id")+"'>");
				out.println("customer name <br>");
				out.println("<input type='text'name='Customer Name' value='"+rs.getString("Customer Name")+" '>");
						out.println("Moviename  <br>");

						out.println("<input type='text'name='Moviename' value='"+rs.getString("Moviename")+" '>");
								out.println("seatnumber<br>");

								out.println("<input type='text'name='seatnumber' value='"+rs.getString("seatnumber")+"'>");
										out.println("ticket price <br>");

										out.println("<input type='text'name='ticket price' value='"+rs.getString("ticket price")+" '>");

out.println("</form>");
out.println("</body>");
out.println("</html>");
	}
}
	

catch(Exception e) {
	System.out.println(e);
	
}


}



	}

