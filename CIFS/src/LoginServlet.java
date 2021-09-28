import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class LoginServlet extends HttpServlet
{

	private static final long serialVersionUID = 1L;
Connection con;
Statement st;
ResultSet rs;
PrintWriter out;
RequestDispatcher rd;
public void init(ServletConfig conf)
{
String d=conf.getInitParameter("oracle.jdbc.driver.OracleDriver");
String ur=conf.getInitParameter("jdbc:oracle:thin:@localhost:1521:xe");
String us=conf.getInitParameter("cis");
String p=conf.getInitParameter("cis");
try{
Class.forName(d);
con=DriverManager.getConnection(ur,us,p);
}catch(Exception e)
{
System.out.println(""+e);
}//catch
}//init
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
try{
res.setContentType("text/html");
out=res.getWriter();
st=con.createStatement();
rs=st.executeQuery("select * from Register where username='"+req.getParameter("user")+"' and password='"+req.getParameter("pass")+"'");
if(rs.next())
{
String us=""+rs.getString(1);
String pa=""+rs.getString(2);
req.setAttribute("user",us);
req.setAttribute("pass",pa);
rd=req.getRequestDispatcher("./LoginSucess.jsp");
rd.forward(req,res);
}
else
res.sendRedirect("./LoginFailed.jsp");
}catch(Exception e)
{
System.out.println(""+e);
res.sendRedirect("./LoginFailed.jsp");
}//catch
}//service
}//class



