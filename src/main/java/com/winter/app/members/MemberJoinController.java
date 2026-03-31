package com.winter.app.members;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MemberJoinController
 */
@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberJoinController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/join.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setEmail(email);
		
		try {
			int result = dao.join(dto);
			if(result>0) {
				response.sendRedirect("/member/login");
			}else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/join.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
