package servlet;

import WorkWithDB.WorkWithDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/open")
public class SimpleOpen extends HttpServlet {

    private WorkWithDB workWithDB = new WorkWithDB();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("dataFromDB", workWithDB.connect());
        req.getRequestDispatcher("/DB/WorkWithDB.jsp").forward(req,resp);
    }
}
