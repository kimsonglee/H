package the.healing.time.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.regexp.internal.recompile;

import thehealing.time.DAO.HealingDAO;
import thehealing.time.DTO.HBoard;

public class HealingController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");// 한글파라미터 처리

		String action = req.getParameter("action");

		if (action == null || action.equals("board")) {

			HealingDAO dao = new HealingDAO();

			List<HBoard> list = dao.hb_select();

			req.getSession().setAttribute("list", list);

			req.getRequestDispatcher("/project/board.jsp").forward(req, resp);

		} else if (action.equals("writeBoard")) {
			req.getRequestDispatcher("/project/writeBoard.jsp").forward(req, resp);

		} else if (action.equals("insert")) {
			HBoard hboard = new HBoard("test", req.getParameter("contents"), req.getParameter("img"),
					req.getParameter("hash"), 1);

			HealingDAO dao = new HealingDAO();

			if (dao.insert(hboard)) {
				resp.sendRedirect("control?action=board");
			}
		} else if (action.equals("sb_select")) {

			String b_no = req.getParameter("b_no");

			HealingDAO dao = new HealingDAO();

			HBoard hboard = dao.sb_select(Integer.parseInt(b_no));

			req.getSession().setAttribute("hboard", hboard);

			req.getRequestDispatcher("/project/subBoard.jsp").forward(req, resp);

		} else if (action.equals("timeline_select")) {

			HealingDAO dao = new HealingDAO();
			List<HBoard> list = dao.timeline_select();

			req.getSession().setAttribute("list", list);

			req.getRequestDispatcher("/project/board.jsp").forward(req, resp);
		} else if (action.equals("h_search")) {

			String hash = req.getParameter("search");

			HealingDAO dao = new HealingDAO();
			List<HBoard> list = dao.h_search(hash);
			req.getSession().setAttribute("list", list);
			// System.out.println(hash);
			req.getRequestDispatcher("/project/board.jsp").forward(req, resp);

		} else if (action.equals("editBoard")) {
			String b_no = req.getParameter("b_no");

			HealingDAO dao = new HealingDAO();
			HBoard hboard = dao.b_edit(Integer.parseInt(b_no));

			req.getSession().setAttribute("hboard", hboard);

			req.getRequestDispatcher("/project/updateBoard.jsp").forward(req, resp);

		} else if (action.equals("updateBoard")) {
			HBoard hboard = new HBoard();
			hboard.setB_no(Integer.parseInt(req.getParameter("b_no")));
			hboard.setB_contents(req.getParameter("contents"));
			hboard.setB_hash(req.getParameter("hash"));
			hboard.setB_img(req.getParameter("img"));
			HealingDAO dao = new HealingDAO();
			if(dao.updateBoard(hboard)){
				resp.sendRedirect("control?action=board");
			}else{
				System.out.println("수정실패");
			}
		} else if (action.equals("editCompare")) {
			
			String b_nick = req.getParameter("b_nick");
			int b_no = Integer.parseInt(req.getParameter("b_no"));
			
			HealingDAO dao = new HealingDAO();
			ArrayList<HBoard> list = dao.editCompare(b_nick);
			
			for(int i=0; i<list.size(); i++){
				if(list.get(i).getB_no() == b_no){
					HBoard hboard = new HBoard();
					hboard.setB_no(list.get(i).getB_no());
					hboard.setB_contents(list.get(i).getB_contents());
					hboard.setB_img(list.get(i).getB_img());
					hboard.setB_hash(list.get(i).getB_hash());
					
					req.getSession().setAttribute("hboard", hboard);
					
					req.getRequestDispatcher("/project/updateBoard.jsp").forward(req, resp);
					
				}
			}
			
		}else if (action.equals("delBoard")) {
			
			String b_nick = req.getParameter("b_nick");
			int b_no = Integer.parseInt(req.getParameter("b_no"));
			
			HBoard hboard = new HBoard();
			hboard.setB_nick(b_nick);
			hboard.setB_no(b_no);
			
			
			HealingDAO dao = new HealingDAO();
			if(dao.delBoard(hboard)){
				resp.sendRedirect("control?action=board");
			}
			
		}

	}

}
