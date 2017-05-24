package the.healing.time.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import the.healing.time.dao.HDAO;
import the.healing.time.dto.HUserInfo;

public class HController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = (String) req.getParameter("path");
		String action = req.getParameter("action");
		
		if (path == null) { // main화면
			//req.setAttribute("include", new String("main"));
			//req.getSession().setAttribute("include", new String("main"));
			req.getRequestDispatcher("/healing/index.jsp").forward(req, resp);
			//System.out.println(req.getSession().getAttribute("include"));
			return;
		}
		req.setAttribute("include", new String(path));
		//req.getSession().setAttribute("include", new String(path));
		req.getRequestDispatcher("/healing/index.jsp").forward(req, resp);
		//System.out.println(req.getSession().getAttribute("include"));

		
		
		
		if(action.equals("insert")){
			//회원가입DB입력
			//유효성 검사 아직임 05.24
		
			HUserInfo huserinfo = new HUserInfo();
			
			/*Calendar cal = new GregorianCalendar();
		  		int year = cal.get(cal.YEAR);*/
			
			huserinfo.setEmail(req.getParameter("email"));
			huserinfo.setPass(req.getParameter("pass"));
			huserinfo.setNick(req.getParameter("nick"));
			huserinfo.setAge(Integer.parseInt(req.getParameter("age")));
			if(req.getParameter("gender").equals("남성")){
				huserinfo.setGender(1);	
			}else if(req.getParameter("gender").equals("여성")){
				huserinfo.setGender(2);	
			}else if(req.getParameter("gender").equals("성별")){
				req.getRequestDispatcher("/healing/join.jsp").forward(req, resp);
			}
			huserinfo.setPhone(req.getParameter("tel1")+"-"+
							req.getParameter("tel2")+"-"+
							req.getParameter("tel3"));
			
			/*String bunji = req.getParameter("question_sel").substring(0,1);
			int sel = Integer.parseInt(bunji);
			huserinfo.setQuestion_sel(sel);
			이게 더 짧고 간편하지만 바꾸기 귀찮으니 참고만 하세요 05.24 */
			
			if(req.getParameter("question_sel").equals("1. 좋아하는음식")){
				huserinfo.setQuestion_sel(1);
			}else if(req.getParameter("question_sel").equals("2. 친구이름")){
				huserinfo.setQuestion_sel(2);
			}else if(req.getParameter("question_sel").equals("3. 초등학교")){
				huserinfo.setQuestion_sel(3);
			}else if(req.getParameter("question_sel").equals("4. 중학교")){
				huserinfo.setQuestion_sel(4);
			}else if(req.getParameter("question_sel").equals("5. 고등학교")){
				huserinfo.setQuestion_sel(5);
			}else if(req.getParameter("question_sel").equals("-선택-")){
				req.getRequestDispatcher("/healing/join.jsp").forward(req, resp);
				//resp.sendRedirect("/TomTest/healing/control?action=insert");
			}
			
		String question = req.getParameter("question").replaceAll("\\s", "");
			huserinfo.setQuestion(question);
			System.out.println(question);
			huserinfo.setLevelno(1);
	
			HDAO dao = new HDAO();
			dao.insert(huserinfo);
			
		}else if(action.equals("findpass")){
			//비밀번호찾기
			HDAO dao = new HDAO();
			String email = req.getParameter("email");
		
			HUserInfo huserinfo = dao.findPass(email);
			
			String bunji = req.getParameter("question_sel").substring(0,1);
			int question_sel = Integer.parseInt(bunji);
			
			if(huserinfo.getQuestion_sel()==question_sel && 
					huserinfo.getQuestion().equals(req.getParameter("question"))){
				System.out.println(huserinfo.getPass());
				req.setAttribute("result", huserinfo.getPass());
				req.getRequestDispatcher("/healing/findpassword.jsp").forward(req, resp);
				//최종 password값은 제대로 들고 오지만  findpassword.jsp화면에 huserinfo.getPass()값
				//보내는 것은 다시 구현해야 함 05.24
				//유효성 검사 아직임 05.24
			}else{
				System.out.println("ㅉㅉ");
				req.setAttribute("result", "fail");
				req.getRequestDispatcher("/healing/findpassword.jsp").forward(req, resp);
			}
		
		}
	
	
	}	
	
}
