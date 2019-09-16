import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;
import org.apache.log4j.Logger;

@WebServlet(name = "ZI",urlPatterns = "/ZI")

public class ZI extends HttpServlet {

    private static Logger logger = Logger.getLogger(ZI.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String t = req.getParameter("123");
        if(t.equals("123")){
            resp.sendRedirect("http://www.baidu.com");
        }else{
            logger.debug("This is debug message.");
            // 记录info级别的信息
            logger.info("This is info message.");
            // 记录error级别的信息
            logger.error("This is error message.");

        }
    }
}
