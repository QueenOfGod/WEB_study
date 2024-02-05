import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/chooseAdd")
public class choose_add extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");                         // 사용자에게 보내는 인코딩 방식
        resp.setContentType("text/html; charset=UTF-8");            // 사용자가 읽을 인코딩 방식
        PrintWriter out = resp.getWriter();                         // 출력을 위한 선언

        String x_ = req.getParameter("x");
        String y_ = req.getParameter("y");
        String op = req.getParameter("operator");

        int x = 0, y = 0, result = 0;

        if(!x_.equals("")) x = Integer.parseInt(x_);
        if(!y_.equals("")) y = Integer.parseInt(y_);

        if(op.equals("덧셈"))
            result = x + y;
        else
            result = x - y;

        out.println("result is " + result);
    }
}
