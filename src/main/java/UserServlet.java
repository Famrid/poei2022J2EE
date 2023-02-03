import User.User;
import User.UserApi;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String prenom = req.getParameter("name");
        String nom = req.getParameter("surname");
        String dateDeNaissance = req.getParameter("date");
        String genre = "homme";

        User user = new User(prenom, nom, dateDeNaissance, genre);
        UserApi.addUser(user);
        req.getSession().setAttribute("user", user);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/userInfo.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listeUser", UserApi.getListUser());
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/displayUser.jsp");
        requestDispatcher.forward(req, resp);
    }
}
