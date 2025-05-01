

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class count
 */
@WebServlet("/count")
public class count extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		//文字数のカウント
		String sentence = request.getParameter("sentence");
		int count = sentence.length();
		
		request.setAttribute("sentence", sentence);
		request.setAttribute("count", count);
		
		//転送
		RequestDispatcher dispatcher = request.getRequestDispatcher("countresult.jsp");
		dispatcher.forward(request, response);
	}

}
