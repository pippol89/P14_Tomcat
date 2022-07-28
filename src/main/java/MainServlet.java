import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        System.out.println("we are in main method");

        req.setAttribute("user", "Alexey");
        req.getRequestDispatcher("main.jsp").forward(req, resp);

        System.out.println("currentThreadId: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName());

        HttpSession session = req.getSession();
        System.out.println("Id session:" + session.getId());
    }
}
