import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class DeleteQuestionServlet extends HttpServlet 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection connection;
	PrintWriter out;
	public void init(ServletConfig config) 
	{
		String driver = config.getInitParameter("oracle.jdbc.driver.OracleDriver");
		String url = config.getInitParameter("jdbc:oracle:thin:@localhost:1521:xe");
		String user = config.getInitParameter("cis");
		String pass = config.getInitParameter("cis");
		try
		{
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e) {System.out.println("Exception in init():" + e);	}//catch
	}//init

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PreparedStatement ps = null;
		try
		{
			System.out.println("in service");
			response.setContentType("text/html");
			out = response.getWriter();
			int i=0;
			ps= connection.prepareStatement("DELETE FROM QUESTIONS where question=?");
			ps.setString(1,request.getParameter("question"));
			i= ps.executeUpdate();
			response.sendRedirect("./DeleteQuestionSuccess.jsp");

		} 
		catch(Exception e) 
		{
			System.out.println("servlet failed::" + e);
			response.sendRedirect("./DeleteQuestionFailed.jsp");
		}//catch
	}//service

}//class