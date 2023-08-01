package com.digit.servletSession;



@WebServlet("/mul")
public class multi extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		int num1=(int)(session.getAttribute("num1"));
		int num2=(int)(session.getAttribute("num2"));
		int sum=(int)(session.getAttribute("sum"));
		int mul=num1*num2;
		PrintWriter Writer=resp.getWriter();
		Writer.println(sum+"    "+mul);
		
		
	
	}
}
