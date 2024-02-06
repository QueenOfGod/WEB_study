import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/chooseAdd2")
public class choose_add2 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");                         // 사용자에게 보내는 인코딩 방식
        resp.setContentType("text/html; charset=UTF-8");            // 사용자가 읽을 인코딩 방식
        PrintWriter out = resp.getWriter();                         // 출력을 위한 선언
        ServletContext application = req.getServletContext();

        String v_ = req.getParameter("v");
        String op = req.getParameter("operator");

        int v = 0;

        if(!v_.equals("")) v = Integer.parseInt(v_);

        // 계산
        if(op.equals("=")){

            int x = (Integer)application.getAttribute("value");
            int y = v;
            String operator = (String)application.getAttribute("op");
            int result = 0;

            if(operator.equals("+"))
                result = x + y;
            else
                result = x - y;

            out.println("result is " + result);
        }
        // 값을 저장
        else {
            application.setAttribute("value", v);
            application.setAttribute("op", op);
        }

        int result = 0;

        if(op.equals("+"))
            result = x + y;
        else
            result = x - y;
    }
}
