package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/respuesta")
public class ServletResponse extends HttpServlet {

private static final long serialVersionUID = 1L;
//Logger milog = Logger.getLogger(Saludo.class.getName());
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
try {
	String nombre=req.getParameter("nombre");
	String empresa=req.getParameter("empresa");
	String rut=req.getParameter("rut");
	String direccion=req.getParameter("direccion");
	String ciudad=req.getParameter("ciudad");
	String pais=req.getParameter("pais");
	int valor1,cantidad1,valor2,cantidad2,valor3,cantidad3,valor4,cantidad4;
	valor1=Integer.parseInt(req.getParameter("valorProducto1")) ;
	cantidad1=Integer.parseInt(req.getParameter("cantidadProducto1")) ;
	valor2=Integer.parseInt(req.getParameter("valorProducto2")) ;
	cantidad2=Integer.parseInt(req.getParameter("cantidadProducto2")) ;
	valor3=Integer.parseInt(req.getParameter("valorProducto3")) ;
	cantidad3=Integer.parseInt(req.getParameter("cantidadProducto3")) ;
	valor4=Integer.parseInt(req.getParameter("valorProducto4")) ;
	cantidad4=Integer.parseInt(req.getParameter("cantidadProducto4")) ;
	
	PrintWriter pw = resp.getWriter();
/*	pw.println("<div class='container'><p>Nombre: "+req.getParameter("nombre") +"</p>");
	pw.println("<p>Nombre: "+req.getParameter("nombre") +"</p>");
	pw.println("<p>Empresa: "+req.getParameter("empresa") +"</p>");
	pw.println("<p>Rut: "+req.getParameter("rut") +"</p>");
	pw.println("<p>Dirección: "+req.getParameter("direccion") +"</p>");
	pw.println("<p>Ciudad: "+req.getParameter("ciudad") +"</p>");
	pw.println("<p>País: "+req.getParameter("pais") +"</p></div>");
	pw.println("<p>Tuerca 1/8 cantidad: "+cantidad1+" valor "+valor1*cantidad1);
	pw.println("<p>Golilla 1/8 cantidad: "+cantidad2+" valor "+valor2*cantidad2);
	pw.println("<p>Perno 1/8 cantidad: "+cantidad3+" valor "+valor3*cantidad3);
	pw.println("<p>Bomba 1/8 cantidad: "+cantidad4+" valor "+valor4*cantidad4);*/
	resp.sendRedirect("respuesta.jsp?nombre="+nombre+"&empresa="+empresa+"&rut="+rut+"&direccion="+direccion+"&ciudad="+ciudad+"&pais="+pais+"&valor1="+valor1+"&cantidad1="+cantidad1+"&valor2="+valor2+"&cantidad2="+cantidad2+"&valor3="+valor3+"&cantidad3="+cantidad3+"&valor4="+valor4+"&cantidad4="+cantidad4);
	} catch (IOException e) {
		//milog.severe(e.getMessage());
}
}
}

