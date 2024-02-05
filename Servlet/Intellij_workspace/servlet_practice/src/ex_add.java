import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class ex_add extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");                         // 사용자에게 보내는 인코딩 방식
        resp.setContentType("text/html; charset=UTF-8");            // 사용자가 읽을 인코딩 방식
        PrintWriter out = resp.getWriter();                         // 출력을 위한 선언

        int x = Integer.parseInt(req.getParameter("x"));
        int y = Integer.parseInt(req.getParameter("y"));
        out.println("계산 결과는 "+(x+y));
    }
}
