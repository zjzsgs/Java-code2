package safe;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThreadSafeServlet extends HttpServlet  {
	public static String name = "Hello";
	int i;
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet��ʼ��");
	}
	
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		System.out.printf("%s: %s[%s]\n",Thread.currentThread().getName(),i,format.format(new Date()));//������println��ֻ����printf
		i++;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("%s: %s[%s]\n",Thread.currentThread().getName(),i,format.format(new Date()));//������println��ֻ����printf
		response.getWriter().println("<html><body><h1>" + i + "</h1></body></html>");
	}
}
