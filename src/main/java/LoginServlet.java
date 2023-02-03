import User.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private String password = "password";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String passwordForm = req.getParameter("password");
        if(this.password.equals(passwordForm)) {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/userInfo.jsp");
            User user = new User("username", "name", "1989/06/13", "homme");
            req.getSession().setAttribute("user", user);
            requestDispatcher.forward(req, resp);
        } else {
            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/login.jsp");
            req.setAttribute("erreur", "Mauvais identifiants de connexion");
            requestDispatcher.forward(req, resp);
        }
    }
}
