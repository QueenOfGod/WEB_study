import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add2")
public class ex_add2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");                         // 사용자에게 보내는 인코딩 방식
        resp.setContentType("text/html; charset=UTF-8");            // 사용자가 읽을 인코딩 방식
        PrintWriter out = resp.getWriter();                         // 출력을 위한 선언

        String[] num_ = req.getParameterValues("num");

        int result = 0;

        for(int i = 0; i < num_.length; i++) {
            int num = Integer.parseInt(num_[i]);
            result += num;
        }

        out.println("result is "+result);
    }
}
