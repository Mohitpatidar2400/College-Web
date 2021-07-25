
import com.medicaps.dao.Userdao;
import com.medicaps.dto.User;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "update",urlPatterns = {"/update"})
public class UpdateServlet extends HttpServlet
{   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        //  String ctx = getServletContext().getContextPath();
            User user = (User)req.getSession().getAttribute("Loginuser");
            
            int userid = user.getUserId();
            String name = req.getParameter("uname");
            String email = req.getParameter("email");
            String phone = req.getParameter("phone");
            
            User usr = new User(userid, name, email, phone);
            
            Userdao dao = new Userdao();
            boolean status = dao.Updateuser(usr);
            
            if(status)
            {
                user.setName(name);
                user.setMail(email);
                user.setPhone(phone);
            }
            
            resp.sendRedirect("fachome.jsp");
    }    
}
