package dragon.sample.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author Dragon
 * @version V1.0
 * @Title: dragon.sample.servlet.SampleServlet
 * @Description:
 * @date 2016/10/17 20:01
 */
public class SampleServlet extends GenericServlet {

	private static final long serialVersionUID = -537190037661805279L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.getWriter().println("Hello Sample!");
	}
}
