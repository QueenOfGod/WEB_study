import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hi")
public class Output_castring2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");                 // 사용자에게 보내는 인코딩 방식
        resp.setContentType("text/html; charset=UTF-8");    // 사용자에게 이렇게 읽어라 라고 보냄

        PrintWriter out = resp.getWriter();
        for(int i = 0; i < 100; i++){
            out.println((i+1)+" : 안녕 servlet!! <br />");
        }
    }
}
