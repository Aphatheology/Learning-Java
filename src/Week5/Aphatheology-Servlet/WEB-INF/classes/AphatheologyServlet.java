import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AphatheologyServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String filePath = getServletContext().getRealPath("/mustapha.html");
        String htmlContent = new String(Files.readAllBytes(Paths.get(filePath)));

        pw.write(htmlContent);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Userame: " + username);
        System.out.println("Password: " + password);

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.write("<h1>Username and Password submitted successfully</h1>");
        pw.close();
    }
}