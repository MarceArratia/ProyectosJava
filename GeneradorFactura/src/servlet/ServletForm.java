package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inicio")
public class ServletForm extends HttpServlet {

private static final long serialVersionUID = 1L;
//Logger milog = Logger.getLogger(Saludo.class.getName());

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
try {
	
	req.getServletContext().getRequestDispatcher("/respuesta").forward(req,
			resp);

	} catch (IOException e) {
		//milog.severe(e.getMessage());
}
}
}

