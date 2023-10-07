package sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name="";
		Cookie cookie[]=req.getCookies();
		for(Cookie c: cookie) {
			if(c.getName().equals("cusername")) {
				name=c.getValue();
			}
		}
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>"+"Welcome Back "+name+"</h1></body></html>");
	}

}
