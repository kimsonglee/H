package the.healing.time.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = (String) req.getParameter("path");

		if (path == null) {
			req.getSession().setAttribute("include", new String("main"));
			req.getRequestDispatcher("/healing/index.jsp").forward(req, resp);
			System.out.println(req.getSession().getAttribute("include"));
			return;
		}
		req.getSession().setAttribute("include", new String(path));
		req.getRequestDispatcher("/healing/index.jsp").forward(req, resp);
		System.out.println(req.getSession().getAttribute("include"));

	}

}
