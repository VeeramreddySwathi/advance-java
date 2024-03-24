package OneMoreTime;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class oneMoreTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public oneMoreTimeServlet() {
        super();
        
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
